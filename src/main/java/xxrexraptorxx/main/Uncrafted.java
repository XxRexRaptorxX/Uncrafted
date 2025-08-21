package xxrexraptorxx.main;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import org.jetbrains.annotations.NotNull;
import xxrexraptorxx.magmacore.main.ModRegistry;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://minecraft.curseforge.com/projects/uncrafted-mod">...</a>
 **/
@Mod(References.MODID)
public class Uncrafted {

    public Uncrafted(IEventBus bus) {
        ModRegistry.register(References.MODID, References.NAME, References.URL);

        bus.addListener(Uncrafted::packSetup);
    }

    public static void packSetup(@NotNull AddPackFindersEvent event) {
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_unbreakable_block_recipes"),
                PackType.SERVER_DATA,
                Component.literal("No unbreakable block recipes!"),
                PackSource.FEATURE,
                false,
                Pack.Position.TOP);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_admin_items_recipes"),
                PackType.SERVER_DATA,
                Component.literal("No admin item recipes!"),
                PackSource.FEATURE,
                false,
                Pack.Position.TOP);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_spawn_egg_recipes"),
                PackType.SERVER_DATA,
                Component.literal("No spawn egg recipes!"),
                PackSource.DEFAULT,
                false,
                Pack.Position.TOP);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_dragon_egg_recipe"),
                PackType.SERVER_DATA,
                Component.literal("No dragon egg recipe!"),
                PackSource.FEATURE,
                false,
                Pack.Position.TOP);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_nether_star_recipe"),
                PackType.SERVER_DATA,
                Component.literal("No nether star recipe!"),
                PackSource.FEATURE,
                false,
                Pack.Position.TOP);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_debug_stick_recipe"),
                PackType.SERVER_DATA,
                Component.literal("No debug stick recipe!"),
                PackSource.FEATURE,
                false,
                Pack.Position.TOP);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_spawner_recipes"),
                PackType.SERVER_DATA,
                Component.literal("No spawner recipes!"),
                PackSource.FEATURE,
                false,
                Pack.Position.TOP);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_head_recipes"),
                PackType.SERVER_DATA,
                Component.literal("No head and skull recipes!"),
                PackSource.FEATURE,
                false,
                Pack.Position.TOP);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_disk_recipes"),
                PackType.SERVER_DATA,
                Component.literal("No disk recipes!"),
                PackSource.FEATURE,
                false,
                Pack.Position.TOP);
        event.addPackFinders(
                ResourceLocation.fromNamespaceAndPath(References.MODID, "resourcepacks/no_totem_recipe"),
                PackType.SERVER_DATA,
                Component.literal("No totem recipes!"),
                PackSource.FEATURE,
                false,
                Pack.Position.TOP);
    }
}
