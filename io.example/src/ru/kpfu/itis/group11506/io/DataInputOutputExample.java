package ru.kpfu.itis.group11506.io;

import java.io.*;
import java.util.Arrays;

public class DataInputOutputExample {

    public static void main(String[] args) {
//        byte[] outBuffer = new byte[100];

        DataOutputStream outStream = null;
        DataInputStream inputStream = null;
        try {
            ByteArrayOutputStream bais
                    = new ByteArrayOutputStream();
            outStream = new DataOutputStream(bais);
            outStream.writeInt(1012341234);

            System.out.println(Arrays.toString(bais.toByteArray()));

            inputStream = new DataInputStream(
                    new ByteArrayInputStream(bais.toByteArray()));
            int extractedInt = inputStream.readInt();

            System.out.println(extractedInt);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
