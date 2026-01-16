package net.Cookie3334.mccourse.item;

import net.Cookie3334.mccourse.MCCourseMod;
import net.Cookie3334.mccourse.item.custom.ChainsawItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMs = DeferredRegister.createItems(MCCourseMod.MOD_ID);

    public static final DeferredItem<Item> BLACK_OPAL = ITEMs.registerSimpleItem("black_opal");
    public static final  DeferredItem<Item> RAW_BLACK_OPAL =
            ITEMs.registerItem("raw_black_opal", Item::new, new Item.Properties());
    public static final  DeferredItem<Item> CHAINSAW =
            ITEMs.registerItem("chainsaw", ChainsawItem::new, new Item.Properties().durability(32));
    public static final  DeferredItem<Item> TOMATO =
            ITEMs.registerItem("tomato", Item::new, new Item.Properties().food(ModFoodProperties.TOMATO));


    public static void register(IEventBus eventBus){
        ITEMs.register(eventBus);
    }
}
