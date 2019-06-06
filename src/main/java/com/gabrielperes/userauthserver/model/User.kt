package com.gabrielperes.userauthserver.model

import javax.persistence.*

@Entity(name = "User")
@Table(name = "user", schema = "userSch")
class User {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null

    @Column(name = "username", nullable = false)
    var username: String? = null

    @Column(name = "recoveryEmail", nullable = false)
    var recoveryEmail: String? = null

    @PrePersist
    private fun prePersist() {
        this.id = null
    }


}
