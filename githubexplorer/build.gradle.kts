import com.android.build.gradle.internal.dsl.TestOptions
import timoptr.multiselectablelist.Libs

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}
android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId ="timoptr.githubexplorer"
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(Libs.kotlin)

    implementation(Libs.designLib)
    implementation(Libs.supportV4)
    implementation(Libs.appCompatLib)
    implementation(Libs.constraintLayout)
    implementation(Libs.pagingLib)
    implementation(Libs.lifecycleRuntime)
    implementation(Libs.lifecycleExtension)
    implementation(project(":multiselectablerecyclerview"))

    implementation(Libs.rxJava)
    implementation(Libs.rxAndroid)
    implementation(Libs.rxKotlin)
    implementation(Libs.rxLint)
    implementation(Libs.retrofitRxAdapter)

    implementation(Libs.retrofit)
    implementation(Libs.gson)
    implementation(Libs.gsonConverter)

    implementation(Libs.coroutines)

    implementation(Libs.leakCanary)


    add("androidTestImplementation", Libs.testRunner)
    add("androidTestImplementation", Libs.testExtJunit) {
        exclude(module = "junit") // bug in beta01 where junit dependencies isn't resolve well
    }
    add("androidTestImplementation", Libs.espressoCore)
    add("androidTestImplementation", Libs.testRules)

    testImplementation(Libs.jUnit)
    testImplementation(Libs.kotlinTest)
    testImplementation(Libs.kotlinTestJunit)

}
