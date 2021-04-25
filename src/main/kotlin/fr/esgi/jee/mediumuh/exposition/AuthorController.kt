package fr.esgi.jee.mediumuh.exposition

import fr.esgi.jee.mediumuh.domain.author.Author
import fr.esgi.jee.mediumuh.domain.author.AuthorService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/authors")
class AuthorController(val authorService: AuthorService) {

    @GetMapping
    fun findAll(): List<Author> = authorService.findAll()
}
