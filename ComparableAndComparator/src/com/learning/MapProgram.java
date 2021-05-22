package com.learning;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map.");
        } else {
            languages.put("Java", "a compiled high level object=oriented programming language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented high level programming language");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginnes all purpose symbolic Instruction code."));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map.");
        } else {
            languages.put("Java", "this course is about Java");
        }
        System.out.println("======================================================");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed. key/value pair not found");
        }

//        System.out.println(languages.replace("Lisp", "a functional programming language with imperative features"));
        if (languages.replace("Lisp", "This will not work", "a functional programming language")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp is not replaced");
        }

        if (languages.replace("Lisp", "Therein lies madness", "a functional programming language")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp is not replaced");
        }
//        System.out.println(languages.replace("Scala", "this will not be added"));
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
