public class Animal {
    private String nome;
    private int quantPatas;
    public Animal(){

    }
    public Animal(String nome, int quantPatas){
        this.nome = nome;
        this.quantPatas = quantPatas;
    }
    public String getNome(){
        return nome;
    }
    public int getQuantPatas(){
        return quantPatas;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQuantPatas(int quantPatas){
        this.quantPatas = quantPatas;
    }
    public void patas(){
    System.out.println(nome + " tem " + quantPatas + " patas.");
    }
    public void nomea(){
        System.out.println(nome);
    }
}

