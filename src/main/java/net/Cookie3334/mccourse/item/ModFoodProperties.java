package net.Cookie3334.mccourse.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties TOMATO = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(6)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600), .65f)
            .build();
}
