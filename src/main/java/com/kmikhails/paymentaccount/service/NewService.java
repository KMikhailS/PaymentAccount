package com.kmikhails.paymentaccount.service;

import java.time.LocalDate;

public class NewService {

    private LocalDate initDate;

    public void printValue(String value) {
        System.out.println(value);
    }

    public Integer getIntFromValue(String value) {
        return Integer.parseInt(value);
    }

    public Double getDoubleFromValue(String value) {
        return Double.parseDouble(value);
    }

}
