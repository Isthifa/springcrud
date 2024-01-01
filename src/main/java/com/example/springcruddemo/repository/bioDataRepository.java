package com.example.springcruddemo.repository;

import com.example.springcruddemo.entity.Biodata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bioDataRepository extends JpaRepository<Biodata, Integer> {
}
