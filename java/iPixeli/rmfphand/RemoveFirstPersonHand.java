package iPixeli.rmfphand;

import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = "rmfphand", name = "Remove First Person Hand", version = "1.0")
public class RemoveFirstPersonHand
{
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(this);
		FMLCommonHandler.instance().bus().register(this);
		System.out.println("[Remove First Person Hand] Look, ma - no hands!");
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onSoundAtEntity(RenderHandEvent e)
	{
		e.setCanceled(true);
	}
}