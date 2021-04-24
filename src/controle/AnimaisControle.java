/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.AnimaisDao;
import interfaces.InterfaceControle;
import modelo.AnimaisModelo;

/**
 *
 * @author Lucas Couto
 */
public class AnimaisControle implements InterfaceControle{
    
    AnimaisModelo am = new AnimaisModelo();
    AnimaisDao ad = new AnimaisDao();

    @Override
    public void salvarControle(Object... valor) {
        
        if ("".equals(valor[0])){
            am.setId(0);
        }
        else{
            am.setId((int)valor[0]);
        }
       
        am.setNome_Animal((String)valor[1]);
        am.setRaca((String)valor[2]);
        am.setIdade((int)valor[3]);
        am.setPorte((String)valor[4]);
        
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
