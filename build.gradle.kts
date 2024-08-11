// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

    alias(libs.plugins.sonar.kotlin.android)


}
sonar {
    properties {
        property("sonar.projectKey", "hibernate1_cicddemoandroid")
        property("sonar.organization", "hibernate1")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.sources", "src/main/java")
        property ("sonar.tests", "src/test/java")
        property ("sonar.java.binaries", "build/classes")
        property ("sonar.junit.reportPaths", "build/test-results/testDebugUnitTest")

    }
}
