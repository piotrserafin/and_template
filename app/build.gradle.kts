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

    // Workaround:
    // https://github.com/Kotlin/kotlinx.coroutines/issues/1064
    packagingOptions {
        pickFirst("META-INF/atomicfu.kotlin_module")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Core
    implementation(Deps.kotlin_stdlib)
    implementation(Deps.appcompat)
    implementation(Deps.core_ktx)
    implementation(Deps.constraintlayout)

    // Kotlin Android Coroutines
    implementation(Deps.coroutines_core)
    implementation(Deps.coroutines_android)

    // Navigation
    implementation(Deps.navigation_fragment_ktx)
    implementation(Deps.navigation_ui_ktx)

    // Room
    implementation(Deps.room_runtime)
    implementation(Deps.room_ktx)
    kapt(Deps.room_compiler)

    // Test
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.runner)
    androidTestImplementation(Deps.espresso_core)
}
