package ru.eugene.firstBootApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MyTest {

    @Autowired
    private MyService myService;

    @Test
    public void testMyService() {
        // Тестирование методов MyService
    }
}
