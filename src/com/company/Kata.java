package com.company;

public class Kata {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) return null;
        String words[] = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }
        return String.join(" ", words);
    }

    public static int[] foldArray(int[] array, int runs) {
        int[] arrForFold = array;
        for (int i = 0; i < runs; i++) {
            int arrSize = (arrForFold.length % 2 == 1) ? 1 : 0;
            arrSize += (arrForFold.length != 1) ? arrForFold.length / 2 : 0;
            int[] foldedArr = new int[arrSize];
            if(arrForFold.length % 2 == 1)
            {
                foldedArr[arrSize-1] = arrForFold[arrForFold.length/2];
                arrSize--;
            }
            for (int j = 0; j < arrSize; j++) {
                foldedArr[j] = arrForFold[j] + arrForFold[arrForFold.length - j - 1];
            }
            arrForFold = foldedArr;
        }
        return arrForFold;
    }

    public static String createPhoneNumber(int[] numbers) {
        String num = java.util.Arrays.toString(numbers);
        num = num.replaceAll("\\D", "");
        return "(" + num.substring(0,3) + ") " + num.substring(3,6) + "-" + num.substring(6);
    }
}

