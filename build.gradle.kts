import org.gradle.api.tasks.JavaExec

plugins {
    id("java")
    id("application")
}

application {
    mainClass.set("org.example.Anagrams")
}

tasks.register("anagramChecker", JavaExec::class) {
    group = "application"
    mainClass.set("org.example.Anagrams")
    classpath = sourceSets["main"].runtimeClasspath
    if (project.hasProperty("appArgs")) {
        args = (findProperty("appArgs") as String).split(",")
    }
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}