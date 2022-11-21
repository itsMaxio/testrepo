package net.ciastkarnia.listenerModule.commands;

import net.ciastkarnia.config.Config;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class PrefixChanger extends MainCommand{

	@Override
	public void execute(MessageReceivedEvent event, String[] messageAfterPrefix, String prefix) {

        if (messageAfterPrefix.length != 0) {
            String newPrefix = messageAfterPrefix[0];
            Config.setPrefix(newPrefix);
            System.out.println("prefix został ustawiony na: " + newPrefix);
        }
        else{
            System.out.println("nie ma argumentów");
        }
		
	}
    
}
