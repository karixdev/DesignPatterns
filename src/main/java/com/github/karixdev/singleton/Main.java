package com.github.karixdev.singleton;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.insert("fruit", "apple");

        Database database1 = Database.getInstance();
        database1.update("fruit", "banana");

        Database database2 = Database.getInstance();
        System.out.println(database2.select("fruit"));

        Database database3 = Database.getInstance();
        database3.delete("fruit");

        Database database4 = Database.getInstance();
        System.out.println(database4.toString());
    }
}
