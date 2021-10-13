package de.lj

val mapstructVersion: String by project

plugins {
    java
    kotlin("kapt")
}

dependencies {
    implementation("org.mapstruct:mapstruct:$mapstructVersion")
    "kapt"("org.mapstruct:mapstruct-processor:$mapstructVersion")
}

kapt {
    keepJavacAnnotationProcessors = true
}
