import java.util.Locale;
import java.util.Scanner;


public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Oi, fui executado pelo Terminal");
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos anos você tem?");
        int idade = scan.nextInt();
        System.out.println("Quanto de altura você tem?");
        double altura = scan.nextDouble();

        System.out.println("*--------------------------*");
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: "+ altura);
        System.out.println("*--------------------------*");

        scan.close();
    }
}