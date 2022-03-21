package com.company;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        /*
Написать программу для учета продуктов в холодильнике.
продукты должны иметь свойства: название, количество дней годности
класс холодильник должен иметь следующие методы:
- add - добавить новый продукт с сохранением даты времени добавления
- findAllExpired - проверить все содержащиеся продукты и вывести список просроченных
- findAllFresh - проверить все содержащиеся продукты и вывести список годных
         */

        Fridge fridge = new Fridge();
        fridge.add(new Food("Мясо", 4), LocalDateTime.of(2021, Month.DECEMBER, 9, 12, 15, 25));
        fridge.add(new Food("Сыр", 9), LocalDateTime.of(2021, Month.DECEMBER, 1, 12, 15, 25));
        fridge.add(new Food("Молоко", 2), LocalDateTime.of(2021, Month.DECEMBER, 6, 12, 15, 25));
        fridge.add(new Food("Шоколад", 31), LocalDateTime.of(2021, Month.DECEMBER, 4, 12, 15, 25));
        fridge.add(new Food("Суп", 5), LocalDateTime.of(2021, Month.DECEMBER, 9, 12, 15, 21));

        fridge.findAllExpired();
        System.out.println("--------------------------------");
        fridge.findAllFresh();
    }
}
