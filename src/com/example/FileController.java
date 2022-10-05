package com.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;

public class FileController {

    private FileController(){};

    public static void saveData(String fileName, char result){
        writeToFile(fileName, result);
    }

    public static void saveData(String fileName, String result){
        writeToFile(fileName, result);
    }

    public static String loadData(String fileName){
        StringBuilder resultText = new StringBuilder();
        File file = new File(fileName);
        // read data
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String text;
            while ((text = reader.readLine()) != null) {
                resultText.append(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.printf("File %s not found ", fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultText.toString();
    }

    private static void writeToFile(String fileName, char str){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.printf("File %s not found ", fileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while writing to a file");
        }
    }

    private static void writeToFile(String fileName, String str){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.printf("File %s not found ", fileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while writing to a file");
        }
    }
}
