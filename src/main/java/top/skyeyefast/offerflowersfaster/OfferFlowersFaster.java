package top.skyeyefast.offerflowersfaster;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OfferFlowersFaster implements ModInitializer {
    public static final String MOD_ID = "offer-flowers-faster";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final double DEFAULT_MULTIPLIER = 4000.0D;

    private static double flowerOfferMultiplier = DEFAULT_MULTIPLIER;

    public static double getFlowerOfferMultiplier() {
        return flowerOfferMultiplier;
    }

    @Override
    public void onInitialize() {
        flowerOfferMultiplier = Math.max(1.0D, DEFAULT_MULTIPLIER);
        LOGGER.info("Offer Flowers Faster multiplier set to {}", flowerOfferMultiplier);
    }
}