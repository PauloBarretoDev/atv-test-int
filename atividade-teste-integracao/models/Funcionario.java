package models;
public class Funcionario {
    private String nomeCompleto;
    private double salario;
    private int vendas;
    private double percAumento = 0.1;

    public Funcionario(String nomeCompleto, double salario, int vendas) {
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;
        this.vendas = vendas;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getVendas() {
        return this.vendas;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void mudarSalrio(double novoSalario){
        this.salario = novoSalario;
    }

    public void aumentarSalarioComBaseVendas() {
        double novoSalario = salario + (getVendas() * this.percAumento);
        salario = novoSalario;
    }

    public void cadastrarVenda(int quantidadeVendas) {
        this.vendas = vendas + quantidadeVendas;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.getNomeCompleto() + "\nSalário: R$ " + this.getSalario() + "\nQuantidade de Vendas: " + this.getVendas();
    }

}