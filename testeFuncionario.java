public class testeFuncionario {
    public static void main(String[] args) {

        FuncionarioRegular regular1 = new FuncionarioRegular("Renan", 25.0, 180);
        FuncionarioRegular regular2 = new FuncionarioRegular("Marx", 30.0, 220);

        FuncionarioTerceirizado terceirizado1 = new FuncionarioTerceirizado("Messi", 22.0, 160, 600.0);
        FuncionarioTerceirizado terceirizado2 = new FuncionarioTerceirizado("Cristiano", 20.0, 150, 500.0);

        System.out.println("Detalhes dos Funcionários Regulares:");
        System.out.println("Nome: " + regular1.getNome() + ", Salário Mensal: " + regular1.calcularSalarioMensal());
        System.out.println("Nome: " + regular2.getNome() + ", Salário Mensal: " + regular2.calcularSalarioMensal());

        System.out.println("\nDetalhes dos Funcionários Terceirizados:");
        System.out.println("Nome: " + terceirizado1.getNome() + ", Salário Mensal: " + terceirizado1.calcularSalarioMensal());
        System.out.println("Nome: " + terceirizado2.getNome() + ", Salário Mensal: " + terceirizado2.calcularSalarioMensal());
    }
}