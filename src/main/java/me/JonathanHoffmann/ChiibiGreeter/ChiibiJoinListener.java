package me.JonathanHoffmann.ChiibiGreeter;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Random;

public class ChiibiJoinListener implements Listener {
    private static final String[] PICKUP_LINES = {
            "Are you a magician? Because whenever I look at you, everyone else disappears.",
            "Do you have a map? I keep getting lost in your eyes.",
            "Is your name Google? Because you have everything I’ve been searching for.",
            "Do you believe in love at first sight, or should I walk by again?",
            "Are you French? Because Eiffel for you.",
            "If you were a vegetable, you’d be a cute-cumber.",
            "Are you a parking ticket? Because you’ve got FINE written all over you.",
            "Do you like Star Wars? Because Yoda one for me!",
            "Even if there wasn’t gravity on Earth, I’d still fall for you.",
            "Are you a time traveler? Because I see you in my future.",
            "Are you an angel? Because heaven is missing one.",
            "Are you a loan from a bank? Because you have my interest.",
            "Is your dad a boxer? Because you’re a knockout!",
            "Are you an electrician? Because you’re lighting up my life.",
            "You must be exhausted because you’ve been running through my mind all day.",
            "Are you a beaver? Because daaaaam.",
            "Are we at the airport? Because my heart is taking off.",
            "Are you a campfire? Because you’re hot and I want s’more.",
            "If beauty were time, you’d be eternity.",
            "You must be WiFi, because I’m feeling a connection.",
            "Can I follow you home? Cause my parents always told me to follow my dreams.",
            "Are you made of copper and tellurium? Because you’re Cu-Te.",
            "Are you Cinderella? Because your shoe fits perfectly in my heart.",
            "I must be a snowflake, because I’ve fallen for you.",
            "Are you a cat? Because I’m feline a connection between us.",
            "You must be the square root of -1, because you can’t be real.",
            "Do you believe in fate? Because I think we were meant to meet.",
            "You must be a magician, because every time I look at you, everyone else disappears.",
            "Are you a camera? Because every time I look at you, I smile.",
            "If I could rearrange the alphabet, I’d put U and I together.",
            "Are you an alien? Because you just abducted my heart.",
            "I must be blind, because I can’t take my eyes off you.",
            "You must be a shooting star, because my wish just came true.",
            "Are you a secret? Because I want to keep you forever.",
            "Can you lend me a kiss? I promise I’ll give it back.",
            "Are you a sunrise? Because you brighten up my day.",
            "Are you a key? Because you’ve unlocked my heart.",
            "Is your name Chapstick? Because you’re da balm!",
            "I think you’re suffering from a lack of vitamin me.",
            "Are you a baker? Because you’ve got some hot buns!",
            "Do you have a Band-Aid? Because I just scraped my knee falling for you.",
            "Are you from Tennessee? Because you’re the only ten I see!",
            "Are you a superhero? Because you just saved my day.",
            "Are you a light bulb? Because you brighten up my world.",
            "Are you made of sugar? Because you’re sweet as can be.",
            "If we were at the zoo, you’d be the only panda I see.",
            "I’m not a photographer, but I can picture us together.",
            "Did we just share electrons? Because I’m feeling a covalent bond.",
            "You must be gravity, because you’re pulling me in.",
            "If you were a song, you’d be my favorite track.",
            "Do you have a sunburn, or are you always this hot?",
            "Are you an artist? Because every time I look at you, I see a masterpiece.",
            "You must be tired, because you’ve been running through my mind all day.",
            "Are you an astronaut? Because your beauty is out of this world.",
            "Can I borrow your phone? I need to call heaven and tell them I found their missing angel.",
            "Are you a sunrise or a sunset? Because either way, you’re breathtaking.",
            "Are you a rainbow? Because you brighten up my day.",
            "If you were a fruit, you’d be a fineapple.",
            "Do you believe in destiny? Because I think we were meant to meet.",
            "Are you a dream? Because I never want to wake up.",
            "I’m not a genie, but I can make your dreams come true.",
            "You must be a diamond, because you shine so bright.",
            "Are you the ocean? Because I’m lost at sea.",
            "You must be a poet, because every word you say is music to my ears.",
            "Are you an eclipse? Because you just darkened my world with your beauty.",
            "If you were a word, you’d be love.",
            "You must be a snowstorm, because you’ve blown me away.",
            "Are you a knight? Because you just stole my heart.",
    };

    private final Random random = new Random();

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.getName().equals("Chiibi")) {
            String pickupLine;
            if (random.nextBoolean()) {
                pickupLine = ":)";
            } else {
                pickupLine = PICKUP_LINES[random.nextInt(PICKUP_LINES.length)];
            }
            Bukkit.broadcastMessage(ChatColor.BLUE + "<Greger> " + ChatColor.WHITE + pickupLine);
        }
    }
}
