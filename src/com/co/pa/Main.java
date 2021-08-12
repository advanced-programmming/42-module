package com.co.pa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final int NUMBER_42 = 42;
    private static final int MAX_IN = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> setIn = new HashSet<>();
        Set<Integer> resultModuleSet = new HashSet<>();

        for (int i = 0; i < MAX_IN; i++){
            setIn.add(scanner.nextInt());
        }

        setIn.stream().forEach((i) -> {
            if(i < NUMBER_42) {
                resultModuleSet.add(i);
            } else{
                resultModuleSet.add(i % NUMBER_42);
            }
        });

        System.out.println(resultModuleSet.size());
    }
}
