package timoptr.multiselectablelist

/**
 * In this file you need to put all your dependencies.
 */


object Versions {
    //Language
    const val kotlin = "1.3.31"
    const val jacocoTool = "0.8.1"

    const val espresso = "3.1.0-beta01"
    const val runner = "1.1.0-beta01"
    const val rules = "1.1.0-beta01"
    const val testCore = "1.0.0-beta01"
    const val testExt = "1.0.0-beta01"
    const val supportLibraries = "1.0.0"
    const val constraintLayout = "1.1.2"
    const val paging = "2.0.0"
    const val lifecycleRuntime = "2.0.0"
    const val lifecycleExtension = "2.0.0"
    const val archCoreTesting = "2.0.0"
    const val jUnit = "4.12"
    const val rxKotlin = "2.3.0"
    const val rxAndroid = "2.1.0"
    const val rxJava = "2.2.4"
    const val rxLint = "1.7.1"
    const val retrofit = "2.5.0"
    const val okhttp = "3.10.0"
    const val gson = "2.8.5"
    const val loggingInterceptor = "3.10.0"
    const val gsonConverter = "2.4.0"
    const val leakCanary = "1.6.2"
    const val coroutinesAndroid = "1.1.0"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
    const val kotlinTestJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    const val testRunner = "androidx.test:runner:${Versions.runner}"
    const val testCore = "androidx.test:core:${Versions.testCore}"
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExt}"
    const val testRules = "androidx.test:rules:${Versions.rules}"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
    const val leakCanaryNoOp = "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakCanary}"
    const val appCompatLib = "androidx.appcompat:appcompat:${Versions.supportLibraries}"
    const val designLib = "com.google.android.material:material:${Versions.supportLibraries}"
    const val supportV4 = "androidx.legacy:legacy-support-v4:${Versions.supportLibraries}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val pagingLib = "androidx.paging:paging-runtime:${Versions.paging}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycleRuntime}"
    const val lifecycleExtension = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExtension}"
    const val archCoreTesting = "androidx.arch.core:core-testing:${Versions.archCoreTesting}"
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val rxLint = "nl.littlerobots.rxlint:rxlint:${Versions.rxLint}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"
}
