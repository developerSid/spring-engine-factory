package com.example.demo.engine

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class EngineFactory @Autowired constructor(
    val engines: List<Engine>
) {
    private val logger: Logger = LoggerFactory.getLogger(EngineFactory::class.java)

    @Cacheable("engines")
    fun findEngine(vehicle: String): Engine? {
        logger.info("Searching for engine for vehicle {}", vehicle)

        return engines.firstOrNull { it.fitsVehicle(vehicle) }
    }
}