package com.day2022_11_21;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class write {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        File targetFile = createFile();
        writeToFile(targetFile  );
    }

    private static void writeToFile(File targetFile){
        try (
            FileOutputStream fos = new FileOutputStream(targetFile);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            PrintWriter pw = new PrintWriter(osw);
        ){
            System.out.println("输入的内容会实时写入文件，如果输入空行则结束");
            while (true){
                String lineToWrite = in.nextLine().trim();
                System.out.println("输入内容为"+lineToWrite);
                if(lineToWrite.trim().isEmpty()){
                    System.out.println("输入结束");
                    break;
                }else {
                    pw.println(lineToWrite);
                    pw.flush();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static File createFile() throws IOException{
        System.out.println("请输入文件名");
        String fileName = in.nextLine().trim();
        File f = new File("."+File.separator+fileName+".txt");
        if(f.isFile()){
            System.out.println("目标文件存在，删除："+f.delete());
        }
        System.out.println(File.separator);
        System.out.println(f.createNewFile());
        return f;
    }
}
