package fr.esgi.jee.mediumuh.domain.author

import fr.esgi.jee.mediumuh.infrastructure.AuthorEntity

class AuthorMapper {
    fun from(authorEntity: AuthorEntity): Author = Author(authorEntity.id, authorEntity.firstName, authorEntity.lastName)
}
