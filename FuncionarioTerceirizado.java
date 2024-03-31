public class FuncionarioTerceirizado extends Funcionario {
    private double ServicoAdicionalTerceirizado;
    public FuncionarioTerceirizado(String nome, double salarioPorHora, int horasTrabalhadasPorMes, double ServicoAdicionalTerceirizado) {
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
        this.ServicoAdicionalTerceirizado = ServicoAdicionalTerceirizado;}
    public double getServicoAdicionalTerceirizado() {
        return ServicoAdicionalTerceirizado;}
    public void setServicoAdicionalTerceirizado(double ServicoAdicionalTerceirizado) {
        this.ServicoAdicionalTerceirizado = ServicoAdicionalTerceirizado;}
    public double calcularSalarioMensal() {
        return (getSalarioPorHora() * getHorasTrabalhadasPorMes()) + ServicoAdicionalTerceirizado;}
}