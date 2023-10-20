public class AudioLivro extends Livro{
    private int tempoDuracao;

    public AudioLivro(String titulo,  String autor, double preco, int tempoDuracao){
        super(titulo, autor, preco);
        this.tempoDuracao = tempoDuracao;
    }

    public int getTempoDeDuracao(){
        return tempoDuracao;
    }

}








