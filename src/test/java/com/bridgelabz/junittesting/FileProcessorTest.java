package com.bridgelabz.junittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileProcessorTest {
    private static FileProcessor fileProcessor;

    @BeforeEach
    public void setup(){
        fileProcessor = new FileProcessor();
    }

    @Test
    public void writeToFileTest() throws IOException {
        Assertions.assertEquals("File written successfully", fileProcessor.writeToFile("src/File.txt", "Hello World"));
    }
    @Test
    public void readFromFileTest() throws IOException {
        Assertions.assertEquals("Hello World", fileProcessor.readFromFile("src/File.txt"));
    }
}
