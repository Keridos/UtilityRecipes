package de.keridos.utilityrecipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.keridos.utilityrecipes.compatability.EventHandler;
import de.keridos.utilityrecipes.compatability.ModCompatability;
import de.keridos.utilityrecipes.data.Config;
import de.keridos.utilityrecipes.data.Recipes;
import de.keridos.utilityrecipes.lib.Reference;
import net.minecraftforge.common.Configuration;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class UtilityRecipes {

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        ModCompatability.checkForMods();
        Config.initConfig(new Configuration(event.getSuggestedConfigurationFile()));
        EventHandler.setupEventListener();
    }

    @Init
    public void init(FMLInitializationEvent event) {
        Recipes.initRecipes();
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {

    }


}
