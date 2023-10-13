package at.ac.fhcampus;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Deklaration eines Arrays
        int[] numbers;
        // Initialisierung des Arrays
        numbers = new int[10]; // Gr. 10
        // Gr. des Array .length
        System.out.println(numbers.length);

        // Initialisierung mit Werten
        int[] numbers2 = {3,4,5,6};
        String[] words = {"Eins", "Zwei", "Drei"};
        // Person[] persons;

        // Befülle Array
        numbers2 = numbers;
        numbers = createArrayWithRandomValues(100);
        int x = 5;
        x = 10;
        // Ausgabe Array
        printArray(numbers); // besitzt keinen return Wert
    }

    // static kennzeichnet eine Methode die der Klasse gehört
    // ein Objekt ist für den Aufruf nicht erforderlich
    // Bsp: at.ac.fhcampus.Main.printArray(numbers);

    public static int[] createArrayWithRandomValues(int size){
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Pos " + i + ": " + numbers[i]);
        }
    }
}