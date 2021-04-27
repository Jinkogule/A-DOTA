package controle;

import dao.AnimaisDao;
import interfaces.InterfaceControle;
import modelo.AnimaisModelo;

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
        am.setTipo((String)valor[2]);
        am.setRaca((String)valor[3]);
        try{//caso idade não seja um inteiro. 
            am.setIdade(Integer.parseInt((String)valor[4]));
        }
        catch (Exception e){
            am.setIdade(-1);//Tratado no DAO
        }
        am.setPorte((String)valor[5]);
        am.setCor((String)valor[6]);
        am.setAbrigo((String)valor[7]);
        
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
