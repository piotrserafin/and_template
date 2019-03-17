import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")

    id("jacoco-android")
}

jacoco {
    toolVersion = "0.8.3"
}

tasks.all {
    when(this) {
        is JacocoTaskExtension -> {
            isIncludeNoLocationClasses = true
        }
    }
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "dev.piotrserafin.pwr_nasa"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            isTestCoverageEnabled = false
        }

        getByName("debug") {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-debug"
            isTestCoverageEnabled = true
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin(module = "stdlib-jdk7", version = KotlinCompilerVersion.VERSION))

    implementation("androidx.appcompat:appcompat:1.1.0-alpha03")
    implementation("androidx.core:core-ktx:1.1.0-alpha05")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")

    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.2-alpha02")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0-alpha02")
}
