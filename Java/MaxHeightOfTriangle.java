import java.util.Scanner;

public class MaxHeightOfTriangle {
    public static int check(int a, int b) {
        int count = 0, f = 0, l = 1;

        while (a > 0 || b > 0) {
            if (f == 0) {
                if (a >= l) {
                    a = a - l;
                } else
                    break;
            } else {
                if (b >= l) {
                    b = b - l;
                } else
                    break;
            }
            count++;
            l++;
            f = f ^ 1;
        }
        return count;
    }

    public static int maxHeightOfTriangle(int r, int b) {
        int h1 = check(r, b);
        int h2 = check(b, r);
        int result = 0;
        if (h1 > h2)
            result = h1;
        else
            result = h2;

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter value of red: ");
        int r = s.nextInt();
        System.out.print("Enter value of blue: ");
        int b = s.nextInt();

        System.out.print("The output is: ");
        System.out.println(maxHeightOfTriangle(r,b));  
    }
}
