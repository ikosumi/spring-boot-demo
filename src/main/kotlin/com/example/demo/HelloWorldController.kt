package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping
@RestController("api/")
class HelloWorldController {
    @GetMapping("hello")
    fun helloWorld(): String = "Hello from a REST controller!"
}
