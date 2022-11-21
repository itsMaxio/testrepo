package net.ciastkarnia.listenerModule.commands;

import java.util.HashMap;
import java.util.Map;

public class ComamndList {
    private static Map<String, MainCommand> commandMap = new HashMap<String, MainCommand>();

    public static Map<String, MainCommand> getCommandList(){
        
        commandMap.put("help", new Help());             //rejestrowanie komend do poprawy
        commandMap.put("prefix", new PrefixChanger());

        return commandMap;
    }
}
