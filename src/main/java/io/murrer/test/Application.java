package io.murrer.test;

import java.io.IOException;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(Application.class.getResourceAsStream("/application.properties"));
            System.out.println(properties.get("message"));
        } catch (IOException e) {
            System.out.println(String.format("Failed to load application.properties. Cause was '%s'", e.getClass()));
        }
    }
}
