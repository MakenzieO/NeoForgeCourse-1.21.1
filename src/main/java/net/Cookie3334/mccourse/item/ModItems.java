package net.Cookie3334.mccourse.item;

import net.Cookie3334.mccourse.MCCourseMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMs = DeferredRegister.createItems(MCCourseMod.MOD_ID);

    public static final DeferredItem<Item> BLACK_OPAL = ITEMs.registerSimpleItem("black_opal");
    public static final  DeferredItem<Item> RAW_BLACK_OPAL =
            ITEMs.registerItem("raw_black_opal", Item::new, new Item.Properties());
    public static void register(IEventBus eventBus){
        ITEMs.register(eventBus);
    }
}
