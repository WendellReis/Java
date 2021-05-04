package sistema.folha.salarial;

public class Vendedor extends Funcionario {

    private double taxaComissao;
    private double valorVendido;

    public Vendedor(String cpf, String nome, String departamento, double taxaComissao, double valorVendido) {
        super(cpf, nome, departamento);
        this.taxaComissao = taxaComissao;
        this.valorVendido = valorVendido;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    @Override
    public void setSalario(double salario) { //salario = salario + (valor vendido x taxa de comissao)
        this.salario = salario + this.valorVendido * this.taxaComissao;
    }
    
    @Override
    public String toString(){
        return "\nVendedor: " +
               "\nNome = " + this.nome +
               "\nCPF = " + this.cpf +
               "\nSalario = RS " + this.salario +
               "\nDepartamento = " + this.departamento +
               "\nComissao =" + this.taxaComissao +
               "\nVendido =  RS " + this.valorVendido;
    }
}
