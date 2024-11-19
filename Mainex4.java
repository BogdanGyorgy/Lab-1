import java.net.SocketOption;
import java.util.Random;

public class Mainex4 {
    public static void main(String[] args)
    {
        Random randomGenerator = new Random();
        int a=randomGenerator.nextInt(30);
        int b=randomGenerator.nextInt(30);
        System.out.println(a);
        System.out.println(b);
        while(a!=b)
        {
            if(a>b)
                a=a-b;
                else
                    b=b-a;

        }

        System.out.println(+a);


    }

}
