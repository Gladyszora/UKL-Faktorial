import java.util.Scanner;
public class UKLFaktorial {
    public static void main(String[] args) {
        Scanner input = new
        Scanner (System.in);

        System.out.println("Masukan sebuah bilangan bulat positif untuk dihitung faktorialnya: ");
        int n = input.nextInt();
        input.close();

        long Faktorial = 1;

        if (n < 0) {
            System.out.println("\n--------------------------------------------------------------");
            System.out.println("Error : Faktorial hanya didefinisikan untuk bilangan bulat positif atau nol.");
            return;
        }
           else {
            for ( int i = n; i >= 1; i--) 
                Faktorial *= i; // sama dengan : Faktorial = Faktorial * i;

                System.out.println("\n------------------------------------------------------------");
                if (n == 0) {
                    System.out.println("0! = 1");
                }else{
                    System.out.println(n + "! = " + Faktorial);
                }
                System.out.println("--------------------------------------------------------------");
            }
           }
    }
            

            