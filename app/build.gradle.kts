plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")

    id("jacoco-android")
    id("androidx.navigation.safeargs.kotlin")
}

jacoco {
    toolVersion = Versions.jacoco
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

    // Material
    implementation(Deps.material)

    // Kotlin Android Coroutines
    implementation(Deps.Coroutines.core)
    implementation(Deps.Coroutines.android)

    // Kodein
    implementation(Deps.Kodein.generic_jvm)
    implementation(Deps.Kodein.framework_androidx)

    // Navigation
    implementation(Deps.Arch.Navigation.fragment_ktx)
    implementation(Deps.Arch.Navigation.ui_ktx)

    // Lifecycle
    implementation(Deps.Arch.Lifecycle.extension)
    implementation(Deps.Arch.Lifecycle.viewmodel_ktx)
    testImplementation(Deps.Arch.Lifecycle.core_testing)
    kapt(Deps.Arch.Lifecycle.compiler)

    // Room
    implementation(Deps.Arch.Room.runtime)
    implementation(Deps.Arch.Room.ktx)
    testImplementation(Deps.Arch.Room.testing)
    kapt(Deps.Arch.Room.compiler)

    // WorkManager
    implementation(Deps.Arch.WorkManager.work)
    androidTestImplementation(Deps.Arch.WorkManager.testing)

    // Paging
    implementation(Deps.Arch.paging)

    // Preference
    implementation(Deps.Arch.preference)

    // Retrofit
    implementation(Deps.Retrofit.retrofit)
    implementation(Deps.Retrofit.converter_gson)
    implementation(Deps.Retrofit.converter_scalars)
    implementation(Deps.Retrofit.coroutines_adapter)

    // Glide
    implementation(Deps.Glide.glide)
    kapt(Deps.Glide.compiler)

    // GSON
    implementation(Deps.gson)

    // Timber
    implementation(Deps.timber)

    // Test
    testImplementation(Deps.junit)
    androidTestImplementation(Deps.runner)
    androidTestImplementation(Deps.espresso_core)
}
