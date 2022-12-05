package de.os.backend.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OrderController {

    @GetMapping("/alive")
    public String isAlive(){
        return "Alive";
    }

}
