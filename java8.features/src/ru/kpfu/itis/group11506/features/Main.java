package ru.kpfu.itis.group11506.features;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Test<Integer> test = new Test<Integer>() {

            @Override
            public boolean test(Integer testedParam) {
                return testedParam > 0;
            }

        };

        List<Student> studentList = new ArrayList<>();

        final int minAge = 18;
        final int diff = 5;


        for (int index = 0; index<10; index++) {
            int age = minAge + (int)(Math.random() * diff);
            studentList.add(new Student("Name " + index, age, index));
        }


        System.out.println(studentList);
        List<Student> byAge = filterByCondition(studentList,
                student -> student.getAge() > 20
        );


        studentList.stream()
                .filter(student -> student.getAge() > 20)
                .filter(student -> student.getGroup() > 5)
                .forEach(student -> System.out.println(student));



        System.out.println(byAge);
        filterByCondition(studentList, new Test<Student>() {
            @Override
            public boolean test(Student testedParam) {
                return testedParam.getGroup() > 5;
            }
        });
    }

    private static List<Student> filterByCondition(
            List<Student> sourceList,
            Test<Student> test) {
        List<Student> destList = new ArrayList<>();
        for (Student student : sourceList) {
            if (test.test(student)) {
                destList.add(student);
            }
        }
        return destList;
    }


}
