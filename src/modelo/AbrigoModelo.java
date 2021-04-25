package modelo;

public class AbrigoModelo {
    //Variáveis tem que ser de tipo igual ao tipo delas no BD
    private int Id;
    private String Nome_Abrigo;
    private String Nome_Dono;
    private String Estado;
    private String Cidade;
    private String Endereco;
    private String CEP;

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome_Abrigo() {
        return Nome_Abrigo;
    }

    public void setNome_Abrigo(String Nome_Abrigo) {
        this.Nome_Abrigo = Nome_Abrigo;
    }

    public String getNome_Dono() {
        return Nome_Dono;
    }

    public void setNome_Dono(String Nome_Dono) {
        this.Nome_Dono = Nome_Dono;
    }
}
