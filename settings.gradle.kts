pluginManagement {
  includeBuild("build-logic")
  repositories {
    google {
      content {
        includeGroupByRegex("com\\.android.*")
        includeGroupByRegex("com\\.google.*")
        includeGroupByRegex("androidx.*")
      }
    }
    mavenCentral()
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
  }
}

rootProject.name = "MyIvyKmpProject"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":client:app")
include(":client:core:model")
include(":client:core:model-test")
include(":client:core:common")
include(":client:core:common-test")
include(":client:core:data")
include(":client:core:data-test")
include(":client:core:domain")
include(":client:core:domain-test")
include(":client:core:ui")
include(":client:core:ui-test")
include(":core:model")
include(":core:model-test")


check(JavaVersion.current().isCompatibleWith(JavaVersion.VERSION_17)) {
  """
    CoinList requires JDK 17+ but it is currently using JDK ${JavaVersion.current()}.
    Java Home: [${System.getProperty("java.home")}]
    https://developer.android.com/build/jdks#jdk-config-in-studio
    """.trimIndent()
}
