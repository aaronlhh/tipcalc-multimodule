plugins {
    id("java-library")
    id("application")
}

group = "com.example.tiptime"
version = "1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

application {
    mainClass.set("com.example.tiptime.cli.Main")
}

dependencies {
    implementation(project(":service"))
    implementation(project(":core"))
}
