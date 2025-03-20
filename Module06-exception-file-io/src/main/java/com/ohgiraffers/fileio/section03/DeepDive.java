package com.ohgiraffers.fileio.section03;

import java.io.FileReader;
import java.io.IOException;

public class DeepDive {

    public static void readNonExistentFile() throws IOException {
        try(FileReader reader = new FileReader("non_existent.txt")){
            reader.read();
        }
    }
}