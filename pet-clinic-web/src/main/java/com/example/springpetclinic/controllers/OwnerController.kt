package com.example.springpetclinic.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("owners")
@Controller
class OwnerController {

    @RequestMapping("", "/", "/index", "/index.html")
    fun listOwners(): String {
        return "owners/index"
    }
}