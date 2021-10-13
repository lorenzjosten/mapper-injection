plugins {
    id("de.lj.kotlin-conventions")
    id("de.lj.mapstruct-conventions")
    id("io.quarkus") version("2.4.0.CR1")
}

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:2.4.0.CR1"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy-reactive")
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
}
