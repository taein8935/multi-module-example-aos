plugins {
    alias(libs.plugins.multi.module.android.presentation.ui)
}

android {
    namespace = "com.multi.module.home.presentation"
}

dependencies {
    implementation(projects.home.domain)
}