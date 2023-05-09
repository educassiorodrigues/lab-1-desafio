package domain.lojas;

import domain.Data;
import domain.Endereco;
import domain.Loja;

public class Bijuteria extends Loja {
    private double metaDeVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data dataFundacao, Endereco endereco) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, dataFundacao, endereco);
    }

    public double getMetaDeVendas() {
        return metaDeVendas;
    }

    public void setMetaDeVendas(double metaDeVendas) {
        this.metaDeVendas = metaDeVendas;
    }

    @Override
    public String toString() {
        return super.toString() + "Bijuteria{" +
                "metaDeVendas=" + metaDeVendas +
                '}';
    }
}
