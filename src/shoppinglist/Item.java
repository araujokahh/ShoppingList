package shoppinglist;

public class Item {

    private String nomeItem;

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Item(String nomeItem){

    }

    @Override
    public String toString() {
        return "Item{" +
                "nomeItem='" + nomeItem + '\'' +
                '}';
    }
}
