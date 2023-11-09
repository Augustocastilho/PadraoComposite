package org.example;

import java.util.ArrayList;
import java.util.List;

public class Reparticao extends Bolsa {

    private List<Bolsa> itens;

    public Reparticao(String descricao) {
        super(descricao);
        this.itens = new ArrayList<Bolsa>();
    }

    public void addReparticao(Bolsa item) {
        this.itens.add(item);
    }

    @Override
    public String getBolsa() {
        String saida = "";
        saida = "Repartição: " + this.getDescricao() + "\n";
        for(Bolsa item : this.itens) {
            saida += item.getBolsa();
        }
        return saida;
    }
    
}
