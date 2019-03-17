// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {

    val kotlinVersion = "1.3.21"

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.3.2")
        classpath(kotlin(module = "gradle-plugin", version = kotlinVersion))

        classpath("com.dicedmelon.gradle:jacoco-android:0.1.4")
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
