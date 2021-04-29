package fr.esgi.jee.mediumuh.domain.author

import fr.esgi.jee.mediumuh.exposition.AuthorRequest
import fr.esgi.jee.mediumuh.infrastructure.author.AuthorEntity
import fr.esgi.jee.mediumuh.infrastructure.author.IAuthorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
data class AuthorService(val authorRepository: IAuthorRepository) {
    fun findAll(): List<Author> {
        val entities = authorRepository.findAll()
        return entities.map { entity -> AuthorMapper().from(entity) }
    }

    fun save(author: AuthorRequest): Author {
        val authorEntity = AuthorEntity(UUID.randomUUID(), author.firstName, author.lastName)

        if (authorRepository.existsById(authorEntity.id)) {
            throw AuthorAlreadyExistsException()
        }

        val authorSaved = authorRepository.save(authorEntity)

        return AuthorMapper().from(authorSaved)
    }
}