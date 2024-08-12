package shoppinglist;

import java.util.ArrayList;

public class Item {

    private ArrayList<String> nomes;  // Lista interna de nomes

    public Item() {
        this.nomes = new ArrayList<>();
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void adicionarNome(String nomeItem) {
        nomes.add(nomeItem);
    }

    public void editarNome(int index, String novoNome) {
        if (index >= 0 && index < nomes.size()) {
            nomes.set(index, novoNome);
        } else {
            System.out.println("Número do item inválido.");
        }
    }

    public void removerNome(int index) {
        if (index >= 0 && index < nomes.size()) {
            nomes.remove(index);
        } else {
            System.out.println("Número do item inválido.");
        }
    }

    public String toString(int index) {
        return nomes.get(index);
    }

    public int getSize() {
        return nomes.size();
    }
}