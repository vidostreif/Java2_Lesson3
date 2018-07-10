package vido.geekbrains;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//        Посчитать сколько раз встречается каждое слово.

//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи.
//        С помощью метода get() искать номер телефона по фамилии. Следует учесть,
//        что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//        тогда при запросе такой фамилии должны выводиться все телефоны.

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        String[] mas = {"Москва", "Самара", "Тольятти", "Казань", "Ростов", "Пенза", "Москва", "Пенза", "Москва", "Самара", "Лондон"};
        countingRepetitionsInArray(mas);

        //Задание 2

        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "89174562545");
        phonebook.add("Иванов", "89174518445");
        phonebook.add("Иванов", "89174569482");
        phonebook.add("Иванов", "89174564825");
        phonebook.add("Петров", "89278456897");
        phonebook.add("Сидоров", "89378459655");
        phonebook.add("Сидоров", "89478945612");

        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Сидоров");
    }


    public static void countingRepetitionsInArray(String[] mas){

        Map<String, Integer> hm = new HashMap<>();

        for (String stroka: mas) {
            Integer res = hm.get(stroka);
            hm.put(stroka, res == null ? 1 : res + 1);
        }

        System.out.println(hm);
    }
}


