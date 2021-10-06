plugins {
    idea
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
    gradlePluginPortal()
}

allprojects {
    apply(plugin = "idea")

    idea {
        module {
            isDownloadSources = true
            isDownloadJavadoc = true
        }
    }
}