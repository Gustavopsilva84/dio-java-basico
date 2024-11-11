public class SmartTV {
    Boolean Ligado = true;
    int canal = 0;
    int volume = 0;

    void ligaTV(){
        System.out.println("Ligado é: " + Ligado);
        Ligado = Ligado != true;
        System.out.println("Ligado é: " + Ligado);
    }

    void aumentaVol(){
        System.out.println("Aumenta\n\nVolume é " + volume);
        volume++;
        System.out.println("Volume é " + volume);
    }

    void diminuiVol(){
        System.out.println("Diminui\n\nVolume é " + volume);
        volume--;
        System.out.println("Volume é " + volume);
    }

    void aumentaCanal(){
        System.out.println("Aumenta\n\nCanal é " + canal);
        canal++;
        System.out.println("Canal é " + canal);
    }

    void diminuiCanal(){
        System.out.println("Diminui\n\nCanal é " + canal);
        canal--;
        System.out.println("Canal é " + canal);
    }

    void mudaCanal(int i){
        System.out.println("Muda Canal\n\nCanal é " + canal);
        canal = i;
        System.out.println("Canal agora é " + canal);
    }

    public static void main(String[] args) throws Exception {
        // Criação de uma instância da SmartTV para testar as funções
        SmartTV tv = new SmartTV();

        // Testando as funções
        tv.ligaTV();            // Alterna o estado de 'Ligado'
        tv.aumentaVol();        // Aumenta o volume
        tv.diminuiVol();        // Diminui o volume
        tv.aumentaCanal();      // Aumenta o canal
        tv.diminuiCanal();      // Diminui o canal
        tv.mudaCanal(5);        // Muda o canal para o canal 5
    }
}
