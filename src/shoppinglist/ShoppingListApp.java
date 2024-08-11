package shoppinglist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListApp {

    private ArrayList<Item> shoppingList;
    private Scanner sc;

    public ShoppingListApp() {
        shoppingList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ShoppingListApp app = new ShoppingListApp();
        app.run();
        
    }

// switch case - cria um loop que para na opção escolhida pelo usuário, chamando o método correspondente.
// O case 5 interrompe o loop
    private void run() {
        boolean running = true;
        while (running){
            mostrarMenu();
            int opcoes = sc.nextInt();
            sc.nextLine();

            switch (opcoes){
                case 1:
                    addItem();
                    break;
                case 2:
                    editarItem();
                    break;
                case 3:
                    removerItem();
                    break;
                case 4:
                    listaDeItens();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Adicionar item.");
        System.out.println("2. Editar item.");
        System.out.println("3. Remover item.");
        System.out.println("4. Listar itens");
        System.out.println("5. Sair.");
    }

    private void addItem(){
        System.out.println("Digite o nome do item: ");
        String nomeItem = sc.nextLine();
        shoppingList.add(new Item(nomeItem));
        System.out.println("Item adicionado com sucesso!");
    }

    private void editarItem(){
        listaDeItens();
        System.out.println("Digite o número do item a ser editado: ");
        int numerosDaLista = sc.nextInt() -1;
        sc.nextLine();

        if (numerosDaLista >= 0 && numerosDaLista < shoppingList.size()){
            System.out.println("Digite o novo nome do item: ");
            String novoNome = sc.nextLine();
            shoppingList.get(numerosDaLista).setNomeItem(novoNome);
            System.out.println("O item foi atualizado com sucesso!");
        } else {
            System.out.println("Número inválido.");
        }
    }

    private void removerItem(){
        listaDeItens();
        System.out.println("Digite o número do item a ser removido: ");
        int numeroDaLista = sc.nextInt() -1;
        sc.nextLine();

        if (numeroDaLista >=0 && numeroDaLista < shoppingList.size()){
            shoppingList.remove(numeroDaLista);
            System.out.println("O item foi removido com sucesso!");
        } else {
            System.out.println("Número inválido.");
        }
    }

    private void listaDeItens() {
        System.out.println("\nLISTA DE COMPRAS: ");
        for (int i = 0; i < shoppingList.size(); i++){
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }

}

