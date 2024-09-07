import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class JogoForca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Character> letrasUsadas = new ArrayList<>();
        ResolverJogo resolver = new ResolverJogo();

        System.out.println("===Jogo da Forca===");
        String[] palavras = {
                "procrastinaçao",
                "inconstitucionalissimo",
                "oftalmotorrinolaringologista",
                "paralelepipedo",
                "anticonstitucionalmente",
                "tetrafluoreto",
                "otorrinolaringologista",
                "quiropratico",
                "onomatopeia",
                "heterocromia",
                "pneumoultramicroscopicosilicovulcanoconiose",
                "subterraneo",
                "astronauta",
                "hieroglifo",
                "circunflexo",
                "estratosfera",
                "axioma",
                "conjectura",
                "efemero",
                "exacerbacao",
                "hiperbole",
                "inospito",
                "jurisprudencia",
                "meticuloso",
                "quimera",
                "reticente",
                "sobressalto",
                "transcendental",
                "verossimilhança",
                "xenofobia"
        };

        String palavraEscolhida = palavras[rand.nextInt(palavras.length)];
        char[] letrasReveladas = new char[palavraEscolhida.length()];
        int chancesRestantes = 8;

        for(int i = 0; i < palavraEscolhida.length(); i++) {
            letrasReveladas[i] = '-';
        }

        while (chancesRestantes > 0 && !palavraEscolhida.equals(new String(letrasReveladas))) {

            System.out.println("Chances restantes: " + chancesRestantes);
            System.out.println(letrasReveladas);
            System.out.print("Informe uma letra: ");
            char letra = in.nextLine().toLowerCase().charAt(0);

            if(letrasUsadas.contains(letra)) {
                System.out.println("Voçê já usou essa letra!");
                System.out.println();
                continue;
            }
            letrasUsadas.add(letra);

            if(!resolver.revelarLetra(palavraEscolhida, letrasReveladas, letra)) {
                System.out.println("Letra errada!");
                chancesRestantes--;
            }else{
                System.out.println("Letra certa!");
            }
            resolver.exibirLetrasUsadas(letrasUsadas);
            System.out.println();
        }

        if(palavraEscolhida.equals(new String(letrasReveladas))) {
            resolver.desenharBiscoito();
        }else{
            System.out.println("===============");
            System.out.println("Voçê perdeu!");
            System.out.println("kkkkkkkkkkkk");
            System.out.println("===============");
        }
    }
}