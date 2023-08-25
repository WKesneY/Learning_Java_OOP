public class Cliente{
    String nome;
    String cpf;
    String endereco;

    void setNome (String nomeCliente){
        nome = nomeCliente; 
    }

    void setCPF (String cpfCliente){
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

    void printCadastro(){
        System.out.println(getNome());
        System.out.println(getCpf());
        System.out.println(getEndereco());
    }
}
