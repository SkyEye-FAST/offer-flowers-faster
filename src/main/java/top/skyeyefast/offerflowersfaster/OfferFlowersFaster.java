package top.skyeyefast.offerflowersfaster;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OfferFlowersFaster implements ModInitializer {
	public static final String MOD_ID = "offer-flowers-faster";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static final double DEFAULT_MULTIPLIER = 4000.0D;

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