package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class ProteinTranslation {
    private static final Map<String, String> codonToAminoAcid = new HashMap<>();
    private List<String> codeToSTOP = Arrays.asList("UAA", "UAG", "UGA");

    static {
        codonToAminoAcid.put("AUG", "Methionine");
        codonToAminoAcid.put("UUU", "Phenylalanine");
        codonToAminoAcid.put("UUC", "Phenylalanine");
        codonToAminoAcid.put("UUA", "Leucine");
        codonToAminoAcid.put("UUG", "Leucine");
        codonToAminoAcid.put("UCU", "Serine");
        codonToAminoAcid.put("UCC", "Serine");
        codonToAminoAcid.put("UCA", "Serine");
        codonToAminoAcid.put("UCG", "Serine");
        codonToAminoAcid.put("UAU", "Tyrosine");
        codonToAminoAcid.put("UAC", "Tyrosine");
        codonToAminoAcid.put("UGU", "Cysteine");
        codonToAminoAcid.put("UGC", "Cysteine");
        codonToAminoAcid.put("UGG", "Tryptophan");
    }

    private String makeSTOP(String allCodeString) {
       /* int stopIndex = IntStream.range(0, allCodeString.length() - 2)
                .filter(i -> i % 3 == 0)
                .mapToObj(i -> allCodeString.substring(i, i + 3))
                .filter(codeToSTOP::contains)
                .findFirst()
                .map(codon -> allCodeString.indexOf(codon))
                .orElse(-1);

        if (stopIndex >= 0) {

            return allCodeString.substring(0, stopIndex);
        } else {
            return allCodeString;
        }
    }*/
        for (int i = 0; i < allCodeString.length() - 2; i += 3) {
            String codon = allCodeString.substring(i, i + 3);
            if (codeToSTOP.contains(codon)) {
                int stopIndex = allCodeString.indexOf(codon);
                if (stopIndex >= 0) {
                    return allCodeString.substring(0, stopIndex);
                }
            }
        }
        return allCodeString;
    }

    public List<String> result(String allCodeString) {
        String translated = makeSTOP(allCodeString);
        List<String> proteins = new ArrayList<>();

        for (int i = 0; i < translated.length(); i += 3) {
            if (i + 3 <= translated.length()) {
                String codon = translated.substring(i, i + 3);
                String aminoAcid = codonToAminoAcid.get(codon);

                if (aminoAcid != null) {
                    proteins.add(aminoAcid);
                }
            }
        }

        return proteins;
    }
}
//	substring(int beginIndex, int endIndex): Zwraca podłańcuch między danymi indeksami.

  /*  List<String> translate(String rnaSequence) {
        List<String> proteinSequence = new ArrayList<>();
        Matcher codon = Pattern.compile("\\w\\w\\w").matcher(rnaSequence);
        while (codon.find()) {
            String protein = CODON_MAP.get(codon.group());
            if (protein.equals(STOP)) {
                break;
            } else {
                proteinSequence.add(protein);
            }
        }
        return proteinSequence;
    }*/