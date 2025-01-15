package lr5;

public class Example5 {
    private int value;

    public Example5() {
        this.value = 0;
    }

    public Example5(int value) {
        setValue(value);
    }

    public void setValue() {
        this.value = 0;
    }

    public void setValue(int value) {
        if (value > 100) {
            this.value = 100;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Example5 obj1 = new Example5();
        System.out.println("Значение после создания объекта без аргументов: " + obj1.getValue());

        Example5 obj2 = new Example5(50);
        System.out.println("Значение после создания объекта с аргументом: " + obj2.getValue());

        obj1.setValue(120);
        System.out.println("Значение после использования setValue(120): " + obj1.getValue());

        obj1.setValue();
        System.out.println("Значение после использования setValue() без аргументов: " + obj1.getValue());
    }
}
