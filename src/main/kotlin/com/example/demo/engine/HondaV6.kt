package com.example.demo.engine

import org.springframework.stereotype.Component

@Component // so I don't have to create a factory
class HondaV6: Engine {
    override fun horsePower(): Int = 200
    override fun cylinders(): Int = 6
    override fun supportedVehicles(): Set<String> = setOf("Accord", "Avancier", "Odyssey")
}