object Versions {

    const val kotlin = "1.3.30"
    const val android_gradle_plugin = "3.3.2"
    const val navigation_safe_args_gradle_plugin = "2.1.0-alpha02"

    const val appcompat = "1.1.0-alpha04"
    const val core_ktx = "1.1.0-alpha05"
    const val constraintlayout = "1.1.3"

    const val jacoco_android = "0.1.4"

    const val junit = "4.12"
    const val runner = "1.2.0-alpha03"
    const val espresso_core = "3.2.0-alpha03"
}

object Deps {
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"

    const val navigation_safe_args_gradle_plugin =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation_safe_args_gradle_plugin}"

    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"

    const val jacoco_android = "com.dicedmelon.gradle:jacoco-android:${Versions.jacoco_android}"

    const val junit = "junit:junit:${Versions.junit}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
}