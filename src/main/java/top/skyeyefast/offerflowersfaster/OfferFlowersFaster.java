package top.skyeyefast.offerflowersfaster;

import net.fabricmc.api.ModInitializer;

public class OfferFlowersFaster implements ModInitializer {
    public static final double DEFAULT_MULTIPLIER = 4000.0D;

    private static double flowerOfferMultiplier = DEFAULT_MULTIPLIER;

    public static double getFlowerOfferMultiplier() {
        return flowerOfferMultiplier;
    }

    @Override
    public void onInitialize() {
        flowerOfferMultiplier = Math.max(1.0D, DEFAULT_MULTIPLIER);
    }
}