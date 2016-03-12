package ru.kpfu.itis.group11506.interfaces;

import java.util.Arrays;
import java.util.Random;

public class Student implements Comparable {

	private static final String[] STUDENTS= {"Андрианов Андрей Владимирович",
			"Биктимиров Азат Ильдарович",
			"Вильданов Данил Аликович",
			"Газизова Элина Азатовна",
			"Зиннуров Талгат Марселевич",
			"Зубаиров Рустем Фаридович",
			"Ибрагимов Шоаббос Рашид Угли",
			"Иштуганова Алина Радиковна",
			"Кильдияров Батыр Ринатович",
			"Кузнецов Сергей Максимович",
			"Лебедев Дмитрий Евгеньевич",
			"Павлов Егор Сергеевич",
			"Сергеев Артем Алексеевич",
			"Симаков Никита Евгеньевич",
			"Филиппенко Тарас Алексеевич",
			"Хайруллин Булат Равилевич",
			"Хакимов Адель Маратович",
			"Шайхутдинова Лейсан Рамилевна",
	"Шарипов Марат Мударисович"};

	private final String name;

	private int rating;
	public Student(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Object o) {
		int result = 0;
		if (o instanceof Student) {
			Student otherStudent = (Student)o;
			result = rating - otherStudent.rating;
		} else {
			result = -1;
		}
		return result;
	}

	@Override
	public String toString() {
		return name + "; rating " + rating;
	}

	public static void main(String[] args) {
		Student[] studentArray = new Student[STUDENTS.length];
		Random random = new Random();
		for (int index=0; index<STUDENTS.length; index++) {
			studentArray[index] = new Student(STUDENTS[index]);
			studentArray[index].setRating(random.nextInt(100));
		}

		Arrays.sort(studentArray);
		for (Student student: studentArray) {
			System.out.println(student);
		}
	}



}
