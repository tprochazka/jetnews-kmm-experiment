package cz.atomsoft.kmm.test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform