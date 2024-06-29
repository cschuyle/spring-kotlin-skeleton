package com.example.ktskull

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class TheController {

    @GetMapping
    fun theEndpoint() : String {
        return "Success! You have arrived"
    }
}