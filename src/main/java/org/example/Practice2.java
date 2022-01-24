package org.example;


import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Practice2{
    public static void main(String[] args){
        System.out.print("Employee: ");
        Employee zhangsan = new Employee();
        System.out.print(zhangsan.getHours() + ", ");
        System.out.println(zhangsan.getVacationForm());

        System.out.print("Secreatary: ");
        Employee lisi = new Secreatary();
        System.out.print(lisi.getHours() + ", ");
        System.out.print(lisi.getVacationForm() + ", ");
        ((Secreatary) lisi).takeDictaion("fjweofjweio");

        System.out.print("Lawyer: ");
        Employee wangwu = new Lawyer();
        System.out.print(wangwu.getHours() + ", ");
        System.out.print(wangwu.getVacationForm() + ", ");
        System.out.println(wangwu.getSalary());

        Rectangle sanjiao = new Rectangle(5, 8);
        System.out.println(sanjiao.getArea());

        StringBuilder sb = new StringBuilder(1024);

        Integer a = 5555555;
        Integer b = 5555555;
        System.out.println(a.equals(b));
    }
}

class Employee {
    public int getHours(){
        return 40;
    }

    public double getSalary(){
        return 40000.0;
    }

    public int getVacationDays(){
        return 10;
    }

    public String getVacationForm(){
        return "yellow";
    }
}

class Secreatary extends Employee {
    public void takeDictaion(String text){
        System.out.println(text);
    }
}

class Lawyer extends Employee{
    public int getVacationDays(){
        return 15;
    }

    public String getVacationForm(){
        return "pink";
    }

    public void sud(){
        System.out.println("Lawyer");
    }

    public double getSalary(){
        return super.getSalary() + 5000.0;
    }
}

class Stock{
    private String symbol;
    private int totalShares;
    private double totalCost;

    public Stock(String symbol){
        this.symbol = symbol;
        this.totalShares = 0;
        this.totalCost = 0.0;
    }

    public double getProfit(double currentPrice){
        double marketValue = this.totalShares * currentPrice;
        return marketValue - this.totalCost;
    }

    public void pruchase(int shares, double pricePerShare){
        this.totalShares += shares;
        this.totalCost += shares * pricePerShare;
    }

    public int getTotalShares(){
        return totalShares;
    }
}

class DividenStock extends Stock{
    private double dividens;

    public DividenStock(String symbol){
        super(symbol);
        this.dividens = 0.0;
    }

    public void payDividend(double amountPerShare){
        this.dividens += amountPerShare * getTotalShares();
    }

    public double getProfit(double currentPrice){
        return super.getProfit(currentPrice) + this.dividens;
    }
}

interface Shape{
    double getArea();
    double getPerimeter();
}

class Rectangle implements Shape {
    private double width;
    private double high;

    public Rectangle(double width, double high){
        this.width = width;
        this.high = high;
    }

    public double getArea(){
        return this.width * this.high;
    }

    public double getPerimeter(){
        return 2.0 * (this.width * this.high);
    }
}


