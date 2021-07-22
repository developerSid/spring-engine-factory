package com.example.demo.engine

import org.springframework.stereotype.Component

@Component // so I don't have to create a factory
class ChevyV8: Engine {
    override fun horsePower(): Int = 300
    override fun cylinders(): Int = 8
    override fun supportedVehicles(): Set<String> = setOf("Chevelle", "442", "GTO")
}