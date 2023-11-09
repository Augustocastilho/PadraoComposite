package org.example;

public class Item extends Bolsa {

    private String detalhes;

    public Item(String descricao, String detalhes) {
        super(descricao);
        this.detalhes = detalhes;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getBolsa() {
        return "\t" + this.getDescricao() + " - detalhes: " + this.detalhes + "\n";
    }
    
}
