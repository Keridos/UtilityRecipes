package de.keridos.craftingutilities.compatability;

import cpw.mods.fml.common.Loader;

public class ModCompatability {
    public static boolean IC2Loaded = false;
    public static boolean GTLoaded = false;
    public static boolean AM2Loaded = false;
    public static boolean FMPLoaded = false;
    public static boolean BCLoaded = false;
    public static boolean MFRLoaded = false;
    public static boolean BoPLoaded = false;
    public static boolean EBXLLoaded = false;
    public static boolean PRLoaded = false;
    public static boolean ExtraUtilLoaded = false;
    public static boolean GSLoaded = false;
    public static boolean MagCropsLoaded = false;
    private static ModCompatability instance = null;
    private static MultipartSupport MultipartHandler = MultipartSupport.getInstance();
    private static FacadeSupport FacadeHandler = FacadeSupport.getInstance();


    private ModCompatability() {
    }

    public static ModCompatability getInstance() {
        if (instance == null) {
            instance = new ModCompatability();
        }
        return instance;
    }

    public void checkForMods() {
        IC2Loaded = Loader.isModLoaded("IC2");
        GTLoaded = Loader.isModLoaded("gregtech_addon");
        AM2Loaded = Loader.isModLoaded("arsmagica2");
        FMPLoaded = Loader.isModLoaded("ForgeMultipart");
        BCLoaded = Loader.isModLoaded("BuildCraft|Transport");
        MFRLoaded = Loader.isModLoaded("MineFactoryReloaded");
        BoPLoaded = Loader.isModLoaded("BiomesOPlenty");
        EBXLLoaded = Loader.isModLoaded("ExtraBiomesXL");
        ExtraUtilLoaded = Loader.isModLoaded("ExtraUtilities");
        PRLoaded = Loader.isModLoaded("ProjRed|Exploration");
        GSLoaded = Loader.isModLoaded("GeoStrata");
        MagCropsLoaded = Loader.isModLoaded("magicalcrops");
    }


    public void registerModCompatBlocks() {
        if (FMPLoaded) {
            MultipartHandler.registerMicroblocks();
        }
        if (BCLoaded) {
            FacadeHandler.registerModFacades();
        }
    }
}
