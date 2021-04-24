import java.util.ArrayList;
public class Abrigo {
    private ArrayList<Animal> animais = new ArrayList<Animal>();
    private String nomeAbrigo;
    private String nomeDono;
    private ArrayList<Adotante> adotantes = new ArrayList<Adotante>();
    private ArrayList<String> log = new ArrayList<String>();

    public Abrigo(String nomeAbrigo, String nomeDono){
        this.nomeAbrigo = nomeAbrigo;
        this.nomeDono = nomeDono;
    }
    public void registrarAdotante(Adotante adotante){
        this.log.add(adotante.getNome() + " se registrou como adotante");
        this.adotantes.add(adotante);
    }
    public void registrarAnimal(Animal animal){
        this.log.add(animal.getNome() + " foi registrado no abrigo");
        this.animais.add(animal);
    }

    public ArrayList<Adotante> listarAdotantes(){
        return this.adotantes;
    }
    
    public ArrayList<Animal> getAnimais(){
        return this.animais;
    }
    public void listarAnimais(){
        for(Animal animal : this.animais){
            if(!animal.isAdotado()){
            System.out.println(animal.getNome() + " --- " + animal.getAnimal());
            }
        }
    }
    public void adotarAnimal(Adotante adotante, Animal animal){
        this.log.add(animal.getNome() + " foi adotado por :" + adotante.getNome());
        adotante.adotar(animal);
    }
    public void getLog(){
        System.out.println(this.log);
    }
    public void setNomeAbrigo(String nomeAbrigo){
        this.nomeAbrigo = nomeAbrigo;
    }
    public void setNomeDono(String nomeDono){
        this.nomeDono = nomeDono;
    }
    public String getNomeAbrigo(){
        return this.nomeAbrigo;
    }
    public String getNomeDono(){
        return this.nomeDono;
    }
}   