package lr9.Example8;

public class Node {
    public int value;    // Значение узла
    public Node next;    // Ссылка на следующий узел

    // Конструктор с одним параметром (int value)
    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    // Конструктор с двумя параметрами (int value, Node next) для рекурсии и гибкости
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
