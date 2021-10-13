package de.lj

import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.maven
import org.gradle.kotlin.dsl.repositories
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("de.lj.java-conventions")
    kotlin("jvm")
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
    gradlePluginPortal()
}

tasks.withType<KotlinCompile> {
    targetCompatibility = "11"
    sourceCompatibility = "11"
    kotlinOptions.jvmTarget = "11"
}
