package com.example.springcruddemo.controller;

import com.example.springcruddemo.entity.Biodata;
import com.example.springcruddemo.services.BiodataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BioDataController {

    @Autowired
    private BiodataService biodataService;

    @GetMapping("/all")
    public List<Biodata> getAll(){
        return biodataService.getAll();
    }

    @PostMapping("/save")
    public Biodata save(@RequestBody Biodata biodata){
        return biodataService.save(biodata);
    }

    @PutMapping("/update/{id}")
    public Biodata update(@RequestBody Biodata biodata, @PathVariable int id){
        Biodata data= biodataService.updateById(id,biodata);
        return data;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return biodataService.delete(id);
    }
}
