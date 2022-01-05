rootProject.name = "kotlin-mpp"
println("=".repeat(20) + " settings.gradle.kts")
val exclude = setOf("prj-to-exclude")
rootProject.projectDir.listFiles()?.apply {
    filterNotNull()
        .filter { it.isDirectory && it.name.startsWith("prj-") }
        .forEach {
            if (exclude.contains(it.name))
                println(" exclude ${it.name}")
            else {
                println("include(${it.name})")
                include(it.name)
            }
        }
}
