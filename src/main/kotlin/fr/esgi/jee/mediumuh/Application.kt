package fr.esgi.jee.mediumuh

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
internal class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<Application>(*args)
        }
    }
}
