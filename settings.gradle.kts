pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Ecommerce"
include(":app")
include(":buildsSrc")
include(":common")
include(":main")
include(":main:api")
include(":main:impl")
include(":data")
include(":data:api")
include(":data:impl")
include(":product-details")
include(":product-details:api")
include(":product-details:impl")
include(":cart")
include(":cart:api")
include(":cart:impl")
