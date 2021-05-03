import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CriaArquivo {
    public static void criaArquivo(String nome_do_arquivo) throws IOException {
        Scanner input = new Scanner(System.in);

        FileWriter arq = new FileWriter("C:\\Users\\lucas\\Documents\\ArquivosTeste\\"+nome_do_arquivo+".txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        System.out.printf("Dia do mês: ");
        int dm = input.nextInt();
        gravarArq.printf("Dia do mês: "+dm+"\n");

        System.out.printf("Temperatura mínima: ");
        double t_min = input.nextDouble();
        gravarArq.printf("Temperatura mínima: "+t_min+"\n");

        System.out.printf("Temperatura máxima: ");
        double t_max = input.nextDouble();
        gravarArq.printf("Temperatura máxima: "+t_max+"\n");

        System.out.printf("Índice pluviométrico: ");
        int ip = input.nextInt();
        gravarArq.printf("Índice pluviométrico: "+ip+"\n");

        arq.close();
    }
}