package com.skyeyefast.offerflowersfaster.mixin;

import com.skyeyefast.offerflowersfaster.OfferFlowersFaster;
import net.minecraft.world.entity.ai.goal.OfferFlowerGoal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(OfferFlowerGoal.class)
public abstract class OfferFlowerGoalMixin {
    @ModifyArg(method = "canUse", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I"), index = 0)
    private int offerflowersfaster$adjustOfferInterval(int original) {
        double multiplier = OfferFlowersFaster.getFlowerOfferMultiplier();
        return (int) Math.max(1.0D, Math.round(original / multiplier));
    }
}