public class Animal {
    private String nome;
    private String animal;
    private String raca;
    private String cor;
    private int idade;
    private boolean adotado = false;

    public Animal(String nome, String animal, String cor){
        this.nome = nome;
        this.animal = animal;
        this.cor = cor;
    }
    public Animal(String nome, String animal, String raca, String cor){
        this.nome = nome;
        this.animal = animal;
        this.raca = raca;
        this.cor = cor;
    }
    public Animal(String nome, String animal, String cor, int idade){
        this.nome = nome;
        this.animal = animal;
        this.cor = cor;
        this.idade = idade; 
    }
    public Animal(String nome, String animal, String raca, String cor, int idade){
        this.nome = nome;
        this.animal = animal;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade; 
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnimal(String animal){
        this.animal = animal;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setAdotado(boolean adotado){
        this.adotado = adotado;
    }
    public String getNome(){
        return this.nome;
    }
    public String getAnimal(){
        return this.animal;
    }
    public String getRaca(){
        return this.raca;
    }
    public String getCor(){
        return this.cor;
    }
    public int getIdade(){
        return this.idade;
    }
    public boolean isAdotado(){
        return this.adotado;
    }
}
