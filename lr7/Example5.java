package lr7;

class SuperClassEx5 {
    private String textField;

    public SuperClassEx5(String text) {
        this.textField = text;
    }

    public void displayInfo() {
        System.out.println("SuperClassEx5 [textField=" + textField + "]");
    }
}

class FirstSubClassEx5 extends SuperClassEx5 {
    protected int intField;

    public FirstSubClassEx5(String text, int number) {
        super(text);
        this.intField = number;
    }

    @Override
    public void displayInfo() {
        System.out.println("FirstSubClassEx5 [textField=accessible through inheritance, intField=" + intField + "]");
    }
}

class SecondSubClassEx5 extends SuperClassEx5 {
    protected char charField;

    public SecondSubClassEx5(String text, char symbol) {
        super(text);
        this.charField = symbol;
    }

    @Override
    public void displayInfo() {
        System.out.println("SecondSubClassEx5 [textField=accessible through inheritance, charField=" + charField + "]");
    }
}

public class Example5 {
    public static void main(String[] args) {
        SuperClassEx5 superObj = new SuperClassEx5("SuperText");
        FirstSubClassEx5 firstObj = new FirstSubClassEx5("FirstText", 42);
        SecondSubClassEx5 secondObj = new SecondSubClassEx5("SecondText", 'A');

        System.out.println("Проверка объектов:");
        superObj.displayInfo();
        firstObj.displayInfo();
        secondObj.displayInfo();

        System.out.println("\nВызов через переменную суперкласса:");
        SuperClassEx5 firstRef = firstObj;
        SuperClassEx5 secondRef = secondObj;
        firstRef.displayInfo();
        secondRef.displayInfo();
    }
}