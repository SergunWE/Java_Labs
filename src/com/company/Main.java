package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print(Kata.toJadenCase("hello world."));
        System.out.print(Kata.foldArray(new int[] {-9, 9, -8, 8, 66, 23}, 1));
        System.out.print(Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

    }
}