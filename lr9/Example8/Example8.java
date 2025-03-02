package lr9.Example8;

public class Example8 {
    private Node head;

    // Методы с использованием цикла
    public void createHead() {
        head = new Node(1);
        Node current = head;
        for (int i = 2; i <= 5; i++) { // Пример создания списка из 5 элементов
            current.next = new Node(i);
            current = current.next;
        }
    }

    public void createTail() {
        head = null;
        for (int i = 5; i >= 1; i--) { // Пример создания списка из 5 элементов
            Node newNode = new Node(i);
            newNode.next = head;
            head = newNode;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    public void insert(int value, int position) {
        if (position == 0) {
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void remove(int position) {
        if (position == 0) {
            removeFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    // Методы с использованием рекурсии
    public void createHeadRec() {
        head = createHeadRecHelper(1, 5); // Пример создания списка из 5 элементов
    }

    private Node createHeadRecHelper(int value, int max) {
        if (value > max) return null;
        return new Node(value, createHeadRecHelper(value + 1, max));
    }

    public void createTailRec() {
        head = createTailRecHelper(5, 1); // Пример создания списка из 5 элементов
    }

    private Node createTailRecHelper(int value, int min) {
        if (value < min) return null;
        return new Node(value, createTailRecHelper(value - 1, min));
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null) return "";
        return node.value + " " + toStringRecHelper(node.next);
    }

    public static void main(String[] args) {
        Example8 list = new Example8();

        // Тестирование циклических методов
        System.out.println("Создание с головы (цикл):");
        list.createHead();
        System.out.println(list.toString());

        System.out.println("\nСоздание с хвоста (цикл):");
        list.createTail();
        System.out.println(list.toString());

        list.addFirst(0);
        System.out.println("\nПосле addFirst(0): " + list.toString());

        list.addLast(6);
        System.out.println("После addLast(6): " + list.toString());

        list.insert(3, 3);
        System.out.println("После insert(3, 3): " + list.toString());

        list.removeFirst();
        System.out.println("После removeFirst(): " + list.toString());

        list.removeLast();
        System.out.println("После removeLast(): " + list.toString());

        list.remove(2);
        System.out.println("После remove(2): " + list.toString());

        // Тестирование рекурсивных методов
        System.out.println("\nСоздание с головы (рекурсия):");
        list.createHeadRec();
        System.out.println(list.toStringRec());

        System.out.println("\nСоздание с хвоста (рекурсия):");
        list.createTailRec();
        System.out.println(list.toStringRec());
    }
}