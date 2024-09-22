plugins {
    id("java")
}

group = "seoah"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.assertj:assertj-core:3.24.2")
}

tasks.test {
    useJUnitPlatform()
}