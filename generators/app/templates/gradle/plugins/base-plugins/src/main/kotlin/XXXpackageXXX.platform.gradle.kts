plugins {
    id("java-platform")
    id("<%= package %>.base")
    id("<%= package %>.dependency-analysis-platform")
}

// Depend on other Platforms/BOMs to align versions for libraries that consist of multiple components (like Jackson)
javaPlatform.allowDependencies()
