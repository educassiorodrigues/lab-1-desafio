import domain.Data;
import domain.Endereco;
import domain.Loja;

public class Main {
    public static void main(String[] args) {
        System.out.println(1 + "positivo");
        System.out.println("Hello world!");

        Data hoje = new Data(9, 05, 2023);
        Endereco endereco = new Endereco("coronel alvaro de moraes", "montenegro", "rs", "brasil", "92523570", "1115", "");
        Loja loja = new Loja("Uniloja", 10, endereco, hoje);

        System.out.println(loja);
    }
}