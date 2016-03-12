package ru.kpfu.itis.group11506.linked.lists;

public class Main {

	public static void main(String[] args) {
		LinkedNodes<Boolean> list = new LinkedNodes<>();
		list.init();

		list.addLastNode(true);
		list.addLastNode(true);
		list.addLastNode(true);
		list.addLastNode(true);
		list.addLastNode(true);

		CycleDetermination cycleDetermination = new CycleDetermination();
		boolean hasCycle = cycleDetermination.hasCicle(list);

		list.addLastNode(list.getStartNode());

		boolean hasCycleAfterAdding = cycleDetermination.hasCicle(list);

	}

}
