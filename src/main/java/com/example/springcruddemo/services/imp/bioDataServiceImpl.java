package com.example.springcruddemo.services.imp;

import com.example.springcruddemo.entity.Biodata;
import com.example.springcruddemo.repository.bioDataRepository;
import com.example.springcruddemo.services.BiodataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class bioDataServiceImpl implements BiodataService {

   //constructor injection
    private bioDataRepository bioDataRepository;
    @Autowired
    public bioDataServiceImpl(bioDataRepository bioRepository) {
        this.bioDataRepository = bioRepository;
    }
    @Override
    public Biodata save(Biodata biodata) {
        return bioDataRepository.save(biodata);
    }

    @Override
    public Biodata updateById(int id,Biodata biodata) {
        Biodata data= bioDataRepository.findById(id).get();
        Biodata updatedData = new Biodata();
        updatedData.setId(data.getId());
        updatedData.setName(biodata.getName());
        updatedData.setAddress(biodata.getAddress());
        updatedData.setPhone(biodata.getPhone());
        return bioDataRepository.save(updatedData);
    }

    @Override
    public String delete(int id) {
        Biodata data= bioDataRepository.findById(id).get();
        if(data==null) {
            return "Data not found";
        }else {
            bioDataRepository.delete(data);
            return "Data deleted";
        }
    }

    @Override
    public List<Biodata> getAll() {
        return bioDataRepository.findAll();
    }
}
