package com.github.karixdev.singleton;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Database database;

    private final Map<String, String> content;

    private Database() {
        this.content = new HashMap<>();
    }

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }

        return database;
    }

    public void insert(String key, String value) {
        content.putIfAbsent(key, value);
    }

    private void checkIfRecordExists(String key) {
        if (!content.containsKey(key)) {
            throw new IllegalArgumentException("There's record with provided key");
        }
    }

    public void update(String key, String value) {
        checkIfRecordExists(key);
        content.put(key, value);
    }

    public String select(String key) {
        checkIfRecordExists(key);
        return content.get(key);
    }

    public void delete(String key) {
        checkIfRecordExists(key);
        content.remove(key);
    }
}
