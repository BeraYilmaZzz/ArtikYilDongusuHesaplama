import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int yıl;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz :");
        yıl = inp.nextInt() ;
        if(yıl%4 == 0 || yıl%400 == 0){
            System.out.println( yıl + "bir artık yıldır !");
        }else {
            System.out.println(yıl + "bir artık yıl değildir !! ");
        }
    }
}
