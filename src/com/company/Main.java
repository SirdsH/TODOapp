package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tasks = new String[10];
        System.out.println(" __          __  _                            _          _______ ____  _____   ____                      \n" +
                " \\ \\        / / | |                          | |        |__   __/ __ \\|  __ \\ / __ \\                     \n" +
                "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___      | | | |  | | |  | | |  | |   __ _ _ __  _ __  \n" +
                "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\     | | | |  | | |  | | |  | |  / _` | '_ \\| '_ \\ \n" +
                "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) |    | | | |__| | |__| | |__| | | (_| | |_) | |_) |\n" +
                "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/     |_|  \\____/|_____/ \\____/   \\__,_| .__/| .__/ \n" +
                "                                                                                            | |   | |    \n" +
                "                                             " +
                "                                               |_|   |_|    ");
        System.out.println("____--------_______------_______-------____");
        System.out.println("Welcome in this project, you can add up to 10 tasks!");
        System.out.println("You have " + "0/10!");
        System.out.println("----_______--------______-------_______----");
        int length = tasks.length;
        System.out.println("1) Manage tasks");
        System.out.println("2) Exit");
        System.out.println("Choose option:");
        int mainmenu = 0;
        int taskmanagement = 0;
        mainmenu = sc.nextInt();
        for (int i = 2; i < mainmenu; i++) {
            System.out.println("Please chose right number:");
            System.out.println("1) Manage tasks");
            System.out.println("2) Exit");
            System.out.println("Choose option:");
            mainmenu = sc.nextInt();
            break;
        }
        if (mainmenu == 2) {
            System.out.println("Thank you for using my application!!" + " See you soon!!!");
        }
        while (mainmenu == 1) {
            System.out.println("____--------_______------_______-------____");
            System.out.println("Task management:");
            System.out.println("----_______--------______-------_______----");
            System.out.println("1) Create a new task");
            System.out.println("2) Update a task");
            System.out.println("3) Destroy a task");
            System.out.println("4) Main menu");
            System.out.println("Choose option:");
            taskmanagement = sc.nextInt();
            if (taskmanagement == 1) {
                System.out.println("Choose number of index:");
                length = sc.nextInt();
                System.out.println("Now write name of your task:");
                String[tasks] = sc.nextLine();

            }
        }
        if (taskmanagement == 2) {

        }
        if (taskmanagement == 4) {
                System.out.println("You have " + tasks + "/10!");
                System.out.println("----_______--------______-------_______----");
            System.out.println("1) Manage tasks");
            System.out.println("2) Exit");
            System.out.println("Choose option:");
            mainmenu = sc.nextInt();
            for (int j = 2; j < mainmenu; j++) {
                System.out.println("Please chose right number:");
                System.out.println("1) Manage tasks");
                System.out.println("2) Exit");
                System.out.println("Choose option:");
                mainmenu = sc.nextInt();
                break;
            }
            if (mainmenu == 2) {
                System.out.println("Thank you for using my application!!" + " See you soon!!!");
            }
        }
        for (String task : tasks) {

        }
    }
}



