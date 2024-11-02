class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    public int add(int a, int b, int c) {
        int sum = super.add(a, b, c);
        return sum;
    }

    public int add(int a, int b, int c, int d) {
        return super.add(a, b, c) + d;
    }
}

public class Main {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        System.out.println("Addition of 2 and 3: " + calc.add(2, 3));
        System.out.println("Addition of 2, 3, 4, and 5: " + calc.add(2, 3, 4, 5));
    }
}

