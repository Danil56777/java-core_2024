package lr7;

class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SuperClass: text = " + text;
    }
}

class   SubClass extends SuperClass {
    private String additionalText;

    public SubClass(String text) {
        super(text);
        this.additionalText = "";
    }

    public SubClass(String text, String additionalText) {
        super(text);
        this.additionalText = additionalText;
    }

    @Override
    public String toString() {
        return "SubClass: text = " + super.toString().split("= ")[1] + ", additionalText = " + additionalText;
    }
}

public class Example1 {
    public static void main(String[] args) {
        SuperClass superInstance = new SuperClass("Hello");
        System.out.println(superInstance.toString());

        SubClass subInstance1 = new SubClass("Hello");
        System.out.println(subInstance1.toString());

        SubClass subInstance2 = new SubClass("Hello", "World");
        System.out.println(subInstance2.toString());
    }
}
