package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private final static Scanner scanner = new Scanner(System.in);
    private static String request;

    private static String input(String inputText){
        return inputText;
    }

    public static void main(String[] args) {


        int amountOfWater = 400;
        int amountOfMilk = 540;
        int amountOfCoffee = 120;
        int amountOfCups = 9;
        int amountOfMoney = 550;
        
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        request = input(scanner.nextLine());


        while (!request.equals("exit")) {
            switch (request) {
                case "remaining":
                    System.out.println();
                    printAmounts(amountOfWater, amountOfMilk, amountOfCoffee, amountOfCups, amountOfMoney);
                    break;
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back to main menu:");
                    String typeOfCoffee = input(scanner.nextLine());


                    switch (typeOfCoffee) {
                        case "1":
                            if (amountOfWater >= 250 && amountOfCoffee >= 16 && amountOfCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                amountOfWater -= 250;
                                amountOfCoffee -= 16;
                                amountOfCups -= 1;
                                amountOfMoney += 4;
                            } else if (amountOfWater < 250){
                                System.out.println("Sorry, not enough water!");
                            } else if (amountOfCoffee < 16){
                                System.out.println("Sorry, not enough coffee beans!");
                            } else {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                            break;
                        case "2":
                            if (amountOfWater >= 350 && amountOfMilk >= 75 && amountOfCoffee >= 20 && amountOfCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                amountOfWater -= 350;
                                amountOfMilk -= 75;
                                amountOfCoffee -= 20;
                                amountOfCups -= 1;
                                amountOfMoney += 7;
                            } else if (amountOfWater < 350){
                                System.out.println("Sorry, not enough water!");
                            } else if (amountOfMilk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (amountOfCoffee < 20){
                                System.out.println("Sorry, not enough coffee beans!");
                            } else {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                            break;
                        case "3":
                            if (amountOfWater >= 200 && amountOfMilk >= 100 && amountOfCoffee >= 12 && amountOfCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                amountOfWater -= 200;
                                amountOfMilk -= 100;
                                amountOfCoffee -= 12;
                                amountOfCups -= 1;
                                amountOfMoney += 6;
                            } else if (amountOfWater < 200){
                                System.out.println("Sorry, not enough water!");
                            } else if (amountOfMilk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (amountOfCoffee < 12){
                                System.out.println("Sorry, not enough coffee beans!");
                            } else {
                                System.out.println("Sorry, not enough disposable cups!");
                            }
                            break;
                        case "back":
                            break;
                    }

                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    amountOfWater += Integer.parseInt(input(scanner.nextLine()));
                    System.out.println("Write how many ml of milk do you want to add:");
                    amountOfMilk += Integer.parseInt(input(scanner.nextLine()));
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    amountOfCoffee += Integer.parseInt(input(scanner.nextLine()));
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    amountOfCups += Integer.parseInt(input(scanner.nextLine()));
                    break;

                case "take":
                    System.out.println("I gave you " + amountOfMoney + "$");
                    amountOfMoney -= amountOfMoney;
                    break;

            }

            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");

            request = input(scanner.nextLine());
        }
    }

    private static void printAmounts(int amountOfWater, int amountOfMilk, int amountOfCoffee, int amountOfCups, int amountOfMoney){
        System.out.println("The coffee machine has:");
        System.out.println(amountOfWater + " of water");
        System.out.println(amountOfMilk + " of milk");
        System.out.println(amountOfCoffee + " of coffee beans");
        System.out.println(amountOfCups + " of disposable cups");
        System.out.println("$" + amountOfMoney + " of money");
    }
}
