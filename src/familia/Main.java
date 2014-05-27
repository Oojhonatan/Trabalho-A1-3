package familia;

import Vizinho.*;

public class Main {

    public static void main(String args[]) {
        Filha filha = new Filha();
        System.out.println("Senha Vista pela classe Main: " + filha.senhaPai);
        Vizinho vizinho = new Vizinho(filha);

    }

}