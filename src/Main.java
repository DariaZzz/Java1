import java.text.DecimalFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// A + B
/*public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a + b);
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        System.out.println(a % 10);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        System.out.println(a % 10 + a / 10 % 10 + a / 100);
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        System.out.println(a + (2 - a % 2));
    }
}*/


/*public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        System.out.println(a * n + (b * n / 100) + " " + b * n % 100);
    }
}*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        DecimalFormat dF = new DecimalFormat("00");
        int s = in.nextInt();
        int h = s / 3600 % 24;
        int m = s / 60 % 60;
        int sec = s % 3600 % 60;
        System.out.println(h + ":" + dF.format(m) + ":" + dF.format(sec));
    }
}
/* public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        if (a > 0) {
            if (a / 10 == 0)
                System.out.println("DIGIT");
            else if (a / 100 == 0)
                System.out.println("NUM");
            else
                System.out.println("OTHER");
        }
        else
            System.out.println("OTHER");
        }
}*/
/* public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int k = 0;
        while (a >= b){
            a -= b;
            k++;
        }
        System.out.println(k + " " + a);

    }
}*/
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] m = {};
//        for (int i=0;i<n;i++){
//            m[i] = in.nextInt();
//        }
//        int f = in.nextInt();
//        for (int j=0;j<n;j++){
//            if (m[j] == f) {
//                System.out.println(j + 1);
//                return;
//            }
//        }
//        System.out.println("NO");
//    }
//}




