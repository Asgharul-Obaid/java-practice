package com.java8;

interface OneParameterFunctionalInterface {
    void phoneNumber(Long phoneNumber);
}

public class OneParameterFunctionalInterfaceMain {
    public static void main(String[] args) {
        OneParameterFunctionalInterface oneParameterFunctionalInterface =
                (phoneNumber) -> System.out.println(phoneNumber);
        oneParameterFunctionalInterface.phoneNumber(9588629396L);
    }
}