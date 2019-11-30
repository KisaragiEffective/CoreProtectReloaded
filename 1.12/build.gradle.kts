import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.apache.tools.ant.filters.ReplaceTokens
import java.net.URI

plugins {
    java
    kotlin("jvm") version "1.3.50"
    maven
    id("com.github.johnrengelman.shadow") version "4.0.4"
    //this.id() version "5.0.0"
}

group = "com.github.kisaragieffective"
version = "0.1.5"

repositories {
    mavenCentral()
    maven {
        url = URI("https://github.com/KisaragiEffective/maven/")
    }

    maven {
        url = URI("https://hub.spigotmc.org/nexus/content/repositories/public/")
    }
}

tasks.withType(JavaCompile::class.java).all {
    this.options.encoding = "UTF-8"
}

dependencies {
    implementation(fileTree(mapOf("dir" to File("C:\\Users\\Obsidian550D\\Documents\\intellij\\plugin\\CoreProtectReloaded\\1.12\\localDependencies\\"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
    testCompile(group = "junit", name = "junit", version = "4.12")

    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}

val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks

compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

