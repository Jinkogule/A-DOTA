package modelo;

public class AnimaisModelo {
    private int Id;
    private String Nome_Animal;
    private String Tipo;
    private String Raca;
    private int Idade;
    private String Porte;
    private String Cor;
    private String Abrigo;

    public String getCor() {
        return Cor;
    }

    public String getAbrigo() {
        return Abrigo;
    }

    public void setAbrigo(String Abrigo) {
        this.Abrigo = Abrigo;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public int getId() {
        return Id;
    }

    public String getNome_Animal() {
        return Nome_Animal;
    }

    public String getRaca() {
        return Raca;
    }

    public int getIdade() {
        return Idade;
    }

    public String getPorte() {
        return Porte;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNome_Animal(String Nome_Animal) {
        this.Nome_Animal = Nome_Animal;
    }

    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setPorte(String Porte) {
        this.Porte = Porte;
    }
}
