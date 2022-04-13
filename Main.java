package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        File inputData = new File("C:\\Users\\karen\\IdeaProjects\\05_AoC_01\\src\\com\\company\\inputData.txt");
        Scanner scanner = new Scanner(inputData);
        ArrayList<String> dataList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            dataList.add(scanner.nextLine());
        }
        int max =0;
        
        for (String s : dataList) {
            String row = s.substring(0, 7);
            String column = s.substring(7, 10);
            row = row.replace("F", "0").replace("B", "1");
            column = column.replace("L", "0").replace("R", "1");
            int ID = Integer.parseInt(row, 2) *8 + Integer.parseInt(column, 2);
            if (ID > max) {
                max = ID;
            }
        }
        System.out.println("Max ID: " + max);
    }
}
