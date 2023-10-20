public class Livro{
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo,  String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public double getPreco(){
        return preco;
    }

    //Método

    public static double valorColecao(Livro[] livro){
        double valorTotal = 0.0;

        for(int i = 0; i < livro.length; i++){
            valorTotal = valorTotal + livro[i].getPreco();
        }

        System.out.printf("%.2f", valorTotal);

        return valorTotal;
    }

}