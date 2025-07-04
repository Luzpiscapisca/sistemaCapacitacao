package aplicacao;
import entidades.Curso;
import entidades.Produto;
import entidades.ServidorPublico;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args){
        ServidorPublico servidorPublico = new ServidorPublico();
        servidorPublico.adicionarServidorPublico();
        servidorPublico.adicionarServidorPublico();
        servidorPublico.listarServidoresMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a matricula que deseja pesquisar: ")));
        servidorPublico.listarServidoresNome(JOptionPane.showInputDialog(null, "Informe o nome que deseja pesquisar: "));
        servidorPublico.excluirServidores(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a matrícula a ser excluída")));
        servidorPublico.listarServidores();
    }
}
