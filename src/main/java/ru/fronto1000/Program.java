package ru.fronto1000;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя");
        try {
            String name = bufferedReader.readLine();
            phoneBook.getContact(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
