plugins {
    kotlin("multiplatform") version "1.6.10"
    kotlin("plugin.serialization") version "1.6.10"
}

allprojects {
    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
    }
}

kotlin {
    jvm { }
//    js(IR) { browser() }
//    sourceSets {
//        val commonMain by getting
//        val commonTest by getting
//        val jvmMain by getting
//        val jvmTest by getting
//        val jsMain by getting
//        val jsTest by getting
//    }
}

tasks {
//    wrapper {
//        gradleVersion = "7.3"
//    }
}