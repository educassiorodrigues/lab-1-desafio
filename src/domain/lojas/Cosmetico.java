package domain.lojas;

import domain.Data;
import domain.Endereco;
import domain.Loja;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data dataFundacao, Endereco endereco, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, dataFundacao, endereco);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "Cosmetico{" +
                "taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}
