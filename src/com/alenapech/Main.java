package com.alenapech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//    Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
//    возвращающий новый массив, каждый элемент которого равен разности элементов двух
//    входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
//    оповестить пользователя.

//*   Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//    и возвращающий новый массив, каждый элемент которого равен частному элементов двух
//    входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
//    оповестить пользователя. Важно: При выполнении метода единственное исключение,
//    которое пользователь может увидеть - RuntimeException, т.е. ваше.

    public static void main(String[] args) {
//        getNpeException(); // getting NullPointerException
//        getArithmeticException(); // getting ArithmeticException
//        getIOOBException(); // getting IndexOutOfBoundsException
        System.out.println(Arrays.toString(getSubstractionArray(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(getDivisionArray(new int[]{1, 2, 3}, new int[]{1, 5, 6})));
    }

    private static int[] getSubstractionArray(int[] a, int[] b) {
        if (a.length != b.length)
            throw new RuntimeException("Arrays length should be the same!");
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }

    private static int[] getDivisionArray(int[] a, int[] b) {
        try {
            if (a.length != b.length)
                throw new RuntimeException("Arrays length should be the same!");
            int[] result = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] / b[i];
            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException("Please check input arrays");
        }
    }

    private static String getNPEException() {
        Object o = null;
        return o.toString();
    }

    private static int getArithmeticException() {
        return 1/0;
    }

    private static Object getIOOBException() {
        List list = new ArrayList<>();
        return list.get(list.size());
    }

}
