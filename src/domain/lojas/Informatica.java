package domain.lojas;

import domain.Data;
import domain.Endereco;
import domain.Loja;

public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data dataFundacao, Endereco endereco, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, dataFundacao, endereco);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() + "Informatica{" +
                "seguroEletronicos=" + seguroEletronicos +
                '}';
    }
}
