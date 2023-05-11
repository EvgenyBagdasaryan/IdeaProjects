package ru.eugene.velressservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
@RestController
class GetWorldTemperatures {

    @GetMapping("/get_temperature_from_britain_now")
    fun getTemperaturesFromBritain(): String {
        return "30";
    }
}