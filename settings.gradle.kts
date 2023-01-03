plugins {
    id("com.gradle.enterprise") version("3.12.1")
}

...

gradleEnterprise {
    server = "https://events.gradle.com/"
}