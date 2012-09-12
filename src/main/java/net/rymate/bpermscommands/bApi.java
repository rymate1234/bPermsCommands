package net.rymate.bpermscommands;

import de.bananaco.bpermissions.api.*;
import de.bananaco.bpermissions.api.util.CalculableType;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.World;
/*
* Methods for interacting with the bPermissions api.
* 
* @author rymate1234
*/


public class bApi {
    
    /*
     * Checks if the player can modify a group/user. If the priority of that 
     * person is higher, they can't modify it. 
     */
//    public boolean canModify(String sender, String target) {
//        List<World> wlist = Bukkit.getServer().getWorlds();
//        for (int i = 0; i < wlist.size(); i++) {
//            return canModify(sender, target, null);
//        }
//    }
    
    public boolean canModify(String sender, String target, String world) {
        String priority = ApiLayer.getValue(world, CalculableType.USER, target, "priority");
        return true;
    }
    
}