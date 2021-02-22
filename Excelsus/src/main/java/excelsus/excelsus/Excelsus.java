package excelsus.excelsus;

import excelsus.excelsus.machines.ElectricFurnace.ElectricFurnaceRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Excelsus implements ModInitializer {
    public static final String ModID = "excelsus";
    public static final ItemGroup MainItemGroup = FabricItemGroupBuilder.create(new Identifier(ModID, "main"))
            .icon(() -> new ItemStack(Items.PISTON))
            .build();

    @Override
    public void onInitialize() {
        Excelsus.RegisterSOUNDS();
        Excelsus.RegisterBLOCKS();
        Excelsus.RegisterITENS();
    }

    //Core registrations are made here

    public static void RegisterSOUNDS() {
    }

    public static void RegisterITENS() {
    }

    public static void RegisterBLOCKS() {
        ElectricFurnaceRegistry.register();

    }

}
