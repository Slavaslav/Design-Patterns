package com.patterns.decorator.second_example;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new ByteArrayInputStream("TestString".getBytes())));
        int c;
        while ((c = inputStream.read()) != -1) {
            System.out.println((char) c);
        }
        inputStream.close();
    }
}
