package lr5;

public class Example3 {
    private int firstNumber;
    private int secondNumber;

    public Example3() {
        this.firstNumber = 0;
        this.secondNumber = 0;
    }

    public Example3(int firstNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = 0;
    }

    public Example3(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void displayNumbers() {
        System.out.println("Первое число: " + firstNumber + ", Второе число: " + secondNumber);
    }

    public static void main(String[] args) {

        Example3 obj1 = new Example3();
        obj1.displayNumbers();

        Example3 obj2 = new Example3(10);
        obj2.displayNumbers();

        Example3 obj3 = new Example3(10, 20);
        obj3.displayNumbers();
    }
}

