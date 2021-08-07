package com.alura.java.io.teste;

import java.io.File;
import java.net.FileNameMap;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner linhaScanner = new Scanner(linha);

            linhaScanner.useLocale(Locale.US);

            linhaScanner.useDelimiter(",");

            String valor1 = linhaScanner.next();

            linhaScanner.close();

//            String[] valores = linha.split(",");
        }
    }
}
