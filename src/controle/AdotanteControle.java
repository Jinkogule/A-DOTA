package controle;

import dao.AbrigoDao;
import interfaces.InterfaceControle;
import modelo.AbrigoModelo;
import modelo.AdotanteModelo;

/**
 *
 * @author Gabriel
 */
public class AdotanteControle implements InterfaceControle{

    AdotanteModelo am = new AdotanteModelo();
    AbrigoDao ad = new AbrigoDao();

    @Override
    public void salvarControle(Object... valor) {

        if ("".equals(valor[0])){
            am.setId(0);
        }
        else{
            am.setId((int)valor[0]);
        }

        am.setNomeAdotante((String)valor[1]);
        am.setIdadeAdotante((String)valor[2]);
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