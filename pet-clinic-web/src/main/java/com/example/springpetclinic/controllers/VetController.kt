package com.example.springpetclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class VetController {

    @RequestMapping("/vets", "/vets/index", "vets/index.html")
    fun listVets(): String {

        return "vets/index";
    }
}