package top.skyeyefast.offerflowersfaster.mixin;

import top.skyeyefast.offerflowersfaster.OfferFlowersFaster;
import net.minecraft.world.entity.ai.goal.OfferFlowerGoal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(OfferFlowerGoal.class)
public abstract class OfferFlowerGoalMixin {
    @ModifyConstant(method = "canUse", constant = @Constant(intValue = 8000))
    private int offerflowersfaster$adjustOfferInterval(int original) {
        double multiplier = OfferFlowersFaster.getFlowerOfferMultiplier();
        return (int) Math.max(1.0D, Math.round(original / multiplier));
    }
}