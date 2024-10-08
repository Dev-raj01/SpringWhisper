package com.lamma.SpringWhisper.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lamma.SpringWhisper.model.ConfessionModel;
import com.lamma.SpringWhisper.service.ConfessionService;

@RestController
@RequestMapping("/confession")
public class ConfessionController {
    @Autowired
    ConfessionService confessionService;

    @GetMapping
    public List<ConfessionModel> getConfession() {
        return confessionService.getConfession();
    }
    @GetMapping("/{id}")
    public ConfessionModel getConfessionById(@PathVariable String id) {
        return confessionService.getConfessionById(id);
    }
    @PostMapping
    public void saveConfession(@RequestBody ConfessionModel confessionModel) {
        confessionService.saveConfession(confessionModel);
    }
    @DeleteMapping("/{id}")
    public void deleteConfession(@PathVariable String id) {
        confessionService.deleteConfession(id);
    }
}
