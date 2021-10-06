plugins {
    java
    id("io.quarkus")
}

val quarkusUniverseBomVersion: String by project

dependencies {
    implementation(enforcedPlatform("io.quarkus:quarkus-universe-bom:$quarkusUniverseBomVersion"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy-reactive")
    implementation("io.quarkus:quarkus-resteasy-reactive-jackson")
    implementation("io.quarkus:quarkus-hibernate-reactive-panache")
    implementation("io.quarkus:quarkus-reactive-pg-client")
    implementation("io.quarkus:quarkus-smallrye-reactive-messaging-amqp")
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
}