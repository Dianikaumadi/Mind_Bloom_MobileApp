plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.mindbloomapp"

    // Use 36 only if you have the Android 15 (preview) SDK installed; otherwise set both to 35.
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.mindbloomapp"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions { jvmTarget = "11" }

    // Optional but handy
    // buildFeatures { viewBinding = true }
}

dependencies {
    // AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)          // ensure this resolves to 1.7.0
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)   // 2.1.4 is fine
    implementation(libs.androidx.cardview)
    implementation(libs.androidx.gridlayout)

    // Material Components (XML widgets like Slider live here)
    implementation(libs.material)                    // keep if your catalog is 1.12.0
    implementation("com.google.android.material:material:1.12.0") // hard-pin to fix Slider attrs

    // Tests
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // REMOVE these unless you’re actually using Jetpack Compose:
    // implementation(libs.androidx.material3)
    // implementation(libs.androidx.ui.test)
}
