import java.net.SocketOption;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     

        Scanner scanner = new Scanner(System.in);
        System.out.print("n=");
        int n = scanner.nextInt();
        int i ;
        int nr = 0;

        for (i=1; i<=n;i++)
        {
            if( n%i==0)
            {
                System.out.println(+i);
                nr++;
            }
            if( nr == 2)
            {
                System.out.println("Numarul este prim");
            }

        }
        scanner.close();
    }
}