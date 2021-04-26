package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Client;

public interface ClientRepository extends JpaRepository <Client, Integer> {

}
