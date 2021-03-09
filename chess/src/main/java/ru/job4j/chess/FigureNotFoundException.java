package ru.job4j.chess;

public class FigureNotFoundException extends Exception {
    public FigureNotFoundException() {
        System.out.println("Фигуры нет на клетке.");
    }
}
