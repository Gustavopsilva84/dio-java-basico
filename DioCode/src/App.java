
public class App {

    public static void main(String[] args) throws Exception {
        int numero1 = 1;
        int numero2 = 1;
        
        if(numero1== 2 & numero2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");
        
        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);
        

        for (int i = 0; i < 5; i++) {
            System.out.println("Olha o for: " + ++numero1);
        }

        System.out.println("Qual O numero? " + numero2++);
        System.out.println("Olá Tudo bem?");

    }
}
