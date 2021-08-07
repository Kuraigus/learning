package com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com arquivo

//        OutputStream fos = new FileOutputStream("./java-io/lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


        FileWriter fw = new FileWriter("./java-io/lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("write teste");
        bw.write("\n");
        bw.write("opa");

        bw.close();
    }
}
