package ru.kpfu.itis.group11506.io;

import java.io.*;
import java.nio.charset.Charset;

public class StringIO {

    public static void main(String[] args) {
//        simpleWrite();
//        writeUnicode();
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(
                    new FileOutputStream("out.txt"));
            System.setOut(printStream);
            System.out.println("Hello!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }finally {
            if (printStream != null) {
                printStream.close();
            }
        }
    }

    private static void writeUnicode() {
        try (PrintWriter printWriter = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("out.txt"),
                                Charset.forName("WINDOWS-1251"))))) {

            printWriter.print("Егор");

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void simpleWrite() {
        try (BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("./out.txt"))) {

            String text = "Егор";
            byte[] bytes = text.getBytes();
            bos.write(bytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
