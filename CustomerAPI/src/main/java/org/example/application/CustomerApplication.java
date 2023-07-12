package org.example.application;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.example.resources.CustomerResources;


import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class CustomerApplication extends Application {
    @Override
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> classes= new HashSet<>();
        classes.add(CustomerResources.class);
        return  classes;
    }
}