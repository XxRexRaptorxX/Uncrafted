package xxrexraptorxx.util;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod.EventBusSubscriber
public class Config {

    public static final String CATEGORY_GENERAL = "general";

    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec SERVER_CONFIG;

    public static ForgeConfigSpec.BooleanValue UPDATE_CHECKER;
    public static ForgeConfigSpec.BooleanValue PATREON_REWARDS;

    public static void init() {
        initClient();
        initServer();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);

    }


    public static void initClient() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("General").push(CATEGORY_GENERAL);
        UPDATE_CHECKER = builder.comment("Activate the Update-Checker").define("update-checker", true);
        builder.pop();

        CLIENT_CONFIG = builder.build();
    }


    public static void initServer() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("General").push(CATEGORY_GENERAL);
        PATREON_REWARDS = builder.comment("Enables ingame rewards on first spawn for Patreons").define("patreon_rewards", true);
        builder.pop();

        SERVER_CONFIG = builder.build();
    }

}