package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Girl {

    Outfit outfit;

    public Girl(Naked naked) {
        this.outfit = naked;
    }

    // GET
    // SET
}
