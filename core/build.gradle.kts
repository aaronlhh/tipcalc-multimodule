plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = "com.example.tiptime"
version = "1.0"

repositories {
    google()
    mavenCentral()
}

dependencies {
}

kotlin {
    jvmToolchain(17)
}
