package Basic_Program;

public class conditional_Operators {
    public static void main(String[] args) {

        // If-elseIf-else Example

        // int x = 20;
        // int y = 8;
        // int z = 6;

        // if( x > y && x > z){
        // System.out.println(x);
        // }else if(y > x && y > z){
        // System.out.println(y);
        // }else
        // System.out.println(z);

        // If-else Example

        // int age = 18;

        // if (age >= 18 ){
        // System.out.println("Eligible for Vote..");
        // }else{
        // System.out.println("Not Eligible for Vote..");
        // }

        // Ternary Operator Example

        // int n = 6;
        // int result = 0;

        // result = n % 2 == 0 ? 10 : 20;

        // System.out.println(result);

        // Switch statement Example

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a Valid Number...");
                break;
        }

    }
}
