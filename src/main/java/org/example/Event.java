package org.example;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class Event {
    private String description;
    @JsonSerialize(using = CustomLocalDateTimeParser.class)
    private LocalDateTime eventTime;

    public Event(String description, LocalDateTime eventTime) {
        this.description = description;
        this.eventTime = eventTime;
    }

}
