package com.example.demo.engine

interface Engine {
    // these as functions is just a cheap way to illustrate what I'm thinking without having to put much work into it.
    fun horsePower(): Int
    fun cylinders(): Int
    fun supportedVehicles(): Set<String>

    // default provided naive implementation.  This can be overridden and have more rigorous checks provided
    fun fitsVehicle(vehicle: String): Boolean = supportedVehicles().contains(vehicle)
}