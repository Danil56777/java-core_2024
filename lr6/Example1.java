package lr6;

public class Example1 {
    private char symbol;
    private String text;

    public Example1() {
        this.symbol = '\0';
        this.text = "";
    }

    public void setValues(char symbol) {
        this.symbol = symbol;
    }

    public void setValues(String text) {
        this.text = text;
    }

    public void setValues(char[] symbols) {
        if (symbols.length == 1) {
            this.symbol = symbols[0];
        } else {
            this.text = new String(symbols);
        }
    }

    public void display() {
        System.out.println("Symbol: " + symbol);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();

        obj.setValues('A');
        obj.display();

        obj.setValues("Hello, world!");
        obj.display();

        obj.setValues(new char[]{'X'});
        obj.display();

        obj.setValues(new char[]{'T', 'e', 's', 't'});
        obj.display();
    }
}
