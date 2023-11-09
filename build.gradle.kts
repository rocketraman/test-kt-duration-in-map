@file:Suppress("UnusedPrivateMember")

plugins {
  kotlin("multiplatform")
  alias(libs.plugins.kotest.multiplatform)
}

group = "com.rocketraman"
version = "1.0-SNAPSHOT"

kotlin {
  js(IR) {
    browser()
  }
  sourceSets {
    all {
      languageSettings {
        languageVersion = "1.9"
        progressiveMode = true
      }
    }
    val commonTest by getting {
      dependencies {
        implementation(kotlin("test"))
        implementation(libs.kotest.assertions.core)
        implementation(libs.kotest.framework.engine)
      }
    }
  }
}
