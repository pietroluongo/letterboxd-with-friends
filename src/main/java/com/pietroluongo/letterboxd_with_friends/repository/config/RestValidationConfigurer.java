package com.pietroluongo.letterboxd_with_friends.repository.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;

@Component
public class RestValidationConfigurer implements RepositoryRestConfigurer {
    @Autowired
    private final Validator validator;

    public RestValidationConfigurer(Validator v) {
        this.validator = v;
    }

    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
        validatingListener.addValidator("beforeCreate", validator);
        validatingListener.addValidator("beforeSave", validator);
    }

}