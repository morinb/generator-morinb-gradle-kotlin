"use strict";
const path = require("path");
const assert = require("yeoman-assert");
const helpers = require("yeoman-test");

describe("generator-morinb-gradle-kotlin:app", () => {
  beforeAll(() => {
    return helpers
      .run(path.join(__dirname, "../generators/app"))
      .withPrompts({ projectName: "test" });
  });

  it("creates files", () => {
    assert.file(["settings.gradle.kts", "build.gradle.kts"]);
  });
});
