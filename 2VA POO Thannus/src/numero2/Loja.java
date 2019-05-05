package numero2;
import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Cd cd1 = new Cd(165434578, "Nirvana", 21.99, 18);
        Cd cd2 = new Cd(986756748, "Night Lovell", 26.90, 20);
        Dvd dvd1 = new Dvd(968745632, "Fome de poder", 29.90, "1:55");
        Dvd dvd2 = new Dvd(764356789, "Poderoso chefão", 39.90, "2:58");
        Livro livro1 = new Livro(564535563, "Fantasma no sistema", 81.90, "Kevin Mitnick");

        produtos.add(cd1);
        produtos.add(cd2);
        produtos.add(dvd1);
        produtos.add(dvd2);
        produtos.add(livro1);

        for (Produto produto : produtos){
            System.out.println(produto.toString());
        }

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\nInsira aqui o código de barras do produto desejado: \n");
        int cod_barra = entrada.nextInt();
        Loja.FindProduct(produtos, cod_barra);
    }

    public static void FindProduct(ArrayList<Produto> produtos, int cod_barra){
        for (Produto produto : produtos){
            if (produto.GetCod_Barra() == cod_barra){
                System.out.println(produto.toString());
                return;
            }
        }
        System.out.println("\nNão encontrado\n");
    }
}
