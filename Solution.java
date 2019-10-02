package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        FileInputStream inputStream = new FileInputStream(filename);
        HashMap<Character, Integer> count = new HashMap<>();


        while (inputStream.available()>0) {
            int i = inputStream.read();
            if (!count.containsKey((char)i))
                count.put((char)i,1);
            else {
                int num = count.get((char)i);
                num++;
                count.put((char)i,num);
            }
        }
        inputStream.close();

        ArrayList<Character> sorted = new ArrayList<>(count.keySet());
        Collections.sort(sorted);

        for(int i = 0; i < sorted.size(); i++){
            System.out.println(sorted.get(i) + " " + count.get(sorted.get(i)));
        }

    }
}
