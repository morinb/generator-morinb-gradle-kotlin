plugins {
    id("java-platform")
}

dependencies.constraints {
    api("com.autonomousapps:dependency-analysis-gradle-plugin:1.2.0")
    api("de.jjohannes.gradle:java-ecosystem-capabilities:0.4")
    api("de.jjohannes.gradle:missing-metadata-guava:31.1.1")
    api("dev.jacomet.gradle.plugins:logging-capabilities:0.10.0")
    api("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
}
