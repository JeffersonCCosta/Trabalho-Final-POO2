package br.com.poo2.trabalhoFinal.domain.game.events;

import br.com.poo2.trabalhoFinal.domain.common.DomainEvent;

import java.util.UUID;

public class CardDrawn extends DomainEvent {

    private final UUID playerId;

    public CardDrawn(UUID playerId){
        this.playerId = playerId;
    }

    public UUID getPlayerId() {
        return playerId;
    }
}
