package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonagemTest {

    @Test
    void deveRetornarInventarioDoPersonagem() {
        Reparticao reparticao1 = new Reparticao("Cozinha");

        Reparticao reparticao2 = new Reparticao("Armas simples");
        Item item21 = new Item("Espada longa", "O personagem ganha mais 2 de ataque");
        reparticao2.addReparticao(item21);

        Reparticao reparticao3 = new Reparticao("Armas mágicas");
        Item item31 = new Item("Escudo sagrado", "O personagem ganha mais 10 de defesa");
        Item Item32 = new Item("Armadura sagrada", "O personagem ganha mais 7 de defesa e não pode ser atacado por armas comuns");
        reparticao3.addReparticao(item31);
        reparticao3.addReparticao(Item32);

        Reparticao inventario = new Reparticao("Inventário");
        inventario.addReparticao(reparticao1);
        inventario.addReparticao(reparticao2);
        inventario.addReparticao(reparticao3);

        Personagem personagem = new Personagem();
        personagem.setInventario(inventario);
        assertEquals("Repartição: Inventário\n" +
            "Repartição: Cozinha\n" +
            "Repartição: Armas simples\n" +
            "\tEspada longa - detalhes: O personagem ganha mais 2 de ataque\n" +
            "Repartição: Armas mágicas\n" +
            "\tEscudo sagrado - detalhes: O personagem ganha mais 10 de defesa\n" +
            "\tArmadura sagrada - detalhes: O personagem ganha mais 7 de defesa e não pode ser atacado por armas comuns\n", 
            personagem.getInventario()
        );
    }

    @Test
    void deveRetornarExcecaoQuandoPersonagemNaoPossuiInventario() {
        try{
            Personagem personagem = new Personagem();
            personagem.getInventario();
            fail();
        } catch(RuntimeException e) {
            assertEquals("Personagem não possui inventário", e.getMessage());
        }
    }
}