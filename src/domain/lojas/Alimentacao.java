package domain.lojas;

import domain.Data;
import domain.Endereco;
import domain.Loja;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data dataFundacao, Endereco endereco, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, dataFundacao, endereco);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() + "Alimentacao{" +
                "dataAlvara=" + dataAlvara +
                '}';
    }
}
