import models.Departamento;
import models.Funcionario;
import models.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Paulo Neto",3000.0,4);
        // System.out.println(funcionario);

        Departamento departamento = new Departamento("Eletronicos", "Deparamento de venda de Eletronicos");
        departamento.adicionarFuncionario(funcionario);

        // System.out.println(departamento);
        // departamento.listarFuncionarios();

        Gerente gerente = new Gerente("Roque","UNICAP",departamento);
        System.out.println(gerente);
        gerente.listarDepartamentos();
    }
}