package views;

import javax.swing.table.DefaultTableModel;

public class ListaAdotados extends FormListagem{

    public ListaAdotados(){
        setTitle("Animais Adotados");
    }
    
    @Override
    public void criarTabela() {
        tabela = tabelaconsulta.criarTabela(
                2,105,632,393, //posição e tamanho da tabela
                jpnConsultaL,
                new Object[] {30, 80, 80, 200, 60}, //tamanho das colunas
                new Object[] {"centro","esquerda","esquerda","esquerda","esquerda"},
                new Object[] {"ID","Nome","Idade", "Endereço","CEP","Telefone"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }    
}