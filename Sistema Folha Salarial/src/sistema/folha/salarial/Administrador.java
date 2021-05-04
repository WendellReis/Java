package sistema.folha.salarial;

public class Administrador extends Funcionario {

    private int anosServico;
            
    public Administrador(int anosServico,String cpf, String nome, String departamento) {
        super(cpf, nome, departamento);
        this.anosServico = anosServico;
    }

    public int getAnosServico() {
        return anosServico;
    }

    public void setAnosServico(int anosServico) {
        this.anosServico = anosServico;
    }
    
    @Override
    public void setSalario(double salario){
        this.salario = salario + 2/100*this.anosServico;
    }
    
    @Override
    public String toString(){
        return "\nAdministrador: " +
               "\nNome = " + this.nome +
               "\nCPF = " + this.cpf +
               "\nSalario = RS " + this.salario +
               "\nDepartamento = " + this.departamento +
               "\nTempo = " + this.anosServico + "anos";
    }
}
