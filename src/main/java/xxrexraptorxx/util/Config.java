package xxrexraptorxx.util;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {
/**
    public static final String CATEGORY_GENERAL = "general";

    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.BooleanValue ACTIVATE_SPAWNEGG_RECIPES;
    public static ForgeConfigSpec.BooleanValue ACTIVATE_SKULL_RECIPES;
    public static ForgeConfigSpec.BooleanValue ACTIVATE_OPERATOR_RECIPES;
    public static ForgeConfigSpec.BooleanValue ACTIVATE_UNBREAKABLE_BLOCKS_RECIPES;
    public static ForgeConfigSpec.BooleanValue ACTIVATE_SPAWNER_RECIPES;
    public static ForgeConfigSpec.BooleanValue ACTIVATE_TOTEM_RECIPES;
    public static ForgeConfigSpec.BooleanValue ACTIVATE_DRAGON_EGG_RECIPES;
    public static ForgeConfigSpec.BooleanValue ACTIVATE_DISC_RECIPES;
    public static ForgeConfigSpec.BooleanValue ACTIVATE_NETHER_STAR_RECIPES;
    public static ForgeConfigSpec.BooleanValue ACTIVATE_UNCRAFTING_RECIPES;


    static {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        CLIENT_BUILDER.comment("General settings").push(CATEGORY_GENERAL);

        ACTIVATE_SPAWNEGG_RECIPES = CLIENT_BUILDER.comment("Activate spawnegg crafting recipes").define("spawneggRecipes", true);
        ACTIVATE_SKULL_RECIPES = CLIENT_BUILDER.comment("Activate skull crafting recipes").define("skullRecipes", true);
        ACTIVATE_OPERATOR_RECIPES = CLIENT_BUILDER.comment("Activate Operator crafting recipes like command blocks & structure blocks (these blocks are useless without rights and gamemode 1)").define("opderatorRecipes", false);
        ACTIVATE_UNBREAKABLE_BLOCKS_RECIPES = CLIENT_BUILDER.comment("Activate crafting recipes for unbreakable blocks (like bedrock)").define("unbreakableBlocksRecipes", true);
        ACTIVATE_SPAWNER_RECIPES = CLIENT_BUILDER.comment("Activate the crafting recipe for the spawner").define("spawnerRecipe", true);
        ACTIVATE_DRAGON_EGG_RECIPES = CLIENT_BUILDER.comment("Activate the crafting recipe for the dragon egg").define("dragoneggRecipe", true);
        ACTIVATE_TOTEM_RECIPES = CLIENT_BUILDER.comment("Activate the crafting recipe for the totem of undying").define("totemRecipe", true);
        ACTIVATE_DISC_RECIPES = CLIENT_BUILDER.comment("Activate the crafting recipes for music disks").define("diskRecipes", true);
        ACTIVATE_NETHER_STAR_RECIPES = CLIENT_BUILDER.comment("Activate crafting recipes for the nether star").define("netherStarRecipes", true);
        ACTIVATE_UNCRAFTING_RECIPES = CLIENT_BUILDER.comment("Activate uncrafting/decrafting recipes for some items and blocks").define("uncraftingRecipes", true);

        CLIENT_BUILDER.pop();


        SERVER_CONFIG = SERVER_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }



    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading configEvent) {
    }

    @SubscribeEvent
    public static void onReload(final ModConfigEvent.Reloading configEvent) {
    }
    **/
}
