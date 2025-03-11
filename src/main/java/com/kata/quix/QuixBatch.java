package com.kata.quix;

import java.io.*;

public class QuixBatch {

    public void NumberTransformerTXT(){
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        int number;

        try {// Lire le nombre à partir du fichier d'entrée
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            number = Integer.parseInt(line);

            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        try {
            new QuixBean();
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(String.valueOf(QuixBean.transformerNumber(number)));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("Transformation terminée. Le résultat est dans " + outputFile);
    }
}



