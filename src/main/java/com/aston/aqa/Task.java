package com.aston.aqa;

public class Task {

    public void receiveHelloIfNumberGreaterSeven() {
        System.out.println("Enter number: ");

        final String line = ConsoleScanner.scan();
        if (line.isEmpty()) {
            System.out.println("You nothing enter!");
        } else {
            try {
                if (Integer.parseInt(line) > 7) {
                    System.out.println("Hello!");
                }
            } catch (NumberFormatException e) {
                System.out.println("You enter incorrect data!");
            }
        }
    }

    public void receiveHelloVacheslavIfEqualName() {
        System.out.println("Enter name: ");

        final String name = "Вячеслав";
        final String line = ConsoleScanner.scan();
        if (name.equals(line)) {
            System.out.println("Привет, " + line);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public void receiveNumbersMultipleOfThree() {
        System.out.println("enter space-separated integer: ");

        final String line = ConsoleScanner.scan();
        if (line.isEmpty()) {
            System.out.println("You nothing enter!");
        } else {
            System.out.println(line);
            final String[] mas = line.split(" ");
            try {
                for (String element : mas) {
                    if (Integer.parseInt(element) % 3 == 0) {
                        System.out.println(element);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You enter incorrect data");
            }
        }
    }
}
