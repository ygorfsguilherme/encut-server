package com.guilherme.encut.utils;

import java.util.Random;

public class RandomGeneratedPathUrl {
    private final int targetStringLength;

    public RandomGeneratedPathUrl(int targetStringLength){
        this.targetStringLength = targetStringLength;
    }

    public String GeneratedString(){

        int rightLimit = 122;
        int leftLimit = 98;

        return new Random()
                .ints(leftLimit, rightLimit)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
