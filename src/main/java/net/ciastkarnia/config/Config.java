package net.ciastkarnia.config;

public class Config {
        private static String prefix = "!";



        public static void setPrefix(String newPrefix) {
            prefix = newPrefix;
            System.out.println("ustawiono prefix na:" + prefix);
        }

        public static String getPrefix() {
            return prefix;
        }
}
