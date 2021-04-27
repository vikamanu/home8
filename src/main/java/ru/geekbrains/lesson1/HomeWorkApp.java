package ru.geekbrains.lesson1;

public class HomeWorkApp {
public static void main(String[] args){
    printThreeWords();
    voidcheckSumSign();
    printColor();
    compareNumbers();
}
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

public static void voidcheckSumSign(){
    int a = 54;
    int b = 43;
    int c = a + b;
    System.out.println("c = " + c);
    if (c >= 0){
        System.out.println("Сумма положительная");
    }
    else {
        System.out.println("Сумма отрицательная");
    }
}
    public static void printColor() {
        int value;
        value = 12;
        if (value <= 0) { // если value меньше или = 0
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) { // если value не равна 0 но в пределах или равна 100
            System.out.println("Желтый");
        }
        if (value > 100 && value == 100) { // если value больше, но не равно 100
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
int a;
int b;
a = 13;
b = 6;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        if (a >= b) {
            System.out.println("a >= b");
        }
else {
                System.out.println("a < b");
        }

    }
    }