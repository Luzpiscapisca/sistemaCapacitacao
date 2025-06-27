package entidades;
public class Salariofuncionario {
    private String nome;
    private double salarioBruto;
    private double salarioLiquido;
    private double imposto;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double calcularSalario(){
        this.salarioLiquido = this.salarioBruto - this.imposto;
        return(this.salarioLiquido);
    }
    public void aumentarSalario(double porcentagem){
        this.salarioBruto = (porcentagem/100 * this.salarioBruto) + this.salarioBruto;
    }
}