import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int san = scan.nextInt(); //double san=Math.sqrt(san)-Math.floor(Math.sqrt(san));
        int san2 = (int) Math.sqrt(san);     //sout(Math.sqrt(8));
        int san3 = (int) Math.pow(san2, 2);
        if (san == san3) {    //san ==  0
            System.out.println("True");    //sout(san)
            //throw new Error();
        } else {
            throw new Error();
//        }else{
//
//        }


        }
    }
}