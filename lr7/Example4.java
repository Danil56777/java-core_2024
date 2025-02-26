package lr7;

class FirstClassEx4 {
    public char charField;

    public FirstClassEx4(char symbol) {
        this.charField = symbol;
    }

    public FirstClassEx4(FirstClassEx4 other) {
        this.charField = other.charField;
    }

    @Override
    public String toString() {
        return "FirstClassEx4 [charField=" + charField + "]";
    }
}

class SecondClassEx4 extends FirstClassEx4 {
    public String textField;

    public SecondClassEx4(char symbol, String text) {
        super(symbol);
        this.textField = text;
    }

    public SecondClassEx4(SecondClassEx4 other) {
        super(other);
        this.textField = other.textField;
    }

    @Override
    public String toString() {
        return "SecondClassEx4 [charField=" + charField + ", textField=" + textField + "]";
    }
}

class ThirdClassEx4 extends SecondClassEx4 {
    public int intField;

    public ThirdClassEx4(char symbol, String text, int number) {
        super(symbol, text);
        this.intField = number;
    }

    public ThirdClassEx4(ThirdClassEx4 other) {
        super(other);
        this.intField = other.intField;
    }

    @Override
    public String toString() {
        return "ThirdClassEx4 [charField=" + charField + ", textField=" + textField + ", intField=" + intField + "]";
    }
}

public class Example4 {
    public static void main(String[] args) {
        FirstClassEx4 firstObj = new FirstClassEx4('A');
        SecondClassEx4 secondObj = new SecondClassEx4('B', "Hello");
        ThirdClassEx4 thirdObj = new ThirdClassEx4('C', "World", 42);

        System.out.println("Исходные объекты:");
        System.out.println(firstObj);
        System.out.println(secondObj);
        System.out.println(thirdObj);

        FirstClassEx4 firstCopy = new FirstClassEx4(firstObj);
        SecondClassEx4 secondCopy = new SecondClassEx4(secondObj);
        ThirdClassEx4 thirdCopy = new ThirdClassEx4(thirdObj);

        System.out.println("\nКопии объектов:");
        System.out.println(firstCopy);
        System.out.println(secondCopy);
        System.out.println(thirdCopy);
    }
}