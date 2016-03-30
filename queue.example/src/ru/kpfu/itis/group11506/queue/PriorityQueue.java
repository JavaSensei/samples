package ru.kpfu.itis.group11506.queue;

import java.util.Comparator;

public interface PriorityQueue<T> extends Queue<T> {

	Comparator<T> getComparator();

}
