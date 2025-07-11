plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.androidmvvm06weatherapp"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.androidmvvm06weatherapp"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Compose Runtime
    val rt_version = "1.8.3"
    implementation ("androidx.compose.runtime:runtime:$rt_version")
    implementation ("androidx.compose.runtime:runtime-livedata:$rt_version")
    implementation ("androidx.compose.runtime:runtime-rxjava2:$rt_version")

    // Retrofit
    val rf_version = "3.0.0"
    implementation("com.squareup.retrofit2:retrofit:$rf_version")
    // Retrofit with Gson Converter
    implementation("com.squareup.retrofit2:converter-gson:$rf_version")

    // Coil
    val coil_version = "2.7.0"
    implementation("io.coil-kt:coil-compose:$coil_version")
}