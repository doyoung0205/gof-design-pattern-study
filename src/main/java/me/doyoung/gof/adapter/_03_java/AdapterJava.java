package me.doyoung.gof.adapter._03_java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterJava {

    public static void main(String[] args) {
        // collections
        List<String> strings = Arrays.asList("a", "b", "c"); // 넘긴건 배열이지만, List 로 받는다
        final Enumeration<String> enumeration = Collections.enumeration(strings);
        // 넘긴 건 리스트지만 Enumeration 로 받는다.
        // Enumeration: target 인터페이스, Collections.enumeration: 어뎁터
        // final Enumeration<String> enumeration = Collections.enumeration(strings); : 클라이언트
        final ArrayList<String> list = Collections.list(enumeration);

        // io
        try (InputStream is = new FileInputStream("input.txt");
             final InputStreamReader isr = new InputStreamReader(is);
             final BufferedReader reader = new BufferedReader(isr)) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
