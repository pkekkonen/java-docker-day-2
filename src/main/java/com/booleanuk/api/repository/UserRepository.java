package com.booleanuk.api.repository;

import com.booleanuk.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username); //spring knows how to search by username

    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

}
