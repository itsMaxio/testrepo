package net.ciastkarnia.listenerModule.commands;

import net.ciastkarnia.listenerModule.embeds.EmbedCreator;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Help extends MainCommand{

    @Override
    public void execute(MessageReceivedEvent event, String[] messageAfterPrefix, String prefix) {

        EmbedCreator embed = new EmbedCreator();
        EmbedBuilder embed2 = new EmbedBuilder();
        

        if (messageAfterPrefix.length == 0) {
            
            System.out.println("dziala");
            MessageEmbed message = embed.setDefault().setTitle("test").build();
            MessageEmbed message2 = embed2.setTitle("dziala").build();
            event.getChannel().sendMessageEmbeds(message).queue();
            event.getChannel().sendMessageEmbeds(message2).queue();

        }

        





        // EmbedBuilder test = new EmbedBuilder();
        // test
        // .setTitle("test")
        // .addField("field test", "chuj wie co to ", false)
        // .setColor(0x4444ff)
        // .addBlankField(true);
        // MessageEmbed test2 = test.build(); 

        // event.getChannel().sendMessageEmbeds(embed2).queue(); 
        
    }

}
