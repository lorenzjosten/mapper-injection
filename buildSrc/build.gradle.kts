val quarkusPluginVersion: String by project

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
    gradlePluginPortal()
}

dependencies {
    implementation("io.quarkus:gradle-application-plugin:${quarkusPluginVersion}")
}