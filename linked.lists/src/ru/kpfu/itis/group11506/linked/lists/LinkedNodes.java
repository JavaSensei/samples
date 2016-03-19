package ru.kpfu.itis.group11506.linked.lists;

public class LinkedNodes<T> {

	private Node<T> startNode;

	private Node<T> lastNode;

	/**
	 * Инициализирует начальные данные
	 */
	public void init() {
		startNode = null;
		lastNode = null;
	}

	/**
	 * Добавляет последний элемент в списке с указанным в параметре
	 * значением
	 * @param value
	 * @return Добавленный элемент
	 */
	public Node<T> addLastNode(T value) {
		Node<T> newNode = new Node<>();
		newNode.setValue(value);
		if (startNode == null) {
			startNode = newNode;
		}
		if (lastNode != null) {
			lastNode.setNode(newNode);
		}
		lastNode = newNode;
		return newNode;
	}

	public void addLastNode(Node<T> node) {
		// TODO
	}

	public Node<T> getStartNode() {
		return startNode;
	}

	/**
	 * Удаляет последний элемент в списке
	 */
	public Node<T> removeLastNode() {
		// TODO:
		return null;
	}

}
