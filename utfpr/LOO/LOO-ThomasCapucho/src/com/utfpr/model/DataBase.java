package com.utfpr.model;

import java.util.ArrayList;

public class DataBase {
    public ArrayList<String> register = new ArrayList<>();
    public DataBase(){
        this.register = new ArrayList<>();
    }
    public ArrayList<String> getInstance(){
        return register;
    }

}
