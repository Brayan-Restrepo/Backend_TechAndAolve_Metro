package com.metro.metro.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metro.metro.repository.entitity.UserEntity;

@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, String> {

}
