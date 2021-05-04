package sistema.folha.salarial;

public class Funcionario {

    protected String cpf;
    protected String nome;
    protected double salario;
    protected String departamento;

    public Funcionario(String cpf, String nome, String departamento) { //os salarios nao devem ser setados no construtor               
        this.cpf = cpf;                                                 //e sim com setSalario() das sublasses
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) { //metodo sera sobrescrito
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString(){
        return "Funcionario: " +
               "\nNome = " + this.nome +
               "\nCPF = " + this.cpf +
               "\nSalario = " + this.salario +
               "\nDepartamento = " + this.departamento;
    }

}
