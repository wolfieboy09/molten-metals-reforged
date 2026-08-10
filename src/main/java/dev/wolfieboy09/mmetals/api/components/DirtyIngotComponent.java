package dev.wolfieboy09.mmetals.api.components;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;

public record DirtyIngotComponent(
        ItemStack ingot
) {
    public static final Codec<DirtyIngotComponent> CODEC =  RecordCodecBuilder.create(inst -> inst.group(
            ItemStack.SINGLE_ITEM_CODEC.fieldOf("ingot").forGetter(DirtyIngotComponent::ingot)
    ).apply(inst, DirtyIngotComponent::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, DirtyIngotComponent> STREAM_CODEC = StreamCodec.composite(
            ItemStack.STREAM_CODEC, DirtyIngotComponent::ingot,
            DirtyIngotComponent::new
    );
}
