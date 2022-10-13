package com.epam.rd.autotasks.sequence;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        ArrayList<Integer> list = new ArrayList<>();
        int n = 1;
        int element = 0;
        Scanner x = new Scanner(System.in);
        while (n != 0) {
            n = x.nextInt();
            list.add(n);
            element = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > element && list.get(i) != 0) {
                    element = list.get(i);
                }
            }
        }
        return element;
    }

    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        System.out.println(max());
    }
}
