package com.pietroluongo.letterboxd_with_friends.config;

import org.bson.types.ObjectId;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import jakarta.annotation.PostConstruct;

@Configuration
public class JacksonConfig {
    private final ObjectMapper objectMapper;

    public JacksonConfig(ObjectMapper mapper) {
        this.objectMapper = mapper;
    }

    @PostConstruct
    public void registerObjectIdSerializer() {
        SimpleModule module = new SimpleModule();
        module.addSerializer(ObjectId.class, new ToStringSerializer());
        objectMapper.registerModule(module);
    }
}
