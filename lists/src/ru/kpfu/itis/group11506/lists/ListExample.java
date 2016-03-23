package ru.kpfu.itis.group11506.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for (int index = 0; index<10; index++) {
			intList.add(index+1);
		}
		for (Integer element: intList) {
			System.out.println(element);
		}
		System.out.println(intList.size()); // Получить размер
		System.out.println(intList.remove(1)); // Удаление по индексу
		//		intList.remove(3);


		List<String> names = new ArrayList<>();
		names.add("Rustem");
		names.add("Nikita");

		for (String element: names) {
			System.out.println(element);
		}
		names.remove("Rustem");
	}

}
