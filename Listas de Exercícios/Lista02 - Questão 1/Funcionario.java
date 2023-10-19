import java.util.*;

class Funcionario{
    private double salario;
    private String departamento;
    private String nome;

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario){
        if(salario > 0){
            System.out.println("---SALÁRIO VÁLIDO---");
            this.salario = salario;
        }else{
            while(salario <= 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("[ERROR 408: Salário inválido]");
            System.out.printf("\nInforme outro valor: ");
            salario = scanner.nextDouble();
                if(salario > 0){
                    this.salario = salario;
                    System.out.println("\n---SALÁRIO VÁLIDO--");
                    scanner.close();
                    break;
                }
            }
        }
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    //Getters
    public String getNome(){
        return nome;
    }
    public String getDepartamento(){
        return departamento;
    }
    public double getSalario(){
        return salario;
    }
    
    //Demais metodos
    void printAll(Funcionario funcionario){
        System.out.println("------------FUNCIONARIO CADASTRADO-----------");
        System.out.println("NOME: " + funcionario.nome);
        System.out.println("DEPARTAMENTO: " + funcionario.departamento);
        System.out.println("SALARIO: " + funcionario.salario);
    }
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------CADASTRO FUNCIONARIO------------------------");
        System.out.printf("Informe o nome: ");
        funcionario.setNome(scanner.nextLine());
        System.out.printf("Informe o departamento: ");
        funcionario.setDepartamento(scanner.nextLine());
        System.out.printf("Informe o salario: ");
        funcionario.setSalario(scanner.nextDouble());
        scanner.close();
        
        System.out.println("");
        funcionario.printAll(funcionario);
    }
}