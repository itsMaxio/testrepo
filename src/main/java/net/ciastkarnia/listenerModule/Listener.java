package net.ciastkarnia.listenerModule;

import net.ciastkarnia.config.Config;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter{

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        CommandManager commandManager = new CommandManager();
        final String prefix = Config.getPrefix();
        Message message = event.getMessage();
        String rawMessage = message.getContentRaw();


        if (event.getAuthor().isBot()) return; // if authot == bot return
        if (!rawMessage.startsWith(prefix)) return; //?



        if (rawMessage.startsWith(prefix)) {
            commandManager.handle(event, prefix);
        }
    }
}
