package com.gaffix.amorphous;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import java.util.Map;

public class ShadowriteArmorMaterial {
    public static final int BASE_DURABILITY = 40;

    public static final ResourceKey<EquipmentAsset> SHADOWRITE_ARMOR_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(Amorphous.MOD_ID, "shadowrite"));

    public static final TagKey<Item> REPAIRS_SHADOWRITE_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(Amorphous.MOD_ID, "repairs_shadowrite_armor"));

    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 4,
                    ArmorType.CHESTPLATE, 9,
                    ArmorType.LEGGINGS, 7,
                    ArmorType.BOOTS, 4
            ),
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F,
            0.1F,
            REPAIRS_SHADOWRITE_ARMOR,
            SHADOWRITE_ARMOR_MATERIAL_KEY
    );
}