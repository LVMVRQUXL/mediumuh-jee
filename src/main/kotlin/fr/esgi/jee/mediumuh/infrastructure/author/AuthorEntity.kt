package fr.esgi.jee.mediumuh.infrastructure.author

import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "author")
data class AuthorEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: UUID,

        @Column(nullable = false)
        val firstName: String,

        @Column(nullable = false)
        val lastName: String,

        @Column(nullable = false)
        val creation: LocalDateTime = LocalDateTime.now()
)