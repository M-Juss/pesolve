package com.example.pesolve.model;

public class TransactionModel
{
    public String type, category, note, date;
    public int id, amount;
    public TransactionModel(int id, String type, String category, String note, String date, int amount){
        this.id  = id;
        this.type = type;
        this.category = category;
        this.note = note;
        this.date = date;
        this.amount = amount;
    }
}
