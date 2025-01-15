package lr5;

public class Example4 {
    private int intValue;
    private char charValue;

    public Example4(int intValue, char charValue) {
        this.intValue = intValue;
        this.charValue = charValue;
    }

    public Example4(double value) {
        this.charValue = (char) ((int) value);

        this.intValue = (int) ((value - (int) value) * 100);
    }

    public int getIntValue() {
        return intValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void display() {
        System.out.println("Целочисленное значение = " + intValue);
        System.out.println("Символьное значение = " + charValue);
    }

    public static void main(String[] args) {
        Example4 obj1 = new Example4(12, 'A');
        obj1.display();

        Example4 obj2 = new Example4(65.1267);
        obj2.display();
    }
}

