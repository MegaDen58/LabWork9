package com.company;
import java.util.Scanner;
import java.util.Random;

interface Product{
    void displayName(String name);
    void displayPrice(double price);
    void displayRating(String rating);
}

interface User{
    void displayLogin(String login);
    void displayPassword(String login);
}

class Address implements User{
    public void displayLogin(String login){
        System.out.printf("Логин: %s", login);
    }
    public void displayPassword(String login){
        System.out.printf("Пароль: %s", login);
    }
    public void displayAddress(String address){
        System.out.printf("Адрес: %s", address);
    }
}

class Balance implements User{
    Random randNumber = new Random();
    public void displayLogin(String login){
        System.out.printf("Логин: %s", login);
    }
    public void displayPassword(String login){
        System.out.printf("Пароль: %s", login);
    }
    public void displayBalance(){
        System.out.printf("Баланс: %d$", randNumber.nextInt(500));
    }
}

class History implements User{
    public void displayLogin(String login){
        System.out.printf("Логин: %s", login);
    }
    public void displayPassword(String login){
        System.out.printf("Пароль: %s", login);
    }
    String[] history = new String[] {
            "13 Марта 2022 год | Товар: Дрель | Цена: 103$\n",
            "22 Января 2022 год | Товар: Гвозди | Цена: 45$\n",
            "9 Декабря 2022 год | Товар: Молоток | Цена: 5$\n"};
    public void displayHistory(){
        int length = history.length - 1;
        for(int c = 0; c <= length; c++){
            System.out.println(history[c]);
        }
    }
}

class TNT implements Product{
    String name = "TNT";
    double price = 3.99;
    String rating = "6/10";
    public void displayName(String name){
        System.out.printf("Название товара: %s.", name);
    }
    public void displayPrice(double price){
        System.out.printf("Цена динамита: %f.$", price);
    }
    public void displayRating(String rating){
        System.out.printf("Рейтинг данного товара: %s.", rating);
    }
}

class verticalBandSawMakitaLB1200F900W implements Product{
    String name = "Ленточнопильный станок вертикальный Makita LB1200F 900 Вт";
    double price = 19999;
    String rating = "9/10";
    public void displayName(String name){
        System.out.printf("Название товара: %s.", name);
    }
    public void displayPrice(double price){
        System.out.printf("Цена динамита: %f.$", price);
    }
    public void displayRating(String rating){
        System.out.printf("Рейтинг данного товара: %s.", rating);
    }
}

class pilingMachineBM811M01 implements Product{
    String name = "Сваебойная машина БМ-811М -01 (КОМ, отбор мощности)";
    double price = 145000;
    String rating = "7/10";
    public void displayName(String name){
        System.out.printf("Название товара: %s.", name);
    }
    public void displayPrice(double price){
        System.out.printf("Цена динамита: %f.$", price);
    }
    public void displayRating(String rating){
        System.out.printf("Рейтинг данного товара: %s.", rating);
    }
}

class Cheque implements User, Product{
    public void start(){
        System.out.println("===== ЧЕК =====");
    }
    public void displayLogin(String login){
        System.out.printf("Логин: %s\n", login);
    }
    public void displayPassword(String login){
        System.out.printf("Пароль: %s\n", login);
    }
    public void displayName(String name){
        System.out.printf("Наименование товара: %s\n", name);
    }
    public void displayPrice(double price){
        System.out.printf("Стоимость товара: %.2f$\n", price);
    }
    public void displayRating(String rating){
        System.out.printf("Рейтинг товара: %s\n", rating);
    }
    public void end(){
        System.out.println("===============");
    }
}



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название товара (TNT, VerticalBand, PilingMachine): ");
        String name = in.nextLine();
        System.out.print("Введите логин от аккаунта: ");
        String login = in.nextLine();
        System.out.print("Введите пароль от аккаунта: ");
        String password = in.nextLine();

        TNT tnt = new TNT();
        verticalBandSawMakitaLB1200F900W verticalBand = new verticalBandSawMakitaLB1200F900W();
        pilingMachineBM811M01 pilingMachine = new pilingMachineBM811M01();
        Balance balance = new Balance();
        History history = new History();
        Address address = new Address();
        Cheque cheque = new Cheque();
        balance.

        if("TNT".equals(name)){
            cheque.start();
            cheque.displayLogin(login);
            cheque.displayPassword(password);
            cheque.displayName(tnt.name);
            cheque.displayPrice(tnt.price);
            cheque.displayRating(tnt.rating);
            cheque.end();
        }
        else if("PilingMachine".equals(name)){
            cheque.start();
            cheque.displayLogin(login);
            cheque.displayPassword(password);
            cheque.displayName(pilingMachine.name);
            cheque.displayPrice(pilingMachine.price);
            cheque.displayRating(pilingMachine.rating);
            cheque.end();

        }
        else if("VerticalBand".equals(name)){
            cheque.start();
            cheque.displayLogin(login);
            cheque.displayPassword(password);
            cheque.displayName(verticalBand.name);
            cheque.displayPrice(verticalBand.price);
            cheque.displayRating(verticalBand.rating);
            cheque.end();
        }
        else{
            System.out.println("Error");
        }
    }
}
