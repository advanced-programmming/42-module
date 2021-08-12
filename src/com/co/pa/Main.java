package com.co.pa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> setIn = new HashSet<>();
        Set<Integer> SetResult = new HashSet<>();

        for (int i = 0; i < 10; i++){
            setIn.add(scanner.nextInt());
        }

        setIn.stream().forEach((i) -> {
            SetResult.add(i < 42 ? i : i % 42);
        });

        System.out.println(SetResult.size());
    }
}
