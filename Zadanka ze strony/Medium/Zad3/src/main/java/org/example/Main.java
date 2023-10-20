package org.example;

public class Main {
    public static void main(String[] args) {
        RotationalCipher cipher = new RotationalCipher(5); // Utwórz obiekt szyfru ROT z kluczem 5
        String plaintext = "omg";
        String encryptedText = cipher.encrypt(plaintext);
        System.out.println("Zaszyfrowany tekst: " + encryptedText);

        String decryptedText = cipher.decrypt(encryptedText);
        System.out.println("Odszyfrowany tekst: " + decryptedText);
    }
}