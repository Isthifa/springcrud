package com.example.springcruddemo.services;

import com.example.springcruddemo.entity.Biodata;

import java.util.List;

public interface BiodataService {

    Biodata save(Biodata biodata);

    Biodata updateById(int id,Biodata biodata);

    String delete(int id);

    List<Biodata> getAll();

}
