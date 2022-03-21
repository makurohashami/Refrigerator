package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class Fridge {
    private  Map<LocalDateTime, Food> fridgeMap= new HashMap<>();

    public void add(Food food, LocalDateTime date) {
       if(fridgeMap.containsKey(date)) {
           System.out.println("В это время уже добавляли продукты");
           return;
       } else
           fridgeMap.put(date, food);
    }
    public void findAllExpired() {
        if(fridgeMap.isEmpty())
            System.out.println("В холодильнике нет продуктов");

        for(LocalDateTime date : fridgeMap.keySet()) {
            if( date.until(LocalDateTime.now(), ChronoUnit.DAYS) > fridgeMap.get(date).expirationDate) {
                System.out.println("Срок годности вышел у: " + fridgeMap.get(date).name);
            }
        }
    }
    public void findAllFresh() {
        if(fridgeMap.isEmpty())
            System.out.println("В холодильнике нет продуктов");

        for(LocalDateTime date : fridgeMap.keySet()) {
            if(date.until(LocalDateTime.now(), ChronoUnit.DAYS) <= fridgeMap.get(date).expirationDate) {
                System.out.println("Срок годности не вышел у: " + fridgeMap.get(date).name);
            }
        }
    }
}