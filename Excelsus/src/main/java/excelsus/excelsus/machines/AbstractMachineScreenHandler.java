package excelsus.excelsus.machines;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractMachineScreenHandler extends ScreenHandler {

    protected AbstractMachineScreenHandler(@Nullable ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }

}
