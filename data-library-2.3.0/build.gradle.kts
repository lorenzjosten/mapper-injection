plugins {
    id("de.lj.kotlin-conventions")
    id("de.lj.mapstruct-conventions")
    id("io.quarkus") version("2.3.0.Final")
}

dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:2.3.0.Final"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy-reactive")
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
    implementation("io.quarkus:quarkus-reactive-pg-client")
    implementation("io.quarkus:quarkus-smallrye-reactive-messaging-amqp")
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
}
