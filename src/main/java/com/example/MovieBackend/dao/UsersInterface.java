package com.example.MovieBackend.dao;

import com.example.MovieBackend.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersInterface  extends JpaRepository<UserModel,Integer> {

    List<UserModel> findByUserNameAndPassword(String userName, String password);
}