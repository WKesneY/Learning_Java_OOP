public class Cliente{
    String nome;
    String cpf;
    String endereco;

    void setNome(String nomeCliente){
        nome = nomeCliente;
    }

    void setCpf(String cpfCliente){
        cpf = cpfCliente;
    }

    void setEndereco(String endCliente){
        endereco = endCliente;
    }

    String getNome(){
        return nome;
    }
    String getCpf(){
        return cpf;
    }

    String getEndereco(){
        return endereco;
    }

}