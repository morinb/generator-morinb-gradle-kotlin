plugins {
    id("<%= package %>.kotlin-library-with-test-fixtures")
}

dependencies {
    api("org.apache.poi:poi")

    implementation("commons-io:commons-io")
    implementation("org.apache.poi:poi-ooxml")

    testFixturesApi("com.google.guava:guava")

    testImplementation("org.junit.jupiter:junit-jupiter-api")
}
