/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.AbrigoDao;
import interfaces.InterfaceControle;
import modelo.AbrigoModelo;

/**
 *
 * @author lucas
 */
public class AbrigoControle implements InterfaceControle{
    
    AbrigoModelo am = new AbrigoModelo();
    AbrigoDao ad = new AbrigoDao();

    @Override
    public void salvarControle(Object... valor) {
        
        if ("".equals(valor[0])){
            am.setId(0);
        }
        else{
            am.setId((int)valor[0]);
        }
       
        am.setNome_Abrigo((String)valor[1]);
        am.setNome_Dono((String)valor[2]);
        am.setEndereco((String)valor[3]);
        am.setCEP((String)valor[4]);
        
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
