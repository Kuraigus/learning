package com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com arquivo

        OutputStream fos = new FileOutputStream("./java-io/lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("write teste");

        bw.close();
    }
}
