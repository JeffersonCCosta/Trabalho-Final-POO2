package br.com.poo2.trabalhoFinal.domain.common;

public interface DomainEventSubscriber {

    void handleEvent(DomainEvent event);
}
