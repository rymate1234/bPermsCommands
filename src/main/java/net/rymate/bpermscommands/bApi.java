package net.rymate.bpermscommands;

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
    public boolean canModify(String sender, String target) {
        return true;
    }
    
}