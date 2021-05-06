package views;

import controle.AbrigoControle;
import javax.swing.table.DefaultTableModel;

public class ListaAbrigos extends FormListagem{
    AbrigoControle controle = new AbrigoControle();
    
    public ListaAbrigos(){
        setTitle("Lista de Abrigos");
        preencheTabela();
    }

    @Override
    public void criarTabela() {
        tabela = tabelaconsulta.criarTabela(
                2,105,632,393, //posição e tamanho da tabela
                jpnConsultaL,
                new Object[] {30, 120, 120, 200, 70, 50, 100}, //tamanho das colunas
                new Object[] {"centro","esquerda","esquerda","esquerda","esquerda","esquerda","esquerda"},
                new Object[] {"ID","Nome","Dono", "Endereço","CEP","Estado","Cidade"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void preencheTabela() {
        modelo.setNumRows(0);
        controle.preencherTabelaControle(modelo);
    }
}
