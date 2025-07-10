package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.workstations.armourtable.ArmourTable;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.ModificationStation;
import io.github.sefiraat.slimetinker.items.workstations.repairbench.RepairBench;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmelteryMulti;
import io.github.sefiraat.slimetinker.items.workstations.swappingstation.SwappingStation;
import io.github.sefiraat.slimetinker.items.workstations.tooltable.ToolTable;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class Workstations {

    private Workstations() {
        throw new UnsupportedOperationException("Utility Class");
    }

    // Tinkers Smeltery
    public static final SlimefunItemStack TINKERS_SMELTERY_CORE = ThemeUtils.themedItemStack(
        "TINKERS_SMELTERY_CORE",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "Tinker's Smeltery",
        "Melts down metals into liquids.",
        "Metals can then be alloyed and",
        "cast out into various forms.",
        "Requires lava as fuel"
    );

    // Workbench
    public static final SlimefunItemStack TINKERS_WORKBENCH = ThemeUtils.themedItemStack(
        "TINKERS_WORKBENCH",
        Material.FLETCHING_TABLE,
        ThemeItemType.MACHINE,
        "Tinker's Workbench",
        "Used for crafting various items",
        "and parts for Tinker's tools and",
        "constructions. Also acts as an",
        "Enhanced Crafting Table."
    );

    // Tool Table
    public static final SlimefunItemStack TINKERS_TABLE = ThemeUtils.themedItemStack(
        "TINKERS_TABLE",
        Material.SMITHING_TABLE,
        ThemeItemType.MACHINE,
        "Tinker's Tool Table",
        "Combines parts into tools."
    );

    // Armour Table
    public static final SlimefunItemStack TINKERS_ARMOUR_TABLE = ThemeUtils.themedItemStack(
        "TINKERS_ARMOUR_TABLE",
        Material.SMITHING_TABLE,
        ThemeItemType.MACHINE,
        "Tinker's Armour Table",
        "Combines parts into armour pieces."
    );

    // Repair
    public static final SlimefunItemStack TINKERS_REPAIR_BENCH = ThemeUtils.themedItemStack(
        "TINKERS_REPAIR_BENCH",
        Material.CARTOGRAPHY_TABLE,
        ThemeItemType.MACHINE,
        "Tinker's Repair Bench",
        "Repairs tools and weapons."
    );

    // Swapping
    public static final SlimefunItemStack TINKERS_SWAPPING_STATION = ThemeUtils.themedItemStack(
        "TINKERS_SWAPPING_STATION",
        Material.LOOM,
        ThemeItemType.MACHINE,
        "Tinker's Swapping Station",
        "Swaps parts of tools with new parts."
    );

    // Modification
    public static final SlimefunItemStack TINKERS_MOD_STATION = ThemeUtils.themedItemStack(
        "TINKERS_MOD_STATION",
        Material.GRINDSTONE,
        ThemeItemType.MACHINE,
        "Tinker's Modification Station",
        "Applies modifications to tools and weapons."
    );

    private static final ItemStack[] RECIPE_TINKERS_SMELTERY_MULTI = new ItemStack[]{
        Materials.SEARED_BRICK_BLOCK.item(), Materials.SEARED_BRICK_BLOCK.item(), Materials.SEARED_BRICK_BLOCK.item(),
        Materials.SEARED_TANK.item(), Materials.SMELTERY_CONTROLLER.item(), Materials.SPOUT.item(),
        Materials.SEARED_BRICK_BLOCK.item(), Materials.SEARED_BRICK_BLOCK.item(), Materials.SEARED_BRICK_BLOCK.item()
    };

    private static final ItemStack[] RECIPE_TINKERS_WORKBENCH = new ItemStack[]{
        new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK),
        new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.CRAFTING_TABLE), new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.DISPENSER), new ItemStack(Material.OAK_PLANKS)
    };

    private static final ItemStack[] RECIPE_TINKERS_TABLE = new ItemStack[]{
        Materials.BLOCK_CAST_STEEL.item(), Materials.BLOCK_CAST_STEEL.item(), Materials.BLOCK_CAST_STEEL.item(),
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_WORKBENCH.item(), new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL.item(), new ItemStack(Material.OAK_PLANKS)
    };

    private static final ItemStack[] RECIPE_TINKERS_ARMOUR_TABLE = new ItemStack[]{
        Materials.BLOCK_CAST_DAMASCUS_STEEL.item(), Materials.BLOCK_CAST_DAMASCUS_STEEL.item(), Materials.BLOCK_CAST_DAMASCUS_STEEL.item(),
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_WORKBENCH.item(), new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL.item(), new ItemStack(Material.OAK_PLANKS)
    };

    private static final ItemStack[] RECIPE_TINKERS_REPAIR_BENCH = new ItemStack[]{
        Materials.BLOCK_CAST_ALUMINUM.item(), Materials.BLOCK_CAST_ALUMINUM.item(), Materials.BLOCK_CAST_ALUMINUM.item(),
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_WORKBENCH.item(), new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL.item(), new ItemStack(Material.OAK_PLANKS)
    };

    private static final ItemStack[] RECIPE_TINKERS_SWAPPING_STATION = new ItemStack[]{
        Materials.BLOCK_CAST_COR_BRONZE.item(), Materials.BLOCK_CAST_COR_BRONZE.item(), Materials.BLOCK_CAST_COR_BRONZE.item(),
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_WORKBENCH.item(), new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL.item(), new ItemStack(Material.OAK_PLANKS)
    };

    private static final ItemStack[] RECIPE_TINKERS_MOD_STATION = new ItemStack[]{
        Materials.BLOCK_CAST_REINFORCED.item(), Materials.BLOCK_CAST_REINFORCED.item(), Materials.BLOCK_CAST_REINFORCED.item(),
        new ItemStack(Material.OAK_PLANKS), Workstations.TINKERS_TABLE.item(), new ItemStack(Material.OAK_PLANKS),
        new ItemStack(Material.OAK_PLANKS), SlimefunItems.POWER_CRYSTAL.item(), new ItemStack(Material.OAK_PLANKS)
    };

    public static void set(@Nonnull SlimeTinker p) {

        // Setting the workbench to the plugin so during the first tick we can load additional recipes from other plugins
        p.setWorkbench(new Workbench(ItemGroups.WORKSTATIONS, TINKERS_WORKBENCH, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_TINKERS_WORKBENCH));
        p.getWorkbench().register(p);

        new UnplaceableBlock(ItemGroups.WORKSTATIONS, TINKERS_SMELTERY_CORE, DummySmelteryMulti.TYPE, RECIPE_TINKERS_SMELTERY_MULTI).register(p);
        new ToolTable(ItemGroups.WORKSTATIONS, TINKERS_TABLE, Workbench.TYPE, RECIPE_TINKERS_TABLE).register(p);
        new ArmourTable(ItemGroups.WORKSTATIONS, TINKERS_ARMOUR_TABLE, Workbench.TYPE, RECIPE_TINKERS_ARMOUR_TABLE).register(p);
        new RepairBench(ItemGroups.WORKSTATIONS, TINKERS_REPAIR_BENCH, Workbench.TYPE, RECIPE_TINKERS_REPAIR_BENCH).register(p);
        new SwappingStation(ItemGroups.WORKSTATIONS, TINKERS_SWAPPING_STATION, Workbench.TYPE, RECIPE_TINKERS_SWAPPING_STATION).register(p);
        new ModificationStation(ItemGroups.WORKSTATIONS, TINKERS_MOD_STATION, Workbench.TYPE, RECIPE_TINKERS_MOD_STATION).register(p);
    }
}
