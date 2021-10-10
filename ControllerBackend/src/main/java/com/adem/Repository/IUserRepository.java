package com.adem.Repository;

import com.adem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface IUserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findById(int id);
}
