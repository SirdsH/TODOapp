package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" __          __  _                            _          _______ ____  _____   ____                      \n" +
                " \\ \\        / / | |                          | |        |__   __/ __ \\|  __ \\ / __ \\                     \n" +
                "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___      | | | |  | | |  | | |  | |   __ _ _ __  _ __  \n" +
                "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\     | | | |  | | |  | | |  | |  / _` | '_ \\| '_ \\ \n" +
                "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) |    | | | |__| | |__| | |__| | | (_| | |_) | |_) |\n" +
                "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/     |_|  \\____/|_____/ \\____/   \\__,_| .__/| .__/ \n" +
                "                                                                                            | |   | |    \n" +
                "                                                                                            |_|   |_|    ");
        System.out.println("Welcome in this project, you can add up to 10 tasks!");
        int[] number =new int[10];
        for (int i = 0; i < number.length; i++) {
            System.out.println("You have "+number[i]+"/10!");
            break;
        }

    }
}
