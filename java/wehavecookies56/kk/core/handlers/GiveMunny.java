package wehavecookies56.kk.core.handlers;

import java.util.ArrayList;
import java.util.List;

import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class GiveMunny implements ICommand {

	private List aliases;
	public GiveMunny(){
		this.aliases = new ArrayList();
		this.aliases.add("giveMunny");
		this.aliases.add("addMunny");
		this.aliases.add("givemunny");
		this.aliases.add("addmunny");
	}
	
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}

	@Override
	public String getCommandName() {
		return "giveMuunny";
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return "giveMunny <Amount> Use negatives to remove";
	}

	@Override
	public List getCommandAliases() {
		return this.aliases;
	}
	
	@Override
	public void processCommand(ICommandSender commandSender, String[] str) {
		EntityPropertyMunny props = EntityPropertyMunny.get((EntityPlayer)commandSender);
		if(str.length == 0 || Integer.parseInt(str[0]) > props.maxMunny){
			commandSender.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Invalid Arguments Enter a value below (" + props.maxMunny + ")"));
			return;
		}
		
		commandSender.addChatMessage(new ChatComponentText(EnumChatFormatting.YELLOW + "Added: " + str[0] + " Munny"));
		props.addMunny(Integer.parseInt(str[0]));
		
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_) {
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender p_71516_1_,
			String[] p_71516_2_) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
		return false;
	}

}
