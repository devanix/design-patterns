package com.devanix.etc.decorator.io;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(System.getProperty("user.dir") + "/example/src/main/java/com/devanix/etc/decorator/io/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (
                InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream(System.getProperty("user.dir") + "/example/src/main/java/com/devanix/etc/decorator/io/test.txt")))) {
            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
