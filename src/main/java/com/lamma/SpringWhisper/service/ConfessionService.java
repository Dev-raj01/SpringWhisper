package com.lamma.SpringWhisper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamma.SpringWhisper.model.ConfessionModel;
import com.lamma.SpringWhisper.repository.ConfessionRepo;

@Service
public class ConfessionService {
    @Autowired
    ConfessionRepo confessionRepo;

    public List<ConfessionModel> getConfession() {
        return confessionRepo.findAll();
    }
    public ConfessionModel getConfessionById(String id) {
        return confessionRepo.findById(id).get();
    }
    public void saveConfession(ConfessionModel confessionModel) {
        confessionRepo.save(confessionModel);

    }
    public void deleteConfession(String id) {
        confessionRepo.deleteById(id);
    }
}
