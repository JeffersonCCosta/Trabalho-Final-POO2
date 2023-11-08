package br.com.poo2.trabalhoFinal.application;

import br.com.poo2.trabalhoFinal.domain.card.Card;
import br.com.poo2.trabalhoFinal.domain.player.ImmutablePlayer;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public interface IGameAppService extends Serializable {

    List<PlayerInfo> getPlayerInfos();

    PlayerInfo getCurrentPlayer();

    Stream<Card> getHandCards(UUID playerId);

    void playCard(UUID playerId, Card card, boolean hasSaidUno);

    void drawCard(UUID playerId);

    Card peekTopCard();

    boolean isGameOver();

    ImmutablePlayer getWinner();
}
