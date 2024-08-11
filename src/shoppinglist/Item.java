package shoppinglist;

public class Item {

    private String nomeItem;

    public Item (String nomeItem){
        this.nomeItem = nomeItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    @Override
    public String toString() {
        return nomeItem;
    }
}
