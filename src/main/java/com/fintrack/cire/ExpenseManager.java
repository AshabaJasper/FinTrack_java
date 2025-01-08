package com.fintrack.core;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {

    // Inner class to represent an expense
    private static class Expense {
        private double amount;
        private String category;
        private String date;

        // Constructor to initialize an expense
        public Expense(double amount, String category, String date) {
            this.amount = amount;
            this.category = category;
            this.date = date;
        }

        // Method to display expense details
        @Override
        public String toString() {
            return "Expense [Amount: " + amount + ", Category: " + category + ", Date: " + date + "]";
        }
    }

    // List to store all expenses
    private final List<Expense> expenses;

    // Constructor for ExpenseManager
    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    // Method to add an expense
    public void addExpense(double amount, String category, String date) {
        Expense expense = new Expense(amount, category, date);
        expenses.add(expense);
        System.out.println("Expense added: " + expense);
    }

    // Method to display all expenses
    public void displayAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
        } else {
            System.out.println("Expenses:");
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    // Method to calculate total expenses
    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.amount;
        }
        return total;
    }
}
