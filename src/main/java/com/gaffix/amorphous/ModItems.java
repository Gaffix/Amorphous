package com.gaffix.amorphous;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
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
    public static final Item SHADOWRITE_BOOTS = register("shadowrite_boots", Item::new, new Item.Properties());
    public static final Item SHADOWRITE_CHESTPLATE = register("shadowrite_chestplate", Item::new, new Item.Properties());
    public static final Item SHADOWRITE_HELMET = register("shadowrite_helmet", Item::new, new Item.Properties());
    public static final Item SHADOWRITE_INGOT = register("shadowrite_ingot", Item::new, new Item.Properties());
    public static final Item SHADOWRITE_LEGGINGS = register("shadowrite_leggings", Item::new, new Item.Properties());
    public static final Item SHADOWRITE_PICKAXE = register("shadowrite_pickaxe", Item::new, new Item.Properties());
    public static final Item SHADOWRITE_SWORD = register("shadowrite_sword", Item::new, new Item.Properties());
    public static final Item WARDEN_HEART = register("warden_heart", Item::new, new Item.Properties());
    public static final Item ZAZA_SEEDS = register("zaza_seeds", Item::new, new Item.Properties());
    public static final Item ZAZA = register("zaza", Item::new, new Item.Properties());

    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Amorphous.MOD_ID, name));
        T item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
        Amorphous.LOGGER.info("Registering dark assets for " + Amorphous.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(ASSEMBLER);
            output.accept(CHAOS_BLADE);
            output.accept(COFFEE);
            output.accept(DEATH_NOTE);
            output.accept(DIAMOND_HANDLE);
            output.accept(DRAGON_ESSENCE);
            output.accept(FARINHA_CUMBUCA);
            output.accept(FLAME_RING);
            output.accept(LEVIATHAN_AXE);
            output.accept(MORANDO);
            output.accept(PHARAOHS_BOOK);
            output.accept(RAW_SHADOWWRITE);
            output.accept(SHADOW_REAVER_MODE);
            output.accept(SHADOWREAVER);
            output.accept(SHADOWRITE_BOOTS);
            output.accept(SHADOWRITE_CHESTPLATE);
            output.accept(SHADOWRITE_HELMET);
            output.accept(SHADOWRITE_INGOT);
            output.accept(SHADOWRITE_LEGGINGS);
            output.accept(SHADOWRITE_PICKAXE);
            output.accept(SHADOWRITE_SWORD);
            output.accept(WARDEN_HEART);
            output.accept(ZAZA_SEEDS);
            output.accept(ZAZA);
        });
    }
}