package controle;

import dao.AdotanteDao;
import interfaces.InterfaceControle;
import modelo.AdotanteModelo;

public class AdotanteControle implements InterfaceControle{

    AdotanteModelo am = new AdotanteModelo();
    AdotanteDao ad = new AdotanteDao();

    @Override
    public void salvarControle(Object... valor) {

        if ("".equals(valor[0])){
            am.setId(0);
        }
        else{
            am.setId((int)valor[0]);
        }

        am.setNomeAdotante((String)valor[1]);
        try{//caso idade não seja um inteiro. 
            am.setIdadeAdotante(Integer.parseInt((String)valor[2]));
        }
        catch (Exception e){
            am.setIdadeAdotante(-1);//Tratado no DAO
        }
        am.setEnderecoAdotante((String)valor[3]);
        am.setTelefoneAdotante((String)valor[4]);
        am.setCEP((String)valor[5]);

        //Enviar informações para o DAO
        ad.salvarDao(am);
    }

    @Override
    public void excluirControle(int id) {

    }

    @Override
    public void carregarComboBox() {

    }

}