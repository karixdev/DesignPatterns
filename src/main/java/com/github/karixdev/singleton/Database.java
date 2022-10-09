package com.github.karixdev.singleton;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Database database;

    private final Map<String, String> records;

    private Database() {
        this.records = new HashMap<>();
    }

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }

        return database;
    }

    public void insert(String key, String value) {
        records.putIfAbsent(key, value);
    }

    private void checkIfRecordExists(String key) {
        if (!records.containsKey(key)) {
            throw new IllegalArgumentException("There's record with provided key");
        }
    }

    public void update(String key, String value) {
        checkIfRecordExists(key);
        records.put(key, value);
    }

    public String select(String key) {
        checkIfRecordExists(key);
        return records.get(key);
    }

    public void delete(String key) {
        checkIfRecordExists(key);
        records.remove(key);
    }

    @Override
    public String toString() {
        return records.toString();
    }
}
