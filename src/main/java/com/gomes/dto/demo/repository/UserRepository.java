package com.gomes.dto.demo.repository;

import com.gomes.dto.demo.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
