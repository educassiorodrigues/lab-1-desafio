package domain.lojas;

import domain.Data;
import domain.Endereco;
import domain.Loja;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data dataFundacao, Endereco endereco, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, dataFundacao, endereco);
        this.produtosImportados = produtosImportados;
    }

    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + "Vestuario{" +
                "produtosImportados=" + produtosImportados +
                '}';
    }
}
