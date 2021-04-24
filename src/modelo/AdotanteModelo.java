package modelo;

public class AdotanteModelo {
    //Variáveis tem que ser de tipo igual ao tipo delas no BD
    private int Id;
    private String NomeAdotante;
    private String IdadeAdotante;
    private String SexoAdotante;
    private String EnderecoAdotante;
    private String TelefoneAdotante;
    private String CEP;

    //ID
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }


    //Nome Adotante
    public String getNomeAdotante() {
        return NomeAdotante;
    }

    public void setNomeAdotante(String NomeAdotante) {
        this.NomeAdotante = NomeAdotante;
    }
    //Idade Adotante
    public String getIdadeAdotante() {
        return IdadeAdotante;
    }
        public void setIdadeAdotante(String IdadeAdotante) {
        this.IdadeAdotante = IdadeAdotante;
    }
    //Sexo Adotante
    public String getSexoAdotante() {
        return SexoAdotante;
    }

    public void setSexoAdotante(String SexoAdotante) {
        this.SexoAdotante = SexoAdotante;
    }

    //Endereço Adotante
    public String getEnderecoAdotante() {
        return EnderecoAdotante;
    }

    public void setEnderecoAdotante(String EnderecoAdotante) {
        this.EnderecoAdotante = EnderecoAdotante;
    }



    //CEP Adotante
    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    //Telefone Adotante
    public String getTelefoneAdotante() {
        return TelefoneAdotante;
    }

    public void setTelefoneAdotante(String TelefoneAdotante) {
        this.TelefoneAdotante = TelefoneAdotante;
    }






}

