package fr.esgi.jee.mediumuh.infrastructure

import javax.persistence.*

@Entity
data class AuthorEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: String,

        @Column(nullable = false)
        val firstName: String,

        @Column(nullable = false)
        val lastName: String
)