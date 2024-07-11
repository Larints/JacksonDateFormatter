package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Event event = new Event("Test event", LocalDateTime.now());
        System.out.println(objectMapper.writeValueAsString(event));
    }
}