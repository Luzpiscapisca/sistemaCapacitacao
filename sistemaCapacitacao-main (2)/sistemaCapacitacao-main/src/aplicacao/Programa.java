package aplicacao;
import entidades.Curso;
import entidades.ServidorPublico;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    List<ServidorPublico> servidores = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();
    public void adicionarServidorPublico(){
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Matrícula"));
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do Servidor");
        String orgao = JOptionPane.showInputDialog(null, "Informe o Órgão do Servidor");
        String cargo = JOptionPane.showInputDialog(null, "Informe o cargo do Servidor");
        String lotacao = JOptionPane.showInputDialog(null, "Informe o lotação do Servidor");
        String email = JOptionPane.showInputDialog(null, "Informe o email do Servidor");
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario do Servidor"));

        ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, salario, cargo, lotacao, email);
        servidores.add(servidor);
    }
    public void listarServidoresMatricula(int matricula){
        boolean encontrou = false;
        for (ServidorPublico servidor: servidores){
            if (servidor.getMatricula() == matricula){
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou){
            JOptionPane.showMessageDialog(null, "Servidor não encontrado!!!");
        }
    }
    public void listarServidoresNome(String nome){
        boolean encontrou = false;
        for (ServidorPublico servidor: servidores){
            if (servidor.getNome() == nome){
                System.out.println(servidor);
                encontrou = true;
                break;
            }
        }
        if (!encontrou){
            JOptionPane.showMessageDialog(null, "Servidor não encontrado!!!");
        }
    }
    public static void main(String[] args){
        Programa programa = new Programa();
        programa.adicionarServidorPublico();
        programa.adicionarServidorPublico();
        programa.listarServidores();
        programa.listarServidoresMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar: ")));
        programa.listarServidoresNome(JOptionPane.showInputDialog(null, "Informe o nome que deseja pesquisar: "));
    }
    private void listarServidores(){

    }
}
