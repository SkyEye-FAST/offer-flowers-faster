package top.skyeyefast.offerflowersfaster.mixin;

import net.minecraft.entity.ai.goal.IronGolemLookGoal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import top.skyeyefast.offerflowersfaster.OfferFlowersFaster;

@Mixin(IronGolemLookGoal.class)
public abstract class OfferFlowerGoalMixin {
    @ModifyArg(method = "canStart", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I"), index = 0)
    private int offerflowersfaster$adjustOfferInterval(int original) {
        double multiplier = OfferFlowersFaster.getFlowerOfferMultiplier();
        return (int) Math.max(1.0D, Math.round(original / multiplier));
    }
}