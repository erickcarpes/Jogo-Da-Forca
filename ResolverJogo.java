import java.util.ArrayList;

public class ResolverJogo {

    public boolean revelarLetra(String palavra, char[] letrasReveladas, char letra){
        boolean encontrou = false;
        for(int i = 0; i < palavra.length(); i++) {
            if(palavra.charAt(i) == letra) {
                letrasReveladas[i] = letra;
                encontrou = true;
            }
        }
        return encontrou;
    }

    public void exibirLetrasUsadas(ArrayList<Character> letrasUsadas){
        System.out.print("Letras Usadas: ");
        for(Character letra : letrasUsadas) {
            System.out.print(letra+"-");
        }
        System.out.println();
    }

    public void desenharBiscoito(){
        System.out.println("======================");
        System.out.println("Parabéns, voçê ganhou!");
        System.out.println("Tome aqui un biscuit: ");
        System.out.println("       _______");
        System.out.println("     /         \\");
        System.out.println("    /           \\");
        System.out.println("   |   O    O    |");
        System.out.println("   |     ---     |");
        System.out.println("    \\           /");
        System.out.println("     \\_________/");
        System.out.println("       Biscoito");
        System.out.println("======================");
    }
}
