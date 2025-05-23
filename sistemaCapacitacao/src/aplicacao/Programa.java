package aplicacao;

import entidades.ServidorPublico;

public class Programa {
    public static void main(String[] args) {
        ServidorPublico isabela = new ServidorPublico();
        isabela.setNome("Isabela");
        isabela.setCargo("Auditor");
        isabela.setOrgao("ANVISA");
        isabela.setLotacao("Brasilia");
        isabela.setEmail("isabela@gmail.");

        isabela.calcularSalarioHorasExtras(10, 5.6);

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.printf("Horas extras R$ %.2f: ",isabela.getHorasExtras());

        isabela.setHorasExtras(45.00);

        System.out.println("Servidor: "+ isabela.getNome());
        System.out.printf("Horas extras R$ %.2f: ",isabela.getHorasExtras());

    }
}
