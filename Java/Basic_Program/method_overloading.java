package Basic_Program;
 
class Calculator {
    public int add(int n1, int n2, int n3) 
    {
        return n1 + n2 + n3;
    }
    
    public int add(int n1, int n2) 
    {
        return n1 + n2;
    }
    public double add(double n1, int n2) 
    {
        return n1 + n2;
    }
    
 }   

public class method_overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        // int m =  obj.add(10, 20);
        int m = obj.add(10, 20, 30);
        System.out.println(m);
    }
    
}