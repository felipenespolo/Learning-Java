package exerciciosFaculdade.Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int qtPaginas;
    private double price;

    public Livro(String titulo, String autor, int anoPublicacao, int qtPaginas, double price){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.qtPaginas = qtPaginas;
        this.price = price;
    }

    public double calcularValorPorPagina(){
        return price / qtPaginas;
    }

    public void imprimeInfo(){
        System.out.println("Titulo " + titulo);
        System.out.println("Autor " + autor);
        System.out.println("Ano de Publicacao " + anoPublicacao);
        System.out.println("Quantidade de Paginas " + qtPaginas);
        System.out.println("Preco " + price);
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public int getQtPaginas(){
        return qtPaginas;
    }
    public void setQtPaginas(int qtPaginas){
        this.qtPaginas = qtPaginas;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
