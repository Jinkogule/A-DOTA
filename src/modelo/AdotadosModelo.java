package modelo;

public class AdotadosModelo {
    private int Id;
    private String Nome_Animal;
    private String Nome_Adotante;
    private String Nome_Abrigo;

    public String getNome_Animal() {
        return Nome_Animal;
    }

    public void setNome_Animal(String Nome_Animal) {
        this.Nome_Animal = Nome_Animal;
    }

    public String getNome_Adotante() {
        return Nome_Adotante;
    }

    public void setNome_Adotante(String Nome_Adotante) {
        this.Nome_Adotante = Nome_Adotante;
    }

    public String getNome_Abrigo() {
        return Nome_Abrigo;
    }

    public void setNome_Abrigo(String Nome_Abrigo) {
        this.Nome_Abrigo = Nome_Abrigo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }   
}
