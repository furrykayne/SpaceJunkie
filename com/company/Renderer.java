package com.company;

import java.util.Scanner;

public class Renderer {
    public static Scanner s = new Scanner(System.in);

    public static void Display(String o) {
        System.out.println(o);
    }

    public static String Input(String o) {
        System.out.print(o);
        return Input();
    }

    public static String Input() {
        return s.nextLine();
    }
}
