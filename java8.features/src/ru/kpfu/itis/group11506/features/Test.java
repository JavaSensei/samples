package ru.kpfu.itis.group11506.features;

@FunctionalInterface
public interface Test<T> {

    boolean test(T testedParam);

}
