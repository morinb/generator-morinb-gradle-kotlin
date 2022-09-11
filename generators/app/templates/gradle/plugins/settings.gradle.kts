pluginManagement {
    includeBuild("../settings")
}
plugins {
    id("<%= package %>.settings")
}

dependencyResolutionManagement {
    repositories.gradlePluginPortal()
}
