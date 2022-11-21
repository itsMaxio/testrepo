package net.ciastkarnia;

import io.github.cdimascio.dotenv.Dotenv;
import net.ciastkarnia.listenerModule.Listener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class App {
    public static void main(String[] args) throws Exception {

            String token = null;
            if (args.length == 0) {
                System.out.println("Trying to use .env file!");

                Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
                token = dotenv.get("TOKEN");

                if (token == null || token.length() == 0) {
                    System.out.println(".env file doesnt exist or is corrupted. Use arguments after .jar!");
                    return;
                }
                System.out.println("Token = " + token);
            }
            else{
                System.out.println("Trying to use arguments after .jar!");
                
                for (String arg : args) {
                    if (!(arg.contains("--token"))) continue;

                    token = arg.substring(arg.indexOf("=")+1);
                }
                
                if (token == null || token.length() == 0) {
                    System.out.println("Invalid TOKEN, use --token=\"\"");
                    return;
                }
                System.out.println("Token = " + token);
            }

            JDA bot = JDABuilder.createDefault(token, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
            .addEventListeners(new Listener())
            .setActivity(Activity.playing("TESTING"))
            .setStatus(OnlineStatus.DO_NOT_DISTURB)
            .build();
            bot.awaitReady();
    }
}
