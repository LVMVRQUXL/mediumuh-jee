package fr.esgi.jee.mediumuh.exposition

import fr.esgi.jee.mediumuh.domain.author.Author
import fr.esgi.jee.mediumuh.domain.author.AuthorAlreadyExistsException
import fr.esgi.jee.mediumuh.domain.author.AuthorService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/api/authors")
data class AuthorController(val authorService: AuthorService) {

    @GetMapping
    fun findAll(): List<Author> = authorService.findAll()

    @PostMapping
    fun save(@RequestBody authorRequest: AuthorRequest): ResponseEntity<Author> {
        return try {
            val author = authorService.save(authorRequest)
            ResponseEntity.created(URI.create("/api/authors/${author.id}")).build()
        } catch (e: AuthorAlreadyExistsException) {
            ResponseEntity.status(HttpStatus.CONFLICT).build()
        }
    }
}
