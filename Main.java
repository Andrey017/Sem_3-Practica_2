package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Author author = new Author("Rowling", " ", 'F');
        author.setEmail(in.next());
        System.out.println(author);
    }
}
