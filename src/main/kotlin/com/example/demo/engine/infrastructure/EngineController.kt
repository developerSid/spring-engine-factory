package com.example.demo.engine.infrastructure

import com.example.demo.engine.EngineDto
import com.example.demo.engine.EngineFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController()
class EngineController @Autowired constructor(
    private val engineFactory: EngineFactory
) {

    @GetMapping(path = ["/api/engine/{vehicle}"])
    fun fetchEngine(@PathVariable("vehicle") vehicle: String): EngineDto? =
        engineFactory.findEngine(vehicle)
            ?.let { EngineDto(it) } // FIXME would expect when this returns null to have the server respond with 404, but it doesn't for some reason.
}