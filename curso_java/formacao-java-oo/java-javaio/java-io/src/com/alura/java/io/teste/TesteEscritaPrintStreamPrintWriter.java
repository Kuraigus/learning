package com.alura.java.io.teste;

import java.awt.print.Printable;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com arquivo

//        OutputStream fos = new FileOutputStream("./java-io/lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


//        FileWriter fw = new FileWriter("./java-io/lorem2.txt");
//        BufferedWriter bw = new BufferedWriter(fw);

        PrintStream ps = new PrintStream("./java-io/lorem2.txt");

        ps.println("write novo");
        ps.println("kk");
//        bw.write("write teste");
//        bw.write("\n");
//        bw.write("opa");

        ps.close();
    }
}
