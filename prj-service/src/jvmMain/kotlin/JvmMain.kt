import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.content.*
import io.ktor.routing.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.websocket.*
import java.io.File


fun main() {
    println("=".repeat(50))
    println("Working folder ${File(".").canonicalPath}")
    embeddedServer(CIO, port = 8080, module = Application::module).apply { start(wait = true) }
}

fun Application.module() {

    install(WebSockets)
    install(Compression)
    val webDir = File("./wwwroot")
    routing {
        static("/") {
            files(webDir)
            default(webDir.resolve("index.html"))
        }
    }
}
