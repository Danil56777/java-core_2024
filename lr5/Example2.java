package lr5;

public class Example2 {
    private char startSymbol;
    private char endSymbol;

    public void setSymbols(char start, char end) {
        if (start > end) {
            this.startSymbol = end;
            this.endSymbol = start;
        } else {
            this.startSymbol = start;
            this.endSymbol = end;
        }
    }

    public void displaySymbolsInRange() {
        for (char c = startSymbol; c <= endSymbol; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Example2 handler = new Example2();

        handler.setSymbols('A', 'D');

        handler.displaySymbolsInRange();
    }
}

