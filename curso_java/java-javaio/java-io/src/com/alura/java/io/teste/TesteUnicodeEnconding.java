package com.alura.java.io.teste;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEnconding {

    public static void main(String[] args) throws Exception {
        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes(charset.displayName());
        System.out.println(bytes.length + ", " + charset.displayName());
    }
}
