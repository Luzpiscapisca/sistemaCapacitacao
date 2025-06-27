package entidades;

import javax.xml.namespace.QName;

public class Produto {
    private String nome;
    private double preco;
    private double valorTotal;

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    private int quantidadeEstoque;


    private int adicionarEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double valorTotalemEstoque(){
        this.valorTotal = this.quantidadeEstoque * this.preco;
        return(this.valorTotal);
    }
    public void adicionarEstoque(int quantidadeEstoque){
        this.quantidadeEstoque += quantidadeEstoque;
    }
    public void removerEstoque(int quantidadeEstoque){
        this.quantidadeEstoque -= quantidadeEstoque;
    }
    public String repeticao(){
        return nome
            + ", R$"
            + String.format("%.2f", preco)
            + ", "
            + quantidadeEstoque
            + " unidades, Total: R$"
            + String.format("%.2f", valorTotalemEstoque());
    }
}
