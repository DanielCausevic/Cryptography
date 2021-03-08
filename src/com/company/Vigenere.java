package com.company;

public class Vigenere {
    public String decipher(String cipher, String keyword) {
        String message = "";
        char[] messageChars = cipher.toCharArray();
        char[] keywordChars = keyword.toCharArray();
        int index = 0;
        int distance;
        int numberToShift;

        for(Character character : messageChars){
            numberToShift = keywordChars[index] - 'a';
            char[] shiftedAlphabet = shiftCharsRight("abcdefghijklmnopqrstuvwxyz".toCharArray(), numberToShift);
            distance = character - 'a';
            message += shiftedAlphabet[distance];
            index++;
        }
        return message;
    }


    public String cipher(String message, String keyword){
        String cipher = "";
        char[] messageChars = message.toCharArray();
        char[] keywordChars = keyword.toCharArray();

        int index = 0;
        int distance;
        int numberToShift;

        for(Character character : messageChars){
            numberToShift = keywordChars[index] - 'a';
            char[] shiftedAlphabet = shiftCharsLeft("abcdefghijklmnopqrstuvwxyz".toCharArray(), numberToShift);
            distance = character - 'a';
            cipher += shiftedAlphabet[distance];
            index++;
        }
        return cipher;
    }

    public char[] shiftCharsRight(char[] array, int numberToShift){
        for(int i = 0; i < numberToShift; i++){
            char last = array[array.length - 1];
            for(int j = array.length - 1; j > 0; j--){
                array[j] = array[j - 1];
            }
            array[0] = last;
        }
        return array;
    }

    public char[] shiftCharsLeft(char[] array, int numberToShift){
        for(int i = 0; i < numberToShift; i++){
            char first = array[0];
            for(int j = 0; j < array.length - 1; j++){
                array[j] = array[j + 1];
            }
            array[array.length - 1] = first;
        }
        return array;
    }

}
