package org.example.singleton;

public class Singleton {
    // Статическое поле для хранения экземпляра класса
    private static Singleton instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляра класса извне
    private Singleton() {
    }

    // Метод getInstance() для получения экземпляра класса
    public static Singleton getInstance() {
        // Проверяем, создан ли уже экземпляр класса
        if (instance == null) {
            // Если экземпляр не создан, создаем его
            instance = new Singleton();
        }
        // Возвращаем экземпляр класса
        return instance;
    }
}
