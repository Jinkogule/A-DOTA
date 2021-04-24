/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lucas Couto
 */
public class AnimaisModelo {
    //Variáveis tem que ser de tipo igual ao tipo delas no BD
    private int Id;
    private String Nome_Animal;
    private String Raca;
    private int Idade;
    private String Porte;
    
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
