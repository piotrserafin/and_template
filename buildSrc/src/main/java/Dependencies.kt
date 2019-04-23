object Versions {

    // Plugins
    const val kotlin = "1.3.30"
    const val android_gradle_plugin = "3.4.0"
    const val navigation_safe_args_gradle_plugin = "2.1.0-alpha02"
    const val jacoco_android_plugin = "0.1.4"

    // Jacoco
    const val jacoco = "0.8.3"

    // Core
    const val appcompat = "1.1.0-alpha04"
    const val core_ktx = "1.1.0-alpha05"
    const val constraintlayout = "1.1.3"

    const val core_testing = "2.1.0-alpha01"

    // Material
    const val material = "1.0.0"

    // Arch
    const val navigation = "2.1.0-alpha02"
    const val room = "2.1.0-alpha06"
    const val lifecycle = "2.1.0-alpha04"
    const val work = "2.0.1"
    const val paging = "2.1.0"
    const val preference = "1.1.0-alpha04"

    // Kotlin Android Coroutines
    const val coroutines = "1.2.0"

    // Kodein
    const val kodein = "6.2.0"

    // GSON
    const val gson = "2.8.5"

    // Retrofit
    const val retrofit = "2.5.0"
    const val retrofit_coroutines_adapter = "0.9.2"

    // Glide
    const val glide = "4.9.0"

    // Timber
    const val timber = "4.7.1"

    // Test
    const val junit = "4.12"
    const val runner = "1.2.0-alpha03"
    const val espresso_core = "3.2.0-alpha03"
}

object Deps {

    // Plugins
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    const val navigation_safe_args_gradle_plugin =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation_safe_args_gradle_plugin}"
    const val jacoco_android_plugin =
            "com.dicedmelon.gradle:jacoco-android:${Versions.jacoco_android_plugin}"

    // Core
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"

    // Material
    const val material = "com.google.android.material:material:${Versions.material}"

    object Arch {

        object Navigation {
            const val fragment_ktx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
            const val ui_ktx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        }

        object Room {
            const val runtime = "androidx.room:room-runtime:${Versions.room}"
            const val compiler = "androidx.room:room-compiler:${Versions.room}"
            const val testing = "androidx.room:room-testing:${Versions.room}"
            const val ktx = "androidx.room:room-ktx:${Versions.room}"
        }

        object Lifecycle {
            const val extension = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
            const val compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
            const val viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
            const val core_testing = "androidx.arch.core:core-testing:${Versions.core_testing}"
        }

        object WorkManager {
            const val work = "androidx.work:work-runtime-ktx:${Versions.work}"
            const val testing = "androidx.work:work-testing:${Versions.work}"
        }

        const val paging = "androidx.paging:paging-runtime:${Versions.paging}"
        const val preference = "androidx.preference:preference-ktx:${Versions.preference}"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    }

    object Kodein {
        const val generic_jvm = "org.kodein.di:kodein-di-generic-jvm:${Versions.kodein}"
        const val framework_androidx = "org.kodein.di:kodein-di-framework-android-x:${Versions.kodein}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val converter_scalars = "com.squareup.retrofit2:converter-scalars:${Versions.retrofit}"
        const val coroutines_adapter =
                "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofit_coroutines_adapter}"
    }

    object Glide {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }

    // GSON
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    // Timber
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    // Test
    const val junit = "junit:junit:${Versions.junit}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
}