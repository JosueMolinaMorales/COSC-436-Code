plugins {
    id("java")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

application {
    mainClass.set("menu.Main")
}

// build.gradle.kts (Kotlin syntax)
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}