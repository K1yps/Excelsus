package excelsus.excelsus.client;

import excelsus.excelsus.machines.ElectricFurnace.ElectricFurnaceRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ExcelsusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ExcelsusClient.RegisterBLOCKS();
        ExcelsusClient.RegisterITENS();
        ExcelsusClient.RegisterSOUNDS();
    }

    //Client and GUI Functionality are preferably made here

    public static void RegisterSOUNDS() {
    }

    public static void RegisterITENS() {
    }

    public static void RegisterBLOCKS() {
        ElectricFurnaceRegistry.registerOnClient();
    }

}