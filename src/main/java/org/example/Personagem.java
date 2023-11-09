package org.example;

public class Personagem {
    
    private Bolsa inventario;

    public void setInventario(Bolsa inventario) {
        this.inventario = inventario;
    }

    public String getInventario() {
        if(this.inventario == null)
            throw new RuntimeException("Personagem não possui inventário");
        return this.inventario.getBolsa();
    }

}
