package com.sts.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
