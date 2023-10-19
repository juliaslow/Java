package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputSequence = "AUGUUUUCUUAAAUG";
        ProteinTranslation translator = new ProteinTranslation();
        List<String> result = translator.result(inputSequence);

        System.out.println("Input Sequence: " + inputSequence);
        System.out.println("Translated Proteins: " + result);
    }
}