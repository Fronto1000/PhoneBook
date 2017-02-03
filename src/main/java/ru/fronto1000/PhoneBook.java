package ru.fronto1000;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String,ArrayList<String>> contacs;

    public PhoneBook() {
        this.contacs = new HashMap<String, ArrayList<String>>();

        ArrayList<String> numbers1 = new ArrayList<String>();
        numbers1.add("+8 800 2000 500");
        numbers1.add("+8 800 200 600");
        Contact cont1 = new Contact("Иванов И.И.",numbers1);
        contacs.put(cont1.getName(),cont1.getNumbers());

        ArrayList<String> numbers2 = new ArrayList<String>();
        numbers2.add("+8 800 2000 700");
        Contact cont2 = new Contact("Петров П.П.",numbers2);
        contacs.put(cont2.getName(),cont2.getNumbers());

        ArrayList<String> numbers3 = new ArrayList<String>();
        numbers3.add("+8 800 2000");
        numbers3.add("+8 800 2000 900");
        numbers3.add("+8 800 2000 000");
        Contact cont3 = new Contact("Сидоров С.С.",numbers3);
        contacs.put(cont3.getName(),cont3.getNumbers());
    }

    public void getContact(String name){
        ArrayList<String> numbers = this.contacs.get(name);
        if(numbers != null) {
            for (String number : numbers) {
                System.out.println(number);
            }
        }else {
            System.out.println("Такого ФИО в БД нет");
        }
    }
}
