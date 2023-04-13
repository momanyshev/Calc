package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setUpAll(){
        System.out.println("Текст перед выполнением всех тестов");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Текст перед выполнением каждого теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Текст после выполнения каждого теста");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("Текст после выполнения всех тестов");
    }

    @ParameterizedTest(name = "№{index} - сложение {0} и {1} ожидаем {2}")
    @CsvSource({"1, 2, 3", "12, 7, 19", "0, 0, 0"})
    @DisplayName("Проверка сложения")
    @Tag("plus")
    void plus(int a, int b, int expectedResult) {
        Calc calc = new Calc();

        int result = calc.plus(a, b);
        Assertions.assertEquals(expectedResult, result, "Ошибка в сложении");

    }

    @ParameterizedTest(name = "№{index} - вычитание {0} и {1} ожидаем {2}")
    @CsvSource({"3, 2, 1", "19, 7, 12", "0, 0, 0"})
    @DisplayName("Проверка вычитания")
    @Tag("minus")
    void minus(int a, int b, int expectedResult) {
        Calc calc = new Calc();

        int result = calc.minus(a, b);
        Assertions.assertEquals(expectedResult, result, "Ошибка в вычитании");
    }
}