package TratamentoDeExcecoes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaNumeros {
    private List<Integer> lista;
    private int tamanho;

    public ListaNumeros(int tam){
        lista = new ArrayList<>();
        Random r = new Random(System.currentTimeMillis());

        for(int i = 0; i < tam; i++){
            lista.add(r.nextInt());
        }
    }

    public void salvarLista(String arquivo){
        try {
            PrintWriter out = new PrintWriter(arquivo);
            for (int i = 0; i < lista.size(); i++) {
                out.println("Valor[" + i + "] = " + lista.get(i));
                if (i == 3) lista.clear();
            }out.close();

        } catch (FileNotFoundException e) {
            System.err.println("Arquivo " + arquivo);

        }
    }
}
