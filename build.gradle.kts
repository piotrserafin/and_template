// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Deps.android_gradle_plugin)
        classpath(Deps.kotlin_gradle_plugin)
        classpath(Deps.jacoco_android_plugin)
        classpath(Deps.navigation_safe_args_gradle_plugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
