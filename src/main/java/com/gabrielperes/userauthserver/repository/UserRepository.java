package com.gabrielperes.userauthserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.history.RevisionRepository;

import com.gabrielperes.userauthserver.model.User;

public interface UserRepository extends JpaRepository<User, Long>, RevisionRepository<User, Long, Integer> {

}
