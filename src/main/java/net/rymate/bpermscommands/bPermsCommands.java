package net.rymate.bpermscommands;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author rymate
 */
public class bPermsCommands extends JavaPlugin {

    protected final static Logger logger = Logger.getLogger("Minecraft");
    
    @Override
    public void onEnable() {
        logger.info("[bPermsCommands] Enabled!");
    }
    
    @Override
    public void onDisable() {
        logger.info("[bPermsCommands] Disabled!");
    }
    
}
