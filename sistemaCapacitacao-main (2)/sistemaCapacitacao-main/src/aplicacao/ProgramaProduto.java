package aplicacao;

import entidades.Produto;
import java.util.Scanner;
public class ProgramaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scr = new Scanner(System.in);
        System.out.println("Digite os Dados do Produto");
        System.out.println("Nome: ");
        produto.setNome(scr.nextLine());
        System.out.println("Preço: ");
        produto.setPreco(scr.nextDouble());
        System.out.println("Quantidade no estoque: ");
        produto.setQuantidadeEstoque(scr.nextInt());
        System.out.println("Dados do produto: "+produto.repeticao());
        System.out.println("Adicionar Estoque: ");
        produto.adicionarEstoque(scr.nextInt());
        System.out.println("Dados do produto: "+produto.repeticao());
        System.out.println("Remover Estoque: ");
        produto.removerEstoque(scr.nextInt());
        System.out.println("Dados do produto: "+produto.repeticao());
    }
}