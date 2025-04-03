package com.bridgelabz.junittesting;

import java.io.*;
public class FileProcessor {

    public String writeToFile(String filepath, String content) throws IOException {
        try(FileWriter fw = new FileWriter(filepath)) {
            fw.write(content+"\n");
            return "File written successfully";
        } catch (IOException e) {
            return "Unable to write file: " + e.getMessage();
        }
    }

    public String readFromFile(String filePath) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder result= new StringBuilder();
            String line;
            while((line=br.readLine())!=null) {
                result.append(line);
            }
            return result.toString();
        } catch (IOException e) {
            return "Unable to read file: " + e.getMessage();
        }
    }
}
