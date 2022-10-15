package com.github.karixdev.fectorymethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What cuisine do you want to eat from: ");
        String cuisine = scanner.nextLine();

        try {
            GastronomyBusiness gastronomyBusiness = new GastronomyBusiness(cuisine);
            Restaurant restaurant = gastronomyBusiness.getRestaurant();

            System.out.println("You can order:");
            for (int i = 0; i < DishType.values().length; i++) {
                System.out.println((i + 1) + ". " + DishType.values()[i]);
            }

            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            restaurant.placeOrder(DishType.values()[choice - 1]);
            System.out.println("Enjoy your meal!");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
