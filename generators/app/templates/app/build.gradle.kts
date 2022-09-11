plugins {
    id("<%= package %>.application")
}

application {
    mainClass.set("<%= package %>.product.app.ApplicationKt")
}

dependencies {
    providedCompile("jakarta.servlet:jakarta.servlet-api")

    implementation(project(":bespin"))
    implementation(project(":corellia"))
    implementation(project(":kamino"))
    implementation(project(":kashyyyk"))
    implementation(project(":naboo"))
    implementation(project(":tatooine"))
    implementation("com.google.inject.extensions:guice-servlet")
    implementation("com.google.inject:guice")
    implementation("org.slf4j:slf4j-api")

    mockApiImplementation(project(path))
    mockApiApi("com.google.guava:guava")

    testImplementation("org.junit.jupiter:junit-jupiter-api")

    endToEndTestImplementation(project(path)) { capabilities { requireCapabilities("${project.group}:${project.name}-mock-api") } }

    runtimeOnly("org.slf4j:slf4j-simple")
}
