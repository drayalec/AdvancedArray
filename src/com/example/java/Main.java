package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] hot_dog_materials = {"Hotdogs", "Buns", "Ketchup", "Mayo", "Mustard"};
        double[] stock = {2.0,1.0,5.1,4.7,4.3};

        System.out.println("Please enter a number on the menu: ");
        System.out.println("");
        System.out.println("1. Look up item");
        System.out.println("2. Update an item");
        System.out.println("3. Exit");

        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Please enter the index of the item you are looking for: ");
                int search = scanner.nextInt();

                if (search <= hot_dog_materials.length) {
                    System.out.println("Material name:  " + hot_dog_materials[search]);
                    System.out.println("Amount in Stock:  " + stock[search]);
                }
                break;

            case 2:

                System.out.println("Please select what change you want to make to an item: ");
                System.out.println();
                System.out.println("1. Add");
                System.out.println("2. Subtract");

                int choice = scanner.nextInt();

                if (choice == 1){
                    System.out.println("Enter what the index of the desired item is:  ");
                    int index = scanner.nextInt();
                    System.out.println("Enter how much you would like to raise the item:  ");
                    double amount_added = scanner.nextDouble();
                    System.out.println();
                    System.out.println("Result:");
                    System.out.println("Name of item: " + hot_dog_materials[index]);
                    System.out.println("Original amount of item: " + stock[index]);
                    System.out.println("Amount Added: "+ amount_added);
                    System.out.println("New amount: "+ (stock[index] + amount_added));


                }
                else if (choice == 2){

                    System.out.println("Enter what the index of the desired item is:  ");
                    int index = scanner.nextInt();
                    System.out.println("Enter how much you would like to lower the item:  ");
                    double amount_sub = scanner.nextDouble();
                    System.out.println();
                    System.out.println("Result:");
                    System.out.println("Name of item: " + hot_dog_materials[index]);
                    System.out.println("Original amount of item: " + stock[index]);
                    System.out.println("Amount Subtracted: "+ amount_sub);
                    System.out.println("New amount: "+ (stock[index] + amount_sub));
                }
                else {
                    System.out.println("Error: The user entry was invalid");
                }
                break;

            case 3:
                break;

            default:
                System.out.println("Error: The user entry was not valid");
                break;
        }

    }
}
