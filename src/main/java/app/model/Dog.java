package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "\u001b[34mI'm a Dog\u001b[0m";
    }
}
