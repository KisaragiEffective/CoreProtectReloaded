import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.net.URI

plugins {
    java
    kotlin("jvm").version("1.3.40")
    maven
}

group = "com.github.kisaragieffective"
version = "0.1.0"

repositories {
    mavenCentral()
    maven {
        url = URI("https://hub.spigotmc.org/nexus/content/repositories/public")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
    testCompile(group = "junit", name = "junit", version = "4.12")
}

val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks

compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
