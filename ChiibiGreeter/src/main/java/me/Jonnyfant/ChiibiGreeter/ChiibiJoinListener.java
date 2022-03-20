package me.Jonnyfant.ChiibiGreeter;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class ChiibiJoinListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerDeath(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.getName().equals("Chiibi"))
        {
            Bukkit.broadcastMessage(ChatColor.BLUE + "<Greger> " + ChatColor.WHITE + ":)");
        }

    }
}