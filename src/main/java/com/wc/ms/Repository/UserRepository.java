package com.wc.ms.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.wc.ms.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

