package wehavecookies56.kk.core.event;

import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Arrays;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class OnHitEvent
{
	public static int currDrive;
	@SubscribeEvent
	public void LivingAttackEvent (LivingEvent EntityEvent)
	{
		if(EntityEvent.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) EntityEvent.entityLiving;
			
			for(int i = 0; i > 114; i++)
			{
				if(player.getHeldItem() != null && player.getHeldItem().getItem() == Arrays.keyblades[i])
				{
					player.addChatMessage(new ChatComponentText("This has to give me drive"));
					currDrive +=1;
				}
			}
		}
	}
}