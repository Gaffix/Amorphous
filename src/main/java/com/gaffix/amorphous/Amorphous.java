package com.gaffix.amorphous;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Amorphous implements ModInitializer {
    public static final String MOD_ID = "amorphous";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item ASSEMBLER = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "assembler"), new Item(new Item.Properties()));
    public static final Item CHAOS_BLADE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "chaos_blade"), new Item(new Item.Properties()));
    public static final Item COFFEE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "coffee"), new Item(new Item.Properties()));
    public static final Item DEATH_NOTE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "death_note"), new Item(new Item.Properties()));
    public static final Item DIAMOND_HANDLE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "diamond_handle"), new Item(new Item.Properties()));
    public static final Item DRAGON_ESSENCE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "dragon_essence"), new Item(new Item.Properties()));
    public static final Item FARINHA_CUMBUCA = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "farinha_cumbuca"), new Item(new Item.Properties()));
    public static final Item FLAME_RING = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "flame_ring"), new Item(new Item.Properties()));
    public static final Item LEVIATHAN_AXE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "leviathan_axe"), new Item(new Item.Properties()));
    public static final Item MORANDO = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "morando"), new Item(new Item.Properties()));
    public static final Item PHARAOHS_BOOK = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "pharaohs_book"), new Item(new Item.Properties()));
    public static final Item RAW_SHADOWWRITE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "raw_shadowwrite"), new Item(new Item.Properties()));
    public static final Item SHADOW_REAVER_MODE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shadow_reaver_mode"), new Item(new Item.Properties()));
    public static final Item SHADOWREAVER = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shadowreaver"), new Item(new Item.Properties()));
    public static final Item SHADOWWRITE_BOOTS = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shadowwrite_boots"), new Item(new Item.Properties()));
    public static final Item SHADOWWRITE_CHESTPLATE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shadowwrite_chestplate"), new Item(new Item.Properties()));
    public static final Item SHADOWWRITE_HELMET = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shadowwrite_helmet"), new Item(new Item.Properties()));
    public static final Item SHADOWWRITE_INGOT = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shadowwrite_ingot"), new Item(new Item.Properties()));
    public static final Item SHADOWWRITE_LEGGINGS = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shadowwrite_leggings"), new Item(new Item.Properties()));
    public static final Item SHADOWWRITE_PICKAXE = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shadowwrite_pickaxe"), new Item(new Item.Properties()));
    public static final Item SHADOWWRITE_SWORD = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "shadowwrite_sword"), new Item(new Item.Properties()));
    public static final Item WARDEN_HEART = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "warden_heart"), new Item(new Item.Properties()));
    public static final Item ZAZA_SEEDS = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "zaza_seeds"), new Item(new Item.Properties()));
    public static final Item ZAZA = Registry.register(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "zaza"), new Item(new Item.Properties()));

    public static final PaintingVariant ATUMALACA = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "atumalaca"), new PaintingVariant(32, 32));
    public static final PaintingVariant BALIVEL = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "balivel"), new PaintingVariant(16, 16));
    public static final PaintingVariant BAPPLE = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "bapple"), new PaintingVariant(16, 16));
    public static final PaintingVariant BINTILIN = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "bintilin"), new PaintingVariant(16, 16));
    public static final PaintingVariant DELACNARA = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "delacnara"), new PaintingVariant(16, 16));
    public static final PaintingVariant GARFO = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "garfo"), new PaintingVariant(16, 16));
    public static final PaintingVariant KRATER = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "krater"), new PaintingVariant(16, 16));
    public static final PaintingVariant LAUGH = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "laugh"), new PaintingVariant(16, 16));
    public static final PaintingVariant MEMORIES = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "memories"), new PaintingVariant(16, 16));
    public static final PaintingVariant MESMO = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "mesmo"), new PaintingVariant(16, 16));
    public static final PaintingVariant MIKE = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "mike"), new PaintingVariant(16, 16));
    public static final PaintingVariant NERD = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "nerd"), new PaintingVariant(16, 16));
    public static final PaintingVariant RUBY = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "ruby"), new PaintingVariant(16, 16));
    public static final PaintingVariant SPONGEBOB = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "spongebob"), new PaintingVariant(16, 16));
    public static final PaintingVariant THE_DISASTER = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "the_disaster"), new PaintingVariant(16, 16));
    public static final PaintingVariant TROBE = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "trobe"), new PaintingVariant(16, 16));
    public static final PaintingVariant TROLLFACE = Registry.register(Registries.PAINTING_VARIANT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "trollface"), new PaintingVariant(16, 16));

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}