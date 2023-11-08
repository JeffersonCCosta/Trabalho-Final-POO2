package br.com.poo2.trabalhoFinal.application;

import java.io.Serializable;
import java.util.UUID;

public class PlayerInfo implements Serializable {

    private final UUID id;
    private final String name;

    public PlayerInfo(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
