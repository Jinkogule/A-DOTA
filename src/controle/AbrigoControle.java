package controle;

import dao.AbrigoDao;
import interfaces.InterfaceControle;
import javax.swing.table.DefaultTableModel;
import modelo.AbrigoModelo;

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
        am.setEstado((String)valor[3]);
        am.setCidade((String)valor[4]);
        am.setEndereco((String)valor[5]);
        am.setCEP((String)valor[6]);
        
        //Enviar informações para o DAO
        ad.salvarDao(am);
    }

    @Override
    public void preencherTabelaControle(DefaultTableModel valor) {
        ad.preencherTabelaDao(valor);
    }

    @Override
    public void removerControle(){}

    @Override
    public void buscarControle(){}
}
