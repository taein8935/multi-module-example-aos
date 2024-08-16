plugins {
    alias(libs.plugins.multi.module.android.library.compose)
}

android {
    namespace = "com.multi.module.core.presentation.designsystem"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}