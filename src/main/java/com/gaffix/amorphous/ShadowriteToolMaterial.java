package com.gaffix.amorphous;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;

public class ShadowriteToolMaterial {
    public static final TagKey<Block> INCORRECT_FOR_SHADOWRITE_TOOL = TagKey.create(
            BuiltInRegistries.BLOCK.key(),
            Identifier.fromNamespaceAndPath(Amorphous.MOD_ID, "incorrect_for_shadowrite_tool")
    );

    public static final ToolMaterial SHADOWRITE_TOOL_MATERIAL = new ToolMaterial(
            INCORRECT_FOR_SHADOWRITE_TOOL,
            455,
            5.0F,
            1.5F,
            22,
            ShadowriteArmorMaterial.REPAIRS_SHADOWRITE_ARMOR
    );
}