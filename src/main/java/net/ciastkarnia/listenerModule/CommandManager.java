package net.ciastkarnia.listenerModule;

import java.util.Arrays;
import java.util.Map;

import net.ciastkarnia.config.Config;
import net.ciastkarnia.listenerModule.commands.ComamndList;
import net.ciastkarnia.listenerModule.commands.MainCommand;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class CommandManager {

    public void handle(MessageReceivedEvent event, String prefix){
        String rawMessage = event.getMessage().getContentRaw().toLowerCase();
        String[] message = rawMessage.replaceFirst("\\"+Config.getPrefix(), "").trim().split("\\s+"); // do poprawienia bo wywala gdy nie widzi
        String[] messageAfterPrefix = Arrays.copyOfRange(message, 1, message.length);
        String commandName = message[0];                    //komenda po prefiksie
        Map<String, MainCommand> commandList = ComamndList.getCommandList();        //mapowanie komend z pliku CommandList

 
        // Szukanie komendy
        MainCommand command;
        if (commandList.containsKey(commandName)){           // jeśli commandName czyli komenda po prefiksie będzie równa wartości z commandListy 
            command = commandList.get(commandName);          // wtedy przypisz ją do command
        }else{
            return;                                         // jeśli nie to przerwij CommandManagera
        }

        // Egzekutor
        try {
            command.execute(event, messageAfterPrefix ,prefix);                 // egzekutuje command wyszukaną powyżej 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
