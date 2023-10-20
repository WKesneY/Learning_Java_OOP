public class EBook extends Livro{
    private double tamanhoArquivo;

    public EBook(String titulo,  String autor, double preco, double tamanhoArquivo){
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoDoArquivo(){
        return tamanhoArquivo;
    }
}
