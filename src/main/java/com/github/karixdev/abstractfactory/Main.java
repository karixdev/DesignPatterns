package com.github.karixdev.abstractfactory;

import com.github.karixdev.fectorymethod.DishType;
import com.github.karixdev.fectorymethod.GastronomyBusiness;
import com.github.karixdev.fectorymethod.Restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What style of furniture do you want to buy: ");
        String furnitureStyle = scanner.nextLine();

        try {
            FurnitureShop gastronomyBusiness = new FurnitureShop(furnitureStyle);

            Armchair armchair = gastronomyBusiness.orderArmchair();
            CoffeeTable coffeeTable = gastronomyBusiness.oderCoffeeTable();

            System.out.println("Enjoy your new furniture");
            System.out.println();

            System.out.println("Oh I am tired, I need to relax");
            armchair.sit();
            coffeeTable.put("mug with coffee");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
