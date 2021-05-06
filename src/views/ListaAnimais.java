package views;

import controle.AnimaisControle;
import javax.swing.table.DefaultTableModel;

public class ListaAnimais extends FormListagem{
    AnimaisControle controle = new AnimaisControle();
    
    public ListaAnimais(){
        setTitle("Lista de Animais");
        preencheTabela();
    }

    @Override
    public void criarTabela() {
        tabela = tabelaconsulta.criarTabela(
                2,105,632,393, //posição e tamanho da tabela
                jpnConsultaL,
                new Object[] {30, 100, 72, 110, 50, 60, 80,130}, //tamanho das colunas
                new Object[] {"centro","esquerda","esquerda","esquerda","centro","esquerda","esquerda","esquerda"},
                new Object[] {"ID","Nome","Tipo", "Raça","Idade","Porte","Cor","Abrigo"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }   

    @Override
    public void preencheTabela() {
        modelo.setNumRows(0);
        controle.preencherTabelaControle(modelo);
    }
}