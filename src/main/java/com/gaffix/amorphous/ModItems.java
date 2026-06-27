package com.gaffix.amorphous;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.Level;

import java.util.function.Function;

public class ModItems {
    public static final Item ASSEMBLER = register("assembler", Item::new, new Item.Properties());
    
    public static final Item CHAOS_BLADE = register("chaos_blade", Item::new, new Item.Properties().sword(ToolMaterial.NETHERITE, 5, -1.92f).stacksTo(1));
    
    public static final Consumable COFFEE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 1200, 1), 1.0f))
            .build();
    public static final FoodProperties COFFEE_FOOD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Item COFFEE = register("coffee", Item::new, new Item.Properties().food(COFFEE_FOOD, COFFEE_CONSUMABLE));
    
public static final Item DEATH_NOTE = register("death_note", s -> new Item(s) {
        @Override
        public InteractionResult use(Level level, Player player, InteractionHand hand) {
            if (level instanceof ServerLevel serverLevel) {
                player.kill(serverLevel);
            }
            return InteractionResult.SUCCESS;
        }
    }, new Item.Properties().stacksTo(1));
    
    public static final Item DIAMOND_HANDLE = register("diamond_handle", Item::new, new Item.Properties());
    public static final Item DRAGON_ESSENCE = register("dragon_essence", Item::new, new Item.Properties());
    
    public static final Consumable FARINHA_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 2), 1.0f))
            .build();
    public static final FoodProperties FARINHA_FOOD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Item FARINHA_CUMBUCA = register("farinha_cumbuca", Item::new, new Item.Properties().food(FARINHA_FOOD, FARINHA_CONSUMABLE));
    
    public static final Item FLAME_RING = register("flame_ring", Item::new, new Item.Properties());
    
    public static final Item LEVIATHAN_AXE = register("leviathan_axe", s -> new AxeItem(ToolMaterial.NETHERITE, 5.0f, -3.0f, s) {
            @Override
            public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
                super.hurtEnemy(stack, target, attacker);
            }
        }, new Item.Properties().stacksTo(1));
    
    public static final Item MORANDO = register("morando", Item::new, new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f).build()));
    
    public static final Item PHARAOHS_BOOK = register("pharaohs_book", Item::new, new Item.Properties());
    public static final Item RAW_SHADOWRITE = register("raw_shadowrite", Item::new, new Item.Properties());
    public static final Item SHADOWREAVER = register("shadowreaver", Item::new, new Item.Properties());
    
    public static final Item SHADOWRITE_BOOTS = register("shadowrite_boots", s -> new Item(s) {
        @Override
        public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
            if (entity instanceof Player player && slot == EquipmentSlot.FEET) {
                player.addEffect(new MobEffectInstance(MobEffects.SPEED, 40, 0, false, false, true));
            }
            super.inventoryTick(stack, level, entity, slot);
        }
    }, new Item.Properties().humanoidArmor(ShadowriteArmorMaterial.INSTANCE, ArmorType.BOOTS).durability(ArmorType.BOOTS.getDurability(ShadowriteArmorMaterial.BASE_DURABILITY)));

    public static final Item SHADOWRITE_LEGGINGS = register("shadowrite_leggings", s -> new Item(s) {
        @Override
        public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
            if (entity instanceof Player player && slot == EquipmentSlot.LEGS) {
                player.addEffect(new MobEffectInstance(MobEffects.SPEED, 40, 0, false, false, true));
            }
            super.inventoryTick(stack, level, entity, slot);
        }
    }, new Item.Properties().humanoidArmor(ShadowriteArmorMaterial.INSTANCE, ArmorType.LEGGINGS).durability(ArmorType.LEGGINGS.getDurability(ShadowriteArmorMaterial.BASE_DURABILITY)));

    public static final Item SHADOWRITE_CHESTPLATE = register("shadowrite_chestplate", s -> new Item(s) {
        @Override
        public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
            if (entity instanceof Player player && slot == EquipmentSlot.CHEST) {
                player.addEffect(new MobEffectInstance(MobEffects.SPEED, 40, 0, false, false, true));
            }
            super.inventoryTick(stack, level, entity, slot);
        }
    }, new Item.Properties().humanoidArmor(ShadowriteArmorMaterial.INSTANCE, ArmorType.CHESTPLATE).durability(ArmorType.CHESTPLATE.getDurability(ShadowriteArmorMaterial.BASE_DURABILITY)));

    public static final Item SHADOWRITE_HELMET = register("shadowrite_helmet", s -> new Item(s) {
        @Override
        public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
            if (entity instanceof Player player && slot == EquipmentSlot.HEAD) {
                player.addEffect(new MobEffectInstance(MobEffects.SPEED, 40, 0, false, false, true));
            }
            super.inventoryTick(stack, level, entity, slot);
        }
    }, new Item.Properties().humanoidArmor(ShadowriteArmorMaterial.INSTANCE, ArmorType.HELMET).durability(ArmorType.HELMET.getDurability(ShadowriteArmorMaterial.BASE_DURABILITY)));
    
    public static final Item SHADOWRITE_INGOT = register("shadowrite_ingot", Item::new, new Item.Properties());
    public static final Item SHADOWRITE_PICKAXE = register("shadowrite_pickaxe", Item::new, new Item.Properties());

    public static final Item SHADOWRITE_SWORD = register(
        "shadowrite_sword",
        Item::new,
        new Item.Properties().sword(ShadowriteToolMaterial.SHADOWRITE_TOOL_MATERIAL, 1f, 1f)
    );

    public static final Item WARDEN_HEART = register("warden_heart", Item::new, new Item.Properties());
    public static final Item ZAZA_SEEDS = register("zaza_seeds", Item::new, new Item.Properties());
    
    public static final Consumable ZAZA_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 40, 4), 1.0f))
            .build();
    public static final FoodProperties ZAZA_FOOD = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build();
    public static final Item ZAZA = register("zaza", Item::new, new Item.Properties().food(ZAZA_FOOD, ZAZA_CONSUMABLE));

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
            output.accept(RAW_SHADOWRITE);
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