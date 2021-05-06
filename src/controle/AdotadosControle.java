package controle;

import dao.AdotadosDao;
import interfaces.InterfaceControle;
import modelo.AdotadosModelo;

public class AdotadosControle implements InterfaceControle{
    
    AdotadosModelo am = new AdotadosModelo();
    AdotadosDao ad = new AdotadosDao();

    @Override
    public void salvarControle(Object... valor) {
        
        if ("".equals(valor[0])){
            am.setId(0);
        }
        else{
            am.setId((int)valor[0]);
        }
        am.setNome_Adotante((String)valor[1]);
        am.setNome_Animal((String)valor[2]);
        
        //Enviar informações para o DAO
        ad.salvarDao(am);
    }
}