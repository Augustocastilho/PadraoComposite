package org.example;

public abstract class Bolsa {

    private String descricao;

    public Bolsa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getBolsa();
}
