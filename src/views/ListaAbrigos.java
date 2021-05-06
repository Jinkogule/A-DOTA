package views;

import javax.swing.table.DefaultTableModel;

public class ListaAbrigos extends FormListagem{
    
    public ListaAbrigos(){
        setTitle("Lista de Abrigos");
    }

    @Override
    public void criarTabela() {
        tabela = tabelaconsulta.criarTabela(
                2,105,632,393, //posição e tamanho da tabela
                jpnConsultaL,
                new Object[] {30, 80, 80, 200, 60, 100, 100}, //tamanho das colunas
                new Object[] {"centro","esquerda","esquerda","esquerda","esquerda","esquerda","esquerda"},
                new Object[] {"ID","Nome","Dono", "Endereço","CEP","Estado","Cidade"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }
}
