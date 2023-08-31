public class Cliente{
    private String nome;
    private String cpf;
    private String endereco;

    public void setNome(String nomeCliente){
        this.nome = nomeCliente;
    }

    public void setCpf(String cpfCliente){
        this.cpf = cpfCliente;
    }

    public void setEndereco(String endCliente){
        this.endereco = endCliente;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

}