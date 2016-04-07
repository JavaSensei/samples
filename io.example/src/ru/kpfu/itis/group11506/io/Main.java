package ru.kpfu.itis.group11506.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//		byteArrayExample();
		//		readFile();
		writeFile();
	}


	private static void writeFile() {
		String someStr = "Some text";

		try (BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(new File("/home/zer0/samples/io.example/src/ru/kpfu/itis/group11506/io/SomeFile.txt")))) {
			bos.write(someStr.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



	private static void readFile() {
		byte[] buffer = new byte[100];
		try(InputStream fis
				= new BufferedInputStream(
						new FileInputStream(
								new File("/home/zer0/samples/io.example/src/ru/kpfu/itis/group11506/io/Main.java")))){
			fis.read(buffer);

			String code = new String(buffer);
			System.out.println(code);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


















	private static void byteArrayExample() {
		String name = "Egor";
		byte[] nameArr = name.getBytes();

		byte[] bufferArr = new byte[6];

		ByteArrayInputStream bais = new ByteArrayInputStream(nameArr);
		try {
			bais.read(bufferArr);
			System.out.println(Arrays.toString(bufferArr));

			String comeBack = new String(bufferArr);
			System.out.println(comeBack);
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Ошибка при чтении массива байтов: "
					+ e.getMessage());
		}
	}

}
