package com.example.demo.engine

data class EngineDto (
    val horsePower: Int,
    val cylinders: Int,
    val supportedVehicles: Set<String>
) {

    constructor(engine: Engine) :
        this(
            horsePower = engine.horsePower(),
            cylinders = engine.cylinders(),
            supportedVehicles = engine.supportedVehicles()
        )
}