plugins {
    id("com.gradle.enterprise") version("3.7")
}

...

gradleEnterprise {
    server = "https://events.gradle.com/"
}