package ru.kpfu.itis.group11506.ide.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentSelector {

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

	public String[] getStudents(int stCount) {
		String[] result = new String[stCount];
		List<Integer> alreadySelected = new ArrayList<>();
		int k = 0;
		Random random = new Random();
		while(k < stCount) {
			int randomValue = 0;
			do {
				randomValue = random.nextInt(STUDENTS.length);
			} while(alreadySelected.contains(randomValue));
			result[k] = STUDENTS[randomValue];
			alreadySelected.add(randomValue);
			k++;
		}
		return result;
	}

}
