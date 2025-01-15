package lr5;

public class Example6 {
    private int max;
    private int min;

    public Example6(int max, int min) {
        if (max >= min) {
            this.max = max;
            this.min = min;
        } else {
            this.max = min;
            this.min = max;
        }
    }

    public void setValues(int value1, int value2) {
        if (value1 > value2) {
            this.max = value1;
            this.min = value2;
        } else {
            this.max = value2;
            this.min = value1;
        }
    }

    public void setValues(int value) {
        this.max = value;
        this.min = value;
    }

    public void display() {
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static void main(String[] args) {
        Example6 obj1 = new Example6(10, 5);
        obj1.display();

        obj1.setValues(20, 30);
        obj1.display();

        obj1.setValues(50);
        obj1.display();
    }
}
