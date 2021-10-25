package ua.com.alevel.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

    public void run(BufferedReader reader) {
        System.out.println("Task2.run");
        System.out.println("Please, enter some text");

        try {
            String somethingText = reader.readLine();
            char[] chars = somethingText.toCharArray();

            List<CharInt> charInts = new ArrayList<>();

            for (char currentChar : chars) {
                if (charInts.isEmpty()) {
                    CharInt newCharInt = new CharInt();
                    newCharInt.letter = currentChar;
                    newCharInt.count = 1;
                    charInts.add(newCharInt);
                } else {
                    boolean existChar = false;
                    for (CharInt charInt : charInts) {
                        if (currentChar == charInt.letter) {
                            existChar = true;
                            charInt.count++;
                        }
                    }
                    if (!existChar) {
                        CharInt newCharInt = new CharInt();
                        newCharInt.letter = currentChar;
                        newCharInt.count = 1;
                        charInts.add(newCharInt);
                    }
                }
            }

            Collections.sort(charInts);

            for (CharInt charInt : charInts) {
                System.out.println("charInt = " + charInt);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
