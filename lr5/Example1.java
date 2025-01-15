package lr5;

public class Example1 {
    private char symbol;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getSymbolCode() {
        return (int) symbol;
    }

    public void displaySymbolAndCode() {
        System.out.println("Символ: " + symbol + ", Код символа: " + (int) symbol);
    }

    public static void main(String[] args) {
        Example1 handler = new Example1();

        handler.setSymbol('A');

        System.out.println("Код символа: " + handler.getSymbolCode());

        handler.displaySymbolAndCode();
    }
}

