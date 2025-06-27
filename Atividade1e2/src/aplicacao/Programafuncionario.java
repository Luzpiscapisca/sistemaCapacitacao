package aplicacao;
import java.util.Scanner;
import entidades.Salariofuncionario;
public class Programafuncionario {
    public static void main(String[] args){
        Salariofuncionario salariofun = new Salariofuncionario();
        Scanner scr = new Scanner(System.in);
        System.out.println("Nome: ");
        salariofun.setNome(scr.nextLine());
        System.out.println("Salário bruto: ");
        salariofun.setSalarioBruto(scr.nextDouble());
        System.out.println("Imposto: ");
        salariofun.setImposto(scr.nextDouble());
        System.out.println("Funcionário: "+salariofun.getNome()+", R$"+salariofun.calcularSalario());
        System.out.println("Porcentagem: ");
        double porcentagem = scr.nextDouble();
        salariofun.aumentarSalario(porcentagem);
        System.out.println("Dados atualizados: "+salariofun.getNome()+", R$ "+salariofun.calcularSalario());
    }
}