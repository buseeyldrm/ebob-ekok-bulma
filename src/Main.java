import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("1.sayıyı gir: ");
        int a= klavye.nextInt();
        System.out.print("2.sayıyı gir: ");
        int b= klavye.nextInt();

        int ebob=1;
        int ekok=1;

        //FOR İLE EBOB EKOK BULMA

     /*   for (int i = 1; i <=a ; i++) {
            if (a%i==0 && b%i==0){
                ebob=i;
            }

        }
        System.out.println("Sayıların Ebobu: " +ebob);
        ekok=(a*b)/ebob;
        System.out.println("Sayıların Ekoku: " +ekok);

      */


        //ekok  bulma:

    /*    for (int i = 1; i <=(a*b) ; i++) {
            if (i%a==0 &&i%b==0){
                System.out.println(i);
                break;
            }

     */

        //WHİLE İLE EBOB EKOK BULMA:

        int i=1;
        while (i<=a){
            if (a%i==0 && b%i==0){
                ebob=i;

            }
            i++;

        }
        ekok=(a*b)/ebob;
        System.out.println("Sayıların ebobu: " +ebob);
        System.out.println("Sayıların ekoku: " +ekok);

        }
    }
