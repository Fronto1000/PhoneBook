package ru.fronto1000;

import java.util.ArrayList;

public class Contact {
    private String name;
    private ArrayList<String> numbers;

    public Contact(String name, ArrayList<String> numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getNumbers() {
        return numbers;
    }
}
