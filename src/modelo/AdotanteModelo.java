package modelo;

public class AdotanteModelo {
    private int Id;
    private String NomeAdotante;
    private int IdadeAdotante;
    private String SexoAdotante;
    private String EnderecoAdotante;
    private String TelefoneAdotante;
    private String CEP;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNomeAdotante() {
        return NomeAdotante;
    }

    public void setNomeAdotante(String NomeAdotante) {
        this.NomeAdotante = NomeAdotante;
    }

    public int getIdadeAdotante() {
        return IdadeAdotante;
    }
        public void setIdadeAdotante(int IdadeAdotante) {
        this.IdadeAdotante = IdadeAdotante;
    }
   
    public String getSexoAdotante() {
        return SexoAdotante;
    }

    public void setSexoAdotante(String SexoAdotante) {
        this.SexoAdotante = SexoAdotante;
    }

    public String getEnderecoAdotante() {
        return EnderecoAdotante;
    }

    public void setEnderecoAdotante(String EnderecoAdotante) {
        this.EnderecoAdotante = EnderecoAdotante;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefoneAdotante() {
        return TelefoneAdotante;
    }

    public void setTelefoneAdotante(String TelefoneAdotante) {
        this.TelefoneAdotante = TelefoneAdotante;
    }
}