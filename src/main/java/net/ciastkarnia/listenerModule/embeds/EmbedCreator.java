package net.ciastkarnia.listenerModule.embeds;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;

public class EmbedCreator{


    private EmbedBuilder embed = new EmbedBuilder();


    
    public EmbedBuilder setDefault(){
        embed.setColor(new Color(255,0,0));
        embed.setFooter("Powered by Ciastkarnia");
        return embed;
    }

}
