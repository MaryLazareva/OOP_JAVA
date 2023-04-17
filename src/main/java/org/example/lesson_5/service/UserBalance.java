package org.example.lesson_5.service;

import org.example.lesson_5.model.User;

public interface UserBalance {
    void creditBalance(int index, int money);

    int debitBalance(int index, int money);

    int getBalance(int index);
}
