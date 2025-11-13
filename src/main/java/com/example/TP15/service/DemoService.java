package com.example.TP15.service;

import io.micrometer.core.instrument.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    public String processData() {
        // Incrémentation d'un compteur personnalisé
        Metrics.counter("custom.requests.count").increment();

        logger.info("Requête enregistrée dans Prometheus");
        return "Traitement terminé";
    }
}