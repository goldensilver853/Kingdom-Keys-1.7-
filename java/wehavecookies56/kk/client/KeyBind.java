package wehavecookies56.kk.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.client.gui.GuiMenu;
import wehavecookies56.kk.core.packet.SummonPacket;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class KeyBind{

	private static final String[] desc = {"key.summon.desc", "key.menu.desc"};

	public static final int SUMMON = 0;
	public static final int MENU = 1;
	private static final int[] keyValues = {Keyboard.KEY_G, Keyboard.KEY_M};
	private final KeyBinding[] keys;
	@SideOnly(Side.CLIENT)
	public KeyBind() {
		keys = new KeyBinding[desc.length];
		for (int i = 0; i < desc.length; ++i) {
			keys[i] = new KeyBinding(desc[i], keyValues[i], "key.KingdomKeys.category");
			ClientRegistry.registerKeyBinding(keys[i]);
		}
	}
	/**
	 * KeyInputEvent is in the FML package, so we must register to the FML event bus
	 */
	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event) {
		
		EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;
		
		if (keys[MENU].isPressed()) {
			if(Minecraft.getMinecraft().currentScreen == new GuiMenu()){
				Minecraft.getMinecraft().displayGuiScreen(null);
			}else if(Minecraft.getMinecraft().currentScreen == null){
				Minecraft.getMinecraft().displayGuiScreen(new GuiMenu());
			}
		}
		if (Minecraft.getMinecraft().inGameHasFocus && Minecraft.getMinecraft().theWorld.isRemote){
			if (keys[SUMMON].isPressed()) {
				if(Minecraft.getMinecraft().thePlayer.getHeldItem() != null){
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Vulpeus){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.VulpeusChain), new ItemStack(AddedItems.Vulpeus));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VulpeusChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Vulpeus), new ItemStack(AddedItems.VulpeusChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Ursus){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.UrsusChain), new ItemStack(AddedItems.Ursus));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UrsusChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Ursus), new ItemStack(AddedItems.UrsusChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Unicornis){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.UnicornisChain), new ItemStack(AddedItems.Unicornis));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UnicornisChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Unicornis), new ItemStack(AddedItems.UnicornisChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Leopardos){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LeopardosChain), new ItemStack(AddedItems.Leopardos));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LeopardosChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Leopardos), new ItemStack(AddedItems.LeopardosChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Anguis){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AnguisChain), new ItemStack(AddedItems.Anguis));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AnguisChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Anguis), new ItemStack(AddedItems.AnguisChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LeasKeyblade){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LeasKeybladeChain), new ItemStack(AddedItems.LeasKeyblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LeasKeybladeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LeasKeyblade), new ItemStack(AddedItems.LeasKeybladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.YoungXehanortsKeyblade){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.YoungXehanortsKeybladeChain), new ItemStack(AddedItems.YoungXehanortsKeyblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.YoungXehanortsKeybladeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.YoungXehanortsKeyblade), new ItemStack(AddedItems.YoungXehanortsKeybladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Oceanrage){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OceanRageChain), new ItemStack(AddedItems.Oceanrage));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OceanRageChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Oceanrage), new ItemStack(AddedItems.OceanRageChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EndOfPain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.EndOfPainChain), new ItemStack(AddedItems.EndOfPain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EndOfPainChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.EndOfPain), new ItemStack(AddedItems.EndOfPainChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Unbound){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.UnboundChain), new ItemStack(AddedItems.Unbound));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UnboundChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Unbound), new ItemStack(AddedItems.UnboundChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetDreams){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SweetDreamsChain), new ItemStack(AddedItems.SweetDreams));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetDreamsChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SweetDreams), new ItemStack(AddedItems.SweetDreamsChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DiveWing){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DiveWingChain), new ItemStack(AddedItems.DiveWing));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DiveWingChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DiveWing), new ItemStack(AddedItems.DiveWingChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Counterpoint){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.CounterpointChain), new ItemStack(AddedItems.Counterpoint));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CounterpointChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Counterpoint), new ItemStack(AddedItems.CounterpointChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AllForOne){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AllForOneChain), new ItemStack(AddedItems.AllForOne));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AllForOneChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AllForOne), new ItemStack(AddedItems.AllForOneChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KnockoutPunch){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.KnockoutPunchChain), new ItemStack(AddedItems.KnockoutPunch));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KnockoutPunchChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.KnockoutPunch), new ItemStack(AddedItems.KnockoutPunchChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FerrisGear){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FerrisGearChain), new ItemStack(AddedItems.FerrisGear));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FerrisGearChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FerrisGear), new ItemStack(AddedItems.FerrisGearChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DualDisc){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DualDiscChain), new ItemStack(AddedItems.DualDisc));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DualDiscChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DualDisc), new ItemStack(AddedItems.DualDiscChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GuardianBell){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.GuardianBellChain), new ItemStack(AddedItems.GuardianBell));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GuardianBellChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.GuardianBell), new ItemStack(AddedItems.GuardianBellChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SkullNoise){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SkullNoiseChain), new ItemStack(AddedItems.SkullNoise));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SkullNoiseChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SkullNoise), new ItemStack(AddedItems.SkullNoiseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WoodenKeyblade){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WoodenKeybladeChain), new ItemStack(AddedItems.WoodenKeyblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WoodenKeybladeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WoodenKeyblade), new ItemStack(AddedItems.WoodenKeybladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KyebladeBroken){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.KyebladeBrokenChain), new ItemStack(AddedItems.KyebladeBroken));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KyebladeBrokenChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.KyebladeBroken), new ItemStack(AddedItems.KyebladeBrokenChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Kyeblade){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.KyebladeChain), new ItemStack(AddedItems.Kyeblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KyebladeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Kyeblade), new ItemStack(AddedItems.KyebladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Lightseeker){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LightSeekerChain), new ItemStack(AddedItems.Lightseeker));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LightSeekerChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Lightseeker), new ItemStack(AddedItems.LightSeekerChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LostMemory){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LostMemoryChain), new ItemStack(AddedItems.LostMemory));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LostMemoryChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LostMemory), new ItemStack(AddedItems.LostMemoryChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FrolicFlame){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FrolicFlameChain), new ItemStack(AddedItems.FrolicFlame));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FrolicFlameChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FrolicFlame), new ItemStack(AddedItems.FrolicFlameChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MasterKeeper){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MasterKeeperChain), new ItemStack(AddedItems.MasterKeeper));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MasterKeeperChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MasterKeeper), new ItemStack(AddedItems.MasterKeeperChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.BrightCrest){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.BrightCrestChain), new ItemStack(AddedItems.BrightCrest));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.BrightCrestChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.BrightCrest), new ItemStack(AddedItems.BrightCrestChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrownUnlimit){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.CrownUnlimitChain), new ItemStack(AddedItems.CrownUnlimit));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrownUnlimitChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.CrownUnlimit), new ItemStack(AddedItems.CrownUnlimitChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.NoName){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.NoNameChain), new ItemStack(AddedItems.NoName));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.NoNameChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.NoName), new ItemStack(AddedItems.NoNameChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VoidGear){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.VoidGearChain), new ItemStack(AddedItems.VoidGear));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VoidGearChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.VoidGear), new ItemStack(AddedItems.VoidGearChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetStack){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SweetStackChain), new ItemStack(AddedItems.SweetStack));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetStackChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SweetStack), new ItemStack(AddedItems.SweetStackChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PixiePetal){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PixiePetalChain), new ItemStack(AddedItems.PixiePetal));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PixiePetalChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PixiePetal), new ItemStack(AddedItems.PixiePetalChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Hyperdrive){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.HyperdriveChain), new ItemStack(AddedItems.Hyperdrive));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HyperdriveChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Hyperdrive), new ItemStack(AddedItems.HyperdriveChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MarkOfAHero){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MarkOfAHeroChain), new ItemStack(AddedItems.MarkOfAHero));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MarkOfAHeroChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MarkOfAHero), new ItemStack(AddedItems.MarkOfAHeroChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VictoryLine){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.VictoryLineChain), new ItemStack(AddedItems.VictoryLine));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.VictoryLineChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.VictoryLine), new ItemStack(AddedItems.VictoryLineChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FairyStars){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FairyStarsChain), new ItemStack(AddedItems.FairyStars));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FairyStarsChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FairyStars), new ItemStack(AddedItems.FairyStarsChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StrokeOfMidnight){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.StrokeOfMidnightChain), new ItemStack(AddedItems.StrokeOfMidnight));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StrokeOfMidnightChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.StrokeOfMidnight), new ItemStack(AddedItems.StrokeOfMidnightChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ChaosRipper){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.ChaosRipperChain), new ItemStack(AddedItems.ChaosRipper));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ChaosRipperChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.ChaosRipper), new ItemStack(AddedItems.ChaosRipperChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.XehanortsKeyblade){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.XehanortsKeybladeChain), new ItemStack(AddedItems.XehanortsKeyblade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.XehanortsKeybladeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.XehanortsKeyblade), new ItemStack(AddedItems.XehanortsKeybladeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Darkgnaw){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DarkgnawChain), new ItemStack(AddedItems.Darkgnaw));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DarkgnawChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Darkgnaw), new ItemStack(AddedItems.DarkgnawChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ZeroOne){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.ZeroOneChain), new ItemStack(AddedItems.ZeroOne));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ZeroOneChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.ZeroOne), new ItemStack(AddedItems.ZeroOneChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DreamSword){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DreamSwordChain), new ItemStack(AddedItems.DreamSword));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DreamSwordChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DreamSword), new ItemStack(AddedItems.DreamSwordChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Aubade){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AubadeChain), new ItemStack(AddedItems.Aubade));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AubadeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Aubade), new ItemStack(AddedItems.AubadeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Umbrella){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.UmbrellaChain), new ItemStack(AddedItems.Umbrella));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UmbrellaChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Umbrella), new ItemStack(AddedItems.UmbrellaChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OmegaWeapon){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OmegaWeaponChain), new ItemStack(AddedItems.OmegaWeapon));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OmegaWeaponChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OmegaWeapon), new ItemStack(AddedItems.OmegaWeaponChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TwilightBlaze){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TwilightBlazeChain), new ItemStack(AddedItems.TwilightBlaze));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TwilightBlazeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TwilightBlaze), new ItemStack(AddedItems.TwilightBlazeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MaverickFlare){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MaverickFlareChain), new ItemStack(AddedItems.MaverickFlare));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MaverickFlareChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MaverickFlare), new ItemStack(AddedItems.MaverickFlareChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AstralBlast){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AstralBlastChain), new ItemStack(AddedItems.AstralBlast));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AstralBlastChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AstralBlast), new ItemStack(AddedItems.AstralBlastChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DarkerThanDark){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DarkerThanDarkChain), new ItemStack(AddedItems.DarkerThanDark));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DarkerThanDarkChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DarkerThanDark), new ItemStack(AddedItems.DarkerThanDarkChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LunarEclipse){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LunarEclipseChain), new ItemStack(AddedItems.LunarEclipse));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LunarEclipseChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LunarEclipse), new ItemStack(AddedItems.LunarEclipseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SilentDirge){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SilentDirgeChain), new ItemStack(AddedItems.SilentDirge));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SilentDirgeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SilentDirge), new ItemStack(AddedItems.SilentDirgeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TotalEclipse){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TotalEclipseChain), new ItemStack(AddedItems.TotalEclipse));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TotalEclipseChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TotalEclipse), new ItemStack(AddedItems.TotalEclipseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GlimpseOfDarkness){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.GlimpseOfDarknessChain), new ItemStack(AddedItems.GlimpseOfDarkness));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GlimpseOfDarknessChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.GlimpseOfDarkness), new ItemStack(AddedItems.GlimpseOfDarknessChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MidnightRoar){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MidnightRoarChain), new ItemStack(AddedItems.MidnightRoar));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MidnightRoarChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MidnightRoar), new ItemStack(AddedItems.MidnightRoarChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RejectionOfFate){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.RejectionOfFateChain), new ItemStack(AddedItems.RejectionOfFate));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RejectionOfFateChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.RejectionOfFate), new ItemStack(AddedItems.RejectionOfFateChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TrueLightsFlight){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TrueLightsFlightChain), new ItemStack(AddedItems.TrueLightsFlight));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TrueLightsFlightChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TrueLightsFlight), new ItemStack(AddedItems.TrueLightsFlightChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Leviathan){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LeviathanChain), new ItemStack(AddedItems.Leviathan));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LeviathanChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Leviathan), new ItemStack(AddedItems.LeviathanChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AbyssalTide){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AbyssalTideChain), new ItemStack(AddedItems.AbyssalTide));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AbyssalTideChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AbyssalTide), new ItemStack(AddedItems.AbyssalTideChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrownOfGuilt){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.CrownOfGuiltChain), new ItemStack(AddedItems.CrownOfGuilt));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrownOfGuiltChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.CrownOfGuilt), new ItemStack(AddedItems.CrownOfGuiltChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SignOfInnocence){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SignOfInnocenceChain), new ItemStack(AddedItems.SignOfInnocence));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SignOfInnocenceChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SignOfInnocence), new ItemStack(AddedItems.SignOfInnocenceChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PainOfSolitude){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PainOfSolitudeChain), new ItemStack(AddedItems.PainOfSolitude));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PainOfSolitudeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PainOfSolitude), new ItemStack(AddedItems.PainOfSolitudeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AbaddonPlasma){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AbaddonPlasmaChain), new ItemStack(AddedItems.AbaddonPlasma));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.AbaddonPlasmaChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.AbaddonPlasma), new ItemStack(AddedItems.AbaddonPlasmaChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OminousBlight){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OminousBlightChain), new ItemStack(AddedItems.OminousBlight));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OminousBlightChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OminousBlight), new ItemStack(AddedItems.OminousBlightChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MissingAche){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MissingAcheChain), new ItemStack(AddedItems.MissingAche));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MissingAcheChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MissingAche), new ItemStack(AddedItems.MissingAcheChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WinnersProof){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WinnersProofChain), new ItemStack(AddedItems.WinnersProof));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WinnersProofChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WinnersProof), new ItemStack(AddedItems.WinnersProofChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FatalCrest){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FatalCrestChain), new ItemStack(AddedItems.FatalCrest));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FatalCrestChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FatalCrest), new ItemStack(AddedItems.FatalCrestChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TwoBecomesOne){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TwoBecomesOneChain), new ItemStack(AddedItems.TwoBecomesOne));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TwoBecomesOneChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TwoBecomesOne), new ItemStack(AddedItems.TwoBecomesOneChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.BondOfFlames){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.BondOfFlamesChain), new ItemStack(AddedItems.BondOfFlames));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.BondOfFlamesChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.BondOfFlames), new ItemStack(AddedItems.BondOfFlamesChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Fenrir){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FenrirChain), new ItemStack(AddedItems.Fenrir));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FenrirChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Fenrir), new ItemStack(AddedItems.FenrirChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SleepingLion){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SleepingLionChain), new ItemStack(AddedItems.SleepingLion));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SleepingLionChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SleepingLion), new ItemStack(AddedItems.SleepingLionChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GuardianSoul){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.GuardianSoulChain), new ItemStack(AddedItems.GuardianSoul));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);
						
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GuardianSoulChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.GuardianSoul), new ItemStack(AddedItems.GuardianSoulChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Gullwing){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.GullWingChain), new ItemStack(AddedItems.Gullwing));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.GullWingChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Gullwing), new ItemStack(AddedItems.GullWingChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PhotonDebugger){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PhotonDebuggerChain), new ItemStack(AddedItems.PhotonDebugger));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PhotonDebuggerChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PhotonDebugger), new ItemStack(AddedItems.PhotonDebuggerChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetMemories){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SweetMemoriesChain), new ItemStack(AddedItems.SweetMemories));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SweetMemoriesChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SweetMemories), new ItemStack(AddedItems.SweetMemoriesChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CircleOfLife){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.CircleOfLifeChain), new ItemStack(AddedItems.CircleOfLife));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CircleOfLifeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.CircleOfLife), new ItemStack(AddedItems.CircleOfLifeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DecisivePumpkin){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DecisivePumpkinChain), new ItemStack(AddedItems.DecisivePumpkin));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DecisivePumpkinChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DecisivePumpkin), new ItemStack(AddedItems.DecisivePumpkinChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WishingLamp){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WishingLampChain), new ItemStack(AddedItems.WishingLamp));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WishingLampChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WishingLamp), new ItemStack(AddedItems.WishingLampChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FollowTheWind){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FollowTheWindChain), new ItemStack(AddedItems.FollowTheWind));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FollowTheWindChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FollowTheWind), new ItemStack(AddedItems.FollowTheWindChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MysteriousAbyss){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MysteriousAbyssChain), new ItemStack(AddedItems.MysteriousAbyss));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MysteriousAbyssChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MysteriousAbyss), new ItemStack(AddedItems.MysteriousAbyssChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Monochrome){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MonochromeChain), new ItemStack(AddedItems.Monochrome));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MonochromeChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Monochrome), new ItemStack(AddedItems.MonochromeChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HerosCrest){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.HerosCrestChain), new ItemStack(AddedItems.HerosCrest));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HerosCrestChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.HerosCrest), new ItemStack(AddedItems.HerosCrestChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RumblingRose){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.RumblingRoseChain), new ItemStack(AddedItems.RumblingRose));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RumblingRoseChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.RumblingRose), new ItemStack(AddedItems.RumblingRoseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HiddenDragon){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.HiddenDragonChain), new ItemStack(AddedItems.HiddenDragon));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.HiddenDragonChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.HiddenDragon), new ItemStack(AddedItems.HiddenDragonChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EndsOfEarth){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.EndsOfEarthChain), new ItemStack(AddedItems.EndsOfEarth));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EndsOfEarthChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.EndsOfEarth), new ItemStack(AddedItems.EndsOfEarthChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Stormfall){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.StormfallChain), new ItemStack(AddedItems.Stormfall));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StormfallChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Stormfall), new ItemStack(AddedItems.StormfallChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DestinysEmbrace){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DestinysEmbraceChain), new ItemStack(AddedItems.DestinysEmbrace));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DestinysEmbraceChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DestinysEmbrace), new ItemStack(AddedItems.DestinysEmbraceChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WayToDawn){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WayToDawnChain), new ItemStack(AddedItems.WayToDawn));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WayToDawnChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WayToDawn), new ItemStack(AddedItems.WayToDawnChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OneWingedAngel){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OneWingedAngelChain), new ItemStack(AddedItems.OneWingedAngel));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OneWingedAngelChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OneWingedAngel), new ItemStack(AddedItems.OneWingedAngelChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DiamondDust){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DiamondDustChain), new ItemStack(AddedItems.DiamondDust));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DiamondDustChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DiamondDust), new ItemStack(AddedItems.DiamondDustChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LionHeart){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LionHeartChain), new ItemStack(AddedItems.LionHeart));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LionHeartChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LionHeart), new ItemStack(AddedItems.LionHeartChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MetalChocobo){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MetalChocoboChain), new ItemStack(AddedItems.MetalChocobo));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.MetalChocoboChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.MetalChocobo), new ItemStack(AddedItems.MetalChocoboChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SpellBinder){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SpellBinderChain), new ItemStack(AddedItems.SpellBinder));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SpellBinderChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SpellBinder), new ItemStack(AddedItems.SpellBinderChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DivineRose){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DivineRoseChain), new ItemStack(AddedItems.DivineRose));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.DivineRoseChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.DivineRose), new ItemStack(AddedItems.DivineRoseChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FairyHarp){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FairyHarpChain), new ItemStack(AddedItems.FairyHarp));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.FairyHarpChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.FairyHarp), new ItemStack(AddedItems.FairyHarpChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrabClaw){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.CrabClawChain), new ItemStack(AddedItems.CrabClaw));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.CrabClawChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.CrabClaw), new ItemStack(AddedItems.CrabClawChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WishingStar){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WishingStarChain), new ItemStack(AddedItems.WishingStar));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WishingStarChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WishingStar), new ItemStack(AddedItems.WishingStarChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PumpkinHead){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PumpkinHeadChain), new ItemStack(AddedItems.PumpkinHead));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PumpkinHeadChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PumpkinHead), new ItemStack(AddedItems.PumpkinHeadChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ThreeWishes){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.ThreeWishesChain), new ItemStack(AddedItems.ThreeWishes));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.ThreeWishesChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.ThreeWishes), new ItemStack(AddedItems.ThreeWishesChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.JungleKing){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.JungleKingChain), new ItemStack(AddedItems.JungleKing));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.JungleKingChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.JungleKing), new ItemStack(AddedItems.JungleKingChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Olympia){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OlympiaChain), new ItemStack(AddedItems.Olympia));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OlympiaChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Olympia), new ItemStack(AddedItems.OlympiaChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LadyLuck){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LadyLuckChain), new ItemStack(AddedItems.LadyLuck));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.LadyLuckChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.LadyLuck), new ItemStack(AddedItems.LadyLuckChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PeoplesHearts){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PeoplesHeartsChain), new ItemStack(AddedItems.PeoplesHearts));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.PeoplesHeartsChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.PeoplesHearts), new ItemStack(AddedItems.PeoplesHeartsChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UltimaWeaopon){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.UltimaWeaponChain), new ItemStack(AddedItems.UltimaWeaopon));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.UltimaWeaponChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.UltimaWeaopon), new ItemStack(AddedItems.UltimaWeaponChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TreasureTrove){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TreasureTroveChain), new ItemStack(AddedItems.TreasureTrove));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.TreasureTroveChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.TreasureTrove), new ItemStack(AddedItems.TreasureTroveChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);
					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StarSeeker){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.StarseekerChain), new ItemStack(AddedItems.StarSeeker));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StarseekerChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.StarSeeker), new ItemStack(AddedItems.StarseekerChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SoulEater){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SoulEaterChain), new ItemStack(AddedItems.SoulEater));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.SoulEaterChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.SoulEater), new ItemStack(AddedItems.SoulEaterChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StarLight){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.StarlightChain), new ItemStack(AddedItems.StarLight));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.StarlightChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.StarLight), new ItemStack(AddedItems.StarlightChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Rainfell){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.RainfellChain), new ItemStack(AddedItems.Rainfell));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.RainfellChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Rainfell), new ItemStack(AddedItems.RainfellChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EarthShaker){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.EarthShakerChain), new ItemStack(AddedItems.EarthShaker));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.EarthShakerChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.EarthShaker), new ItemStack(AddedItems.EarthShakerChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WaywardWind){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WaywardWindChain), new ItemStack(AddedItems.WaywardWind));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.WaywardWindChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.WaywardWind), new ItemStack(AddedItems.WaywardWindChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KingdomKey){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.KingdomKeyChain), new ItemStack(AddedItems.KingdomKey));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KingdomKeyChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.KingdomKey), new ItemStack(AddedItems.KingdomKeyChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Oathkeeper){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OathkeeperChain), new ItemStack(AddedItems.Oathkeeper));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OathkeeperChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Oathkeeper), new ItemStack(AddedItems.OathkeeperChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KingdomKeyD){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.KingdomKeyDChain), new ItemStack(AddedItems.KingdomKeyD));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.KingdomKeyDChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.KingdomKeyD), new ItemStack(AddedItems.KingdomKeyDChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.Oblivion){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.OblivionChain), new ItemStack(AddedItems.Oblivion));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:summon", 1F, 1F);

					}
					if(Minecraft.getMinecraft().thePlayer.getHeldItem().getItem() == AddedItems.OblivionChain){
						IMessage packet = new SummonPacket(new ItemStack(AddedItems.Oblivion), new ItemStack(AddedItems.OblivionChain));
						KingdomKeys.network.sendToServer(packet);
						Minecraft.getMinecraft().thePlayer.playSound("kk:unsummon", 1F, 1F);

					}
				}
			}
		}
		
	}

}




