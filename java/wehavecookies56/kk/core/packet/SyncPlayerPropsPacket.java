package wehavecookies56.kk.core.packet;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Iterator;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import wehavecookies56.kk.core.extendedproperties.EntityPropertyMunny;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class SyncPlayerPropsPacket implements IMessage, IMessageHandler<SyncPlayerPropsPacket, IMessage> {
	
	private NBTTagCompound data;
	
	public SyncPlayerPropsPacket() {}
	
	public SyncPlayerPropsPacket(EntityPlayer player){
		data = new NBTTagCompound();
		EntityPropertyMunny.get(player).saveNBTData(data);
	}
	
	@Override
	public void fromBytes(ByteBuf bytes) {
		ByteBufUtils.readTag(bytes);
		ArrayList list = (ArrayList) MinecraftServer.getServer().getConfigurationManager().playerEntityList;
		Iterator iterator = list.iterator();

		EntityPlayerMP player = (EntityPlayerMP) iterator.next();
		
		EntityPropertyMunny.get(player).loadNBTData(data);
	}

	@Override
	public void toBytes(ByteBuf bytes) {
		ByteBufUtils.writeTag(bytes, data);
	}

	@Override
	public IMessage onMessage(SyncPlayerPropsPacket message, MessageContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
	
}