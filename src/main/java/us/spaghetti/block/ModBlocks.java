package us.spaghetti.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import us.spaghetti.TutorialMod;
import us.spaghetti.block.custom.SoundBlock;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE)));
public static final Block ENDSTONE_RUBY_ORE = registerBlock("endstone_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

public static final Block SOUND_BLOCK = registerBlock("sound_block",
        new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.WOOL)));


public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
        new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
public static final Block RUBY_SLAB = registerBlock("ruby_slab",
        new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

public static final Block RUBY_BUTTON = registerBlock("ruby_button",
        new ButtonBlock(BlockSetType.IRON, 10, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
        new PressurePlateBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

public static final Block RUBY_FENCE = registerBlock("ruby_fence",
        new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
        new FenceGateBlock(WoodType.ACACIA, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
public static final Block RUBY_WALL = registerBlock("ruby_wall",
        new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

public static final Block RUBY_DOOR = registerBlock("ruby_door",
        new DoorBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.IRON_DOOR)));
public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
        new TrapdoorBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);
    }
}
