package com.felipemeirelesdev.workshop.repositories;

import com.felipemeirelesdev.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
