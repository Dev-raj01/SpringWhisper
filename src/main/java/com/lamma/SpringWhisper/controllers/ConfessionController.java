package com.lamma.SpringWhisper.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/confession")
public class ConfessionController {
    @GetMapping
    public String getConfession() {
        return "<h1>Hi, this is /confession endpoint </h1>";
    }
    @GetMapping("/{id}")
    public String getConfessionById(@PathVariable int id) {
        return "<h1>Hi, this is /confession/something endpoint</h1>" + id;
    }
    @PostMapping
    public String postConfession() {
        return "<h1>Hi, this is /confession endpoint</h1>";
    }
    @DeleteMapping("/{id}")
    public String deleteConfession(@PathVariable int id) {
        return "<h1>Hi, this is /confession/something endpoint</h1>" + id;
    }
}
