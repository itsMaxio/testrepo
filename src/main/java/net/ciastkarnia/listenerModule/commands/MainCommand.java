package net.ciastkarnia.listenerModule.commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public abstract class MainCommand {                                                                         // klasa na której podstawie są zbudowane wszystkie inne klasy z komendami
    public abstract void execute(MessageReceivedEvent event, String[] messageAfterPrefix, String prefix);   // główna metoda egzekucji komendy
}
