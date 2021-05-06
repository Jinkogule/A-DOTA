package views;

import controle.AdotadosControle;
import javax.swing.table.DefaultTableModel;

public class ListaAdotados extends FormListagem{
    AdotadosControle controle = new AdotadosControle();

    public ListaAdotados(){
        setTitle("Animais Adotados");
        preencheTabela();
    }
    
    @Override
    public void criarTabela() {
        tabela = tabelaconsulta.criarTabela(
                2,105,632,393, //posição e tamanho da tabela
                jpnConsultaL,
                new Object[] {30, 301, 301}, //tamanho das colunas
                new Object[] {"centro","esquerda","esquerda"},
                new Object[] {"ID","Animal Adotado","Adotante"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }    

    @Override
    public void preencheTabela() {
        modelo.setNumRows(0);
        controle.preencherTabelaControle(modelo);
    }
}