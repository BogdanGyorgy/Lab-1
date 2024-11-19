import java.util.Random;
import java.util.Stack;



public class Mainex5 {
    public static void main (String[] args)
    {
        Stack<Integer>stack= new Stack<>();
        Random randomGenerator= new Random();
        int n = randomGenerator.nextInt(20);
        System.out.println("Numarul random este : " +n);

        int a=0,b=1 ,c=0, count;
        stack.push(a);

        for(count=5; count >= 0; count--) {

            c = a + b;
            a = b;
            b = c;


          stack.push(c);
        }

        System.out.println( stack);
        int i ;
    int ok=0;
        while (!stack.isEmpty()) {
            i = stack.pop();
            if (n == i) {
                ok=1;
                break;

            }
        }
        if(ok==1 )
            System.out.println("Numarul apartine sirului lui Fibonacci");
            else
                System.out.println("Numarul nu apartine sirului lui Fibonacci");







    }

}
