package com.example.kyrsavayajava.util;

import com.example.kyrsavayajava.model.Damage;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class JsonReader {

    public Damage[] readJson(String fileName) {
        try (InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(fileName)) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(resourceAsStream, Damage[].class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
