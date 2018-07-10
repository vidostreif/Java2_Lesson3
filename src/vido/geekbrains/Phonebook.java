package vido.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public void add(String surname, String phone){
        ArrayList<String> res = phonebook.get(surname);

        if (res == null){
            res = new ArrayList();
        }
        res.add(phone);

        phonebook.put(surname, res);
    }

    public void get(String surname){
        ArrayList<String> res = phonebook.get(surname);

        if (res == null){
            System.out.println("Телефоны для " + surname + " отсутсвуют.");
        }else {
            System.out.println("Телефоны " + surname + ":");

            for (String phone : res) {
                System.out.println(phone);
            }
        }
    }
}
