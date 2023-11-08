package br.com.poo2.trabalhoFinal.domain.card;

import java.io.Serializable;

public interface Card extends Serializable {

    CardType getType();
    CardColor getColor();
}
