package com.company;

public class Main {

    public static void main(String[] args) {
        Vigenere vigenere = new Vigenere();
        System.out.println(vigenere.decipher("rpoaxcnlazyshkjwlchhaky", "whiskywhiskywhiskywhisk"));
        System.out.println(vigenere.cipher("viginereshouldbebelasso", "whiskywhiskywhiskywhisk"));
    }
}
