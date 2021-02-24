package excelsus.excelsus.machines.ElectricFurnace;

import excelsus.excelsus.Excelsus;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ElectricFurnaceRegistry {
    public static final String path = "electric_furnace";
    public static final Block BLOCK;
    public static final BlockEntityType<ElectricFurnaceEntity> BLOCK_ENTITY;
    public static final ScreenHandlerType<ElectricFurnaceScreenHandler> SCREEN_HANDLER;


    static {
        //Minecraft id
        Identifier id = new Identifier(Excelsus.ModID, path);
        //Block
        BLOCK = Registry.register(Registry.BLOCK, id, new ElectricFurnace(FabricBlockSettings.of(Material.METAL)));
        //Item
        Registry.register(Registry.ITEM, id, new BlockItem(BLOCK, new Item.Settings().group(Excelsus.MainItemGroup)));
        //Block Entity
        BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, id, BlockEntityType.Builder.create(ElectricFurnaceEntity::new, BLOCK).build(null));
        //Screen Handler
        SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(id, ElectricFurnaceScreenHandler::new);
    }

    public static void register() {
        //Also makes Static Code initialize
    }

    public static void registerOnClient(){
        ScreenRegistry.register(SCREEN_HANDLER, ElectricFurnaceScreen::new);
    }


}
