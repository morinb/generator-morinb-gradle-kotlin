pluginManagement {
    includeBuild("gradle/settings")
}
plugins {
    id("<%= package %>.settings")
}

rootProject.name = "<%= projectName %>"
