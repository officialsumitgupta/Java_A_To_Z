package Basic_Program;

class Calculator {
    public int add(int n1, int n2) {
        int i=10;

        return n1 + n2;
    }
}

public class create_object {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 9;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}
