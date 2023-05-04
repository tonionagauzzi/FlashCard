group "com.vitantonio.nagauzzi.flashcard"
version "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

plugins {
    kotlin("multiplatform") apply false
    kotlin("android") apply false
    kotlin("jvm") version "1.8.20"
    id("com.android.application") apply false
    id("com.android.library") apply false
    id("org.jetbrains.compose") version "1.4.0"
}