plugins {
    id("base")
    id("<%= package %>.dependency-rules")
}

// Set the group (some components will be published)
group = "<%= package %>.product"

// Set the version from 'version.txt'
version = providers.fileContents(
    rootProject.layout.projectDirectory.file("gradle/version.txt")).asText.getOrElse("")
