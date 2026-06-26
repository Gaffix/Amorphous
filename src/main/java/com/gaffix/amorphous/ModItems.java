package com.gaffix.amorphous;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import java.util.function.Function;

public class ModItems {
    public static final Item ASSEMBLER = register("assembler", Item::new, new Item.Properties());
    public static final Item CHAOS_BLADE = register("chaos_blade", Item::new, new Item.Properties());
    public static final Item COFFEE = register("coffee", Item::new, new Item.Properties());
    public static final Item DEATH_NOTE = register("death_note", Item::new, new Item.Properties());
    public static final Item DIAMOND_HANDLE = register("diamond_handle", Item::new, new Item.Properties());
    public static final Item DRAGON_ESSENCE = register("dragon_essence", Item::new, new Item.Properties());
    public static final Item FARINHA_CUMBUCA = register("farinha_cumbuca", Item::new, new Item.Properties());
    public static final Item FLAME_RING = register("flame_ring", Item::new, new Item.Properties());
    public static final Item LEVIATHAN_AXE = register("leviathan_axe", Item::new, new Item.Properties());
    public static final Item MORANDO = register("morando", Item::new, new Item.Properties());
    public static final Item PHARAOHS_BOOK = register("pharaohs_book", Item::new, new Item.Properties());
    public static final Item RAW_SHADOWWRITE = register("raw_shadowwrite", Item::new, new Item.Properties());
    public static final Item SHADOW_REAVER_MODE = register("shadow_reaver_mode", Item::new, new Item.Properties());
    public static final Item SHADOWREAVER = register("shadowreaver", Item::new, new Item.Properties());
    public static final Item SHADOWWRITE_BOOTS = register("shadowwrite_boots", Item::new, new Item.Properties());
    public static final Item SHADOWWRITE_CHESTPLATE = register("shadowwrite_chestplate", Item::new, new Item.Properties());
    public static final Item SHADOWWRITE_HELMET = register("shadowwrite_helmet", Item::new, new Item.Properties());
    public static final Item SHADOWWRITE_INGOT = register("shadowwrite_ingot", Item::new, new Item.Properties());
    public static final Item SHADOWWRITE_LEGGINGS = register("shadowwrite_leggings", Item::new, new Item.Properties());
    public static final Item SHADOWWRITE_PICKAXE = register("shadowwrite_pickaxe", Item::new, new Item.Properties());
    public static final Item SHADOWWRITE_SWORD = register("shadowwrite_sword", Item::new, new Item.Properties());
    public static final Item WARDEN_HEART = register("warden_heart", Item::new, new Item.Properties());
    public static final Item ZAZA_SEEDS = register("zaza_seeds", Item::new, new Item.Properties());
    public static final Item ZAZA = register("zaza", Item::new, new Item.Properties());

    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Amorphous.MOD_ID, name));
        T item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
        Amorphous.LOGGER.info("Registering dark assets for " + Amorphous.MOD_ID);
    }
}