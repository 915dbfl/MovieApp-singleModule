// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    // 어떤 레포지토리에서 해당 값들을 나져오냐를 설정
    repositories {
        google()
        mavenCentral()
    }
    dependencies{
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.46.1")
    }
}
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}