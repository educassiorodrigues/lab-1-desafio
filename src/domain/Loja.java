package domain;

import java.util.Arrays;

import static java.util.Objects.isNull;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Data dataFundacao;
    private Endereco endereco;

    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data dataFundacao, Endereco endereco) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
        this.salarioBaseFuncionario = -1;
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }


    protected Loja() {
    }

    public void imprimeProdutos() {

        for (Produto produto : this.estoqueProdutos) {

            if (isNull(produto)) {
                continue;
            }

            System.out.println(produto);
        }
    }

    public boolean insereProduto(Produto produto) {
        // na moral, porque nao trabalhar com list quando as listas vão ser manipuladas ? coisa de faculdade mesmo
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (isNull(this.estoqueProdutos[i])) {
                this.estoqueProdutos[i] = produto;
                return true;
            }
        }

        return false;
    }

    public boolean removeProduto(String nome) {
        if (this.estoqueProdutos.length == 0) {
            return false;
        }

        boolean contemProduto = Arrays.stream(this.estoqueProdutos).anyMatch(loja -> !isNull(loja) && loja.getNome().equals(nome));
        if (!contemProduto) {
            return false;
        }

        this.estoqueProdutos = Arrays.stream(this.estoqueProdutos)
                .filter(produto -> !isNull(produto) && !produto.getNome().equals(nome))
                .toArray(Produto[]::new);

        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public double gastosComSalario() {
        return this.salarioBaseFuncionario == -1 ? -1 : this.quantidadeFuncionarios * this.salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (this.quantidadeFuncionarios < 10) {
            return 'P';
        }

        if (this.quantidadeFuncionarios <= 30) {
            return 'M';
        }

        return 'G';
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", dataFundacao=" + dataFundacao +
                ", endereco=" + endereco +
                ", estoqueProdutos=" + this.estoqueProdutos +
                '}';
    }
}
