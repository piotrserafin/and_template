plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")

    id("jacoco-android")
    id("androidx.navigation.safeargs.kotlin")
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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Deps.kotlin_stdlib)
    implementation(Deps.appcompat)
    implementation(Deps.core_ktx)
    implementation(Deps.constraintlayout)

    testImplementation(Deps.junit)
    androidTestImplementation(Deps.runner)
    androidTestImplementation(Deps.espresso_core)
}
