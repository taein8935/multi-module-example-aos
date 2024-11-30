plugins {
   `kotlin-dsl`
}

group = "com.multi.module.buildlogic"

dependencies {
   compileOnly(libs.android.gradlePlugin)
   compileOnly(libs.android.tools.common)
   compileOnly(libs.kotlin.gradlePlugin)
   compileOnly(libs.ksp.gradlePlugin)
   compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
   plugins {
      register("androidApplication") {
         id = "multi.module.android.application"
         implementationClass = "AndroidApplicationConventionPlugin"
      }
      register("androidApplicationCompose") {
         id = "multi.module.android.application.compose"
         implementationClass = "AndroidApplicationComposeConventionPlugin"
      }
      register("androidLibrary") {
         id = "multi.module.android.library"
         implementationClass = "AndroidLibraryConventionPlugin"
      }
      register("androidLibraryCompose") {
         id = "multi.module.android.library.compose"
         implementationClass = "AndroidLibraryComposeConventionPlugin"
      }
      register("androidPresentationUI") {
         id = "multi.module.android.presentation.ui"
         implementationClass = "AndroidPresentationUIConventionPlugin"
      }
      register("androidRoom") {
         id = "multi.module.android.room"
         implementationClass = "AndroidRoomConventionPlugin"
      }
      register("jvmLibrary") {
         id = "multi.module.jvm.library"
         implementationClass = "JvmLibraryConventionPlugin"
      }
   }
}