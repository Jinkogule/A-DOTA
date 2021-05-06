package views;

import controle.AdotanteControle;
import javax.swing.table.DefaultTableModel;

public class ListaAdotantes extends FormListagem{
    AdotanteControle controle = new AdotanteControle();

    public ListaAdotantes(){
        setTitle("Lista de Adotantes");
        preencheTabela();
    }
    
    @Override
    public void criarTabela() {
        tabela = tabelaconsulta.criarTabela(
                2,105,632,393, //posição e tamanho da tabela
                jpnConsultaL,
                new Object[] {30, 130, 50, 222, 100, 100}, //tamanho das colunas
                new Object[] {"centro","esquerda","centro","esquerda","esquerda","esquerda"},
                new Object[] {"ID","Nome","Idade", "Endereço","CEP","Telefone"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void preencheTabela() {
        modelo.setNumRows(0);
        controle.preencherTabelaControle(modelo);
    }
}    

