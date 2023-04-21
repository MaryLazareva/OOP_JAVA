package org.example.lesson_5.controller;

import org.example.lesson_5.service.UserBalance;
import org.example.lesson_5.service.UserBalanceImpl;
import org.example.lesson_5.service.UserService;
import org.example.lesson_5.service.UserServiceImpl;

public class BalanceController {

    private UserBalance balanceController = new UserBalanceImpl();

    public void creditBalance(int index, int money){
        balanceController.creditBalance(index, money);
    }
    public int debitBalance(int index, int money){
        return balanceController.debitBalance(index, money);
    }

    public int getBalance(int index){
        return balanceController.getBalance(index);
    }

}

