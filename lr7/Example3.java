package lr7;

class FirstClass {
    public int intField;

    public FirstClass(int number) {
        this.intField = number;
    }

    public void setField(int number) {
        this.intField = number;
    }

    @Override
    public String toString() {
        return "FirstClass [intField=" + intField + "]";
    }
}

class SecondClass extends FirstClass {
    public char charField;

    public SecondClass(int number, char symbol) {
        super(number);
        this.charField = symbol;
    }

    public void setField(int number, char symbol) {
        super.setField(number);
        this.charField = symbol;
    }

    @Override
    public String toString() {
        return "SecondClass [intField=" + intField + ", charField=" + charField + "]";
    }
}

class ThirdClass extends SecondClass {
    public String textField;

    public ThirdClass(int number, char symbol, String text) {
        super(number, symbol);
        this.textField = text;
    }

    public void setField(int number, char symbol, String text) {
        super.setField(number, symbol);
        this.textField = text;
    }

    @Override
    public String toString() {
        return "ThirdClass [intField=" + intField + ", charField=" + charField + ", textField=" + textField + "]";
    }
}

public class Example3 {
    public static void main(String[] args) {
        FirstClass firstObj = new FirstClass(10);
        System.out.println(firstObj);

        SecondClass secondObj = new SecondClass(20, 'A');
        System.out.println(secondObj);

        ThirdClass thirdObj = new ThirdClass(30, 'B', "Hello");
        System.out.println(thirdObj);

        System.out.println("\nПосле изменения значений:");
        firstObj.setField(15);
        System.out.println(firstObj);

        secondObj.setField(25, 'C');
        System.out.println(secondObj);

        thirdObj.setField(35, 'D', "World");
        System.out.println(thirdObj);
    }
}
