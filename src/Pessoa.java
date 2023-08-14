public class Pessoa {
    private String nome, gentilico;
    private  double altura, peso;
    private int idade;

    Pessoa(String nome, String gentilico, double altura, double peso
    , int idade){
        this.nome = nome;
        this.gentilico = gentilico;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }

    void setNome(String nome){
        this.nome=nome;
    }
    String getNome(){
        return (nome);
    }
    void setGentilico(String gentilico){
        this.gentilico=gentilico;
    }
    String getGentilico(){
        return (gentilico);
    }
    void setAltura(double altura){
        this.altura =altura;
    }
    double getAltura(){
        return (altura);
    }
    void setPeso(double peso){
        this.peso =peso;
    }
    double getPeso(){
        return (peso);
    }
    void setIdade(int idade){
        this.idade =idade;
    }
    int getIdade(){
        return (idade);
    }

    void printPessoa(){
        System.out.println(nome);
        System.out.println(gentilico);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(idade);
    }
}
