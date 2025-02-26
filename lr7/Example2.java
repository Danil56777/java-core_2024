package lr7;

class BaseClass {
    private String textField;

    public BaseClass(String text) {
        this.textField = text;
    }

    public void setField(String text) {
        this.textField = text;
    }

    public int getTextLength() {
        return this.textField.length();
    }
}

class SubClassExample1 extends BaseClass {
    public int numberField;

    public SubClassExample1(String text, int number) {
        super(text);
        this.numberField = number;
    }

    public void setField() {
        super.setField("Default Text");
        this.numberField = 0;
    }

    public void setField(String text) {
        super.setField(text);
    }

    public void setField(int number) {
        this.numberField = number;
    }

    public void setField(String text, int number) {
        super.setField(text);
        this.numberField = number;
    }
}

public class Example2 {
    public static void main(String[] args) {
        SubClassExample1 obj = new SubClassExample1("Hello", 42);
        System.out.println("Длина строки: " + obj.getTextLength());
        System.out.println("Числовое поле: " + obj.numberField);
    }
}