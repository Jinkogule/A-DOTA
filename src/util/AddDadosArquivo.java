import java.io.*;
import java.util.Scanner;

public class AddDadosArquivo {
    public static void addDadosArquivo(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void novaEntrada(String path) throws IOException {
        System.out.println();
        Scanner input = new Scanner(System.in);

        FileWriter arq = new FileWriter(path,true);
        PrintWriter gravarArq = new PrintWriter(arq);

        System.out.printf("Dia do mês: ");
        int dm = input.nextInt();
        gravarArq.printf("\nDia do mês: "+dm+"\n");

        System.out.printf("Temperatura mínima: ");
        double t_min = input.nextDouble();
        gravarArq.printf("Temperatura mínima: "+t_min+"\n");

        System.out.printf("Temperatura máxima: ");
        double t_max = input.nextDouble();
        gravarArq.printf("Temperatura máxima: "+t_max+"\n");

        System.out.printf("Índice pluviométrico: ");
        int ip = input.nextInt();
        gravarArq.printf("Índice pluviométrico: "+ip+"\n");

        System.out.print("\nAdicionar mais dados?(S/N): ");
        String verifentrada = input.next();
        if (verifentrada.equals("S") || verifentrada.equals("s")) {
            novaEntrada(path);
        }
        else{
            System.out.println("Dados registrados.");
        }
        arq.close();
    }
}