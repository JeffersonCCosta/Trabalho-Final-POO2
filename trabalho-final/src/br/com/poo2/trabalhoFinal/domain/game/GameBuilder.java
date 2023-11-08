package br.com.poo2.trabalhoFinal.domain.game;

import br.com.poo2.trabalhoFinal.domain.card.Card;
import br.com.poo2.trabalhoFinal.domain.card.CardDeck;
import br.com.poo2.trabalhoFinal.domain.player.Player;
import br.com.poo2.trabalhoFinal.domain.player.PlayerRoundIterator;

import java.util.ArrayList;
import java.util.List;

public class GameBuilder {

    private List<String> playerNames = new ArrayList<>();

    public GameBuilder withPlayer(String name){
        playerNames.add(name);

        return this;
    }

    public Game build() {
        var cards = new CardDeck().getImmutableCards();

        var drawPile = buildDrawPile(cards);
        var players = buildPlayers(drawPile);

        return new Game(drawPile, players);
    }

    private DrawPile buildDrawPile(List<Card> cards) {
        var shuffledCards = DealerService.shuffle(cards);

        return new DrawPile(shuffledCards);
    }

    private PlayerRoundIterator buildPlayers(DrawPile drawPile){
        if(playerNames.size() < 2 || playerNames.size() > 10) {
            throw new IllegalStateException("2-10 players are required to create a game");
        }

        var handCardLists = DealerService.dealInitialHandCards(drawPile, playerNames.size());
        var players = new Player[playerNames.size()];

        for (int i = 0; i < playerNames.size(); i++) {
            players[i] = new Player(playerNames.get(i), handCardLists[i]);
        }

        return new PlayerRoundIterator(players);
    }
}
