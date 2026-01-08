plugins {
    `java`
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")
    group = "br.dev.tioback.codility"
    version = "0.1.0"

    java {
        toolchain {
            languageVersion.set(org.gradle.jvm.toolchain.JavaLanguageVersion.of(25))
        }
    }

    dependencies {
        "testImplementation"("org.junit.jupiter:junit-jupiter:5.9.3")
        // Ensure JUnit Platform launcher is available at test runtime
        "testRuntimeOnly"("org.junit.platform:junit-platform-launcher:1.9.3")
    }

    tasks.test {
        useJUnitPlatform()
    }
}
