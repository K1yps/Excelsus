package excelsus.excelsus.machines;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public abstract class AbstractMachineScreen<T extends ScreenHandler> extends HandledScreen<T> {

    public AbstractMachineScreen(T handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }


}
