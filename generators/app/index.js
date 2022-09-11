"use strict";
const Generator = require("yeoman-generator");
const chalk = require("chalk");
const yosay = require("yosay");
const glob = require("glob");
const { spawnCommand } = require("yeoman-generator/lib/actions/spawn-command");

module.exports = class extends Generator {
  prompting() {
    return this.prompt([
      {
        type: "input",
        name: "projectName",
        message: "What is your project name ?",
        default: this.appname
      },
      {
        type: "input",
        name: "package",
        message: "What is the package ?",
        default: "com.example." + this.appname
      }
    ]).then(props => {
      // To access props later use this.props.someAnswer;
      this.props = props;
    });
  }

  writing() {
    const files = glob.sync("**", {
      dot: true,
      nodir: true,
      cwd: this.templatePath()
    });

    // eslint-disable-next-line guard-for-in
    for (let index in files) {
      this.fs.copyTpl(
        this.templatePath(files[index]),
        this.destinationPath(
          this.props.projectName +
            "/" +
            files[index]
              .replace(/(XXXpackageXXX)/g, this.props.package)
              .replace(
                /(XXXpackagedirXXX)/g,
                this.props.package.replaceAll(".", "/")
              )
              .replace("_", ".")
        ),
        this.props
      );
    }
  }

  async install() {
    const logFunction = this.log;
    const projectName = this.props.projectName;
    spawnCommand("./gradlew", ["check"], {
      cwd: this.destinationRoot(projectName),
      shell: true,
      stdio: "inherit"
    }).on("exit", function() {
      logFunction(
        yosay(`Your project ${chalk.yellow(projectName)} is initialized !`)
      );
    });
  }
};
