package com.mani.springboot.mydiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mani.springboot.mydiary.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
