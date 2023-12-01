package com.javabank.test;

import com.javabank.cardholder.Filter;
import com.javabank.cardholder.People;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class testFilter {

    public static void main(String[] args) {

        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("Moisés", 43));
        peopleList.add(new People("Maria", 18));
        peopleList.add(new People("Maria", 22));
        peopleList.add(new People("Alcione", 20));


        int y = 1;
        // Filter is a SAM (Single Abstract Method) it is a functional interface
        // Anonymous Class
        Filter<People> filterTest = new Filter<People>() {
            @Override
            public boolean check(People people) {
                int y = 10; //The same name variable y in other scope
                System.out.println(y);
                return people.getAge() > 20;
            }

            @Override
            public void hello() {
                //Filter.super.hello();
                System.out.println("haha!");
            }
        };

        filterTest.hello();

        // Using filter
        List<People> names = testFilter.withFilter(filterTest, peopleList);

/*
        List<People> names = testFilter.withFilter((People people) -> {
            return people.getName().startsWith("M");
        }, peopleList);
*/

        // Using Predicate
/*
        Predicate<People> predicate = (People peoople) -> peoople.getName().startsWith("M");
        List<People> names = testFilter.withPredicate(predicate, peopleList);
*/

        for (People name : names) {
            System.out.println(name.getName() + " " + name.getAge());
        }

    }

    public static List<People> withFilter(Filter<People> filter, List<People> peopleList ) {
        List<People> nameFiltered = new ArrayList<>();

        for(People people: peopleList) {
            if(filter.check(people))
            nameFiltered.add(people);
        }

        return nameFiltered;
    }

    public static List<People> withPredicate(Predicate<People> predicate, List<People> peopleList ) {
        List<People> nameFiltered = new ArrayList<>();

        for(People people: peopleList) {
            if(predicate.test(people)) // Don't need create other class like filter
                nameFiltered.add(people);
        }

        return nameFiltered;
    }

}
