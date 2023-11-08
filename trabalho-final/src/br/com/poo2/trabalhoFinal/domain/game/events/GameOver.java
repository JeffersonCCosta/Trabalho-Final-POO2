package br.com.poo2.trabalhoFinal.domain.game.events;

import br.com.poo2.trabalhoFinal.domain.common.DomainEvent;
import br.com.poo2.trabalhoFinal.domain.player.ImmutablePlayer;

public class GameOver extends DomainEvent {

    private ImmutablePlayer winner;

    public GameOver(ImmutablePlayer winner) {
        this.winner = winner;
    }

    public ImmutablePlayer getWinner() {
        return winner;
    }
}
