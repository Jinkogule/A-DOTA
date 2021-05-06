package util;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Tabela {
    public JTable criarTabela(int b1,int b2,int b3,int b4, JPanel jpn, Object[] largura, Object[] posicao, Object[] coluna) throws NullPointerException{
        JTable tabela = new JTable(new DefaultTableModel());
        
        tabela.setVisible(true);
        JScrollPane jsp = new JScrollPane(tabela);
        jsp.setBounds(b1,b2,b3,b4);
        jsp.setVisible(true);
        jpn.add(jsp);
        DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
        
        //adicionando coluna
        for (Object coluna1 : coluna) {
            modeloTabela.addColumn(coluna1);
        }
        
        //criando objeto para alinhamento dos dados na tabela
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        
        //Adicionando as posições
        centro.setHorizontalAlignment(SwingConstants.CENTER);
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        
        //Trabalhando com as colunas
        for (int i=0; i<largura.length; i++){
            if (posicao[i].equals("centro")){
                posicao[i] = centro;
            }
            if (posicao[i].equals("esquerda")){
                posicao[i] = esquerda;
            }
            if (posicao[i].equals("direita")){
                posicao[i] = direita;
            }
            
            tabela.getColumnModel().getColumn(i).setMaxWidth(Integer.parseInt(largura[i].toString()));
            
            tabela.getColumnModel().getColumn(i).setCellRenderer((TableCellRenderer) posicao[i]);
        }
        return tabela; 
    }
}
