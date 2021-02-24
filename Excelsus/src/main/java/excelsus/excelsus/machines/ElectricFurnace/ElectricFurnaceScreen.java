package excelsus.excelsus.machines.ElectricFurnace;

import com.mojang.blaze3d.systems.RenderSystem;
import excelsus.excelsus.Excelsus;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.transformer.Config;

@Environment(EnvType.CLIENT)
public class ElectricFurnaceScreen extends HandledScreen<ElectricFurnaceScreenHandler> {

    private static final Identifier BACKGROUND = new Identifier(Excelsus.ModID, "textures/gui/electric_furnace.png");

    public ElectricFurnaceScreen(ElectricFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    public void init() {
        super.init();
        this.titleX = (this.backgroundWidth - this.textRenderer.getWidth(this.title)) / 2;
        //Altura do inventario
        //this.playerInventoryTitleY =

    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        this.drawMouseoverTooltip(matrices, mouseX, mouseY);
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.blendColor(1.0F, 1.0F, 1.0F, 1.0F);
        assert this.client != null;
        this.client.getTextureManager().bindTexture(BACKGROUND);
        int i = this.x;
        int j = this.y;
        this.drawTexture(matrices, i, j, 0, 0, this.backgroundWidth, this.backgroundHeight);
        if (this.handler.isBurning())
            this.drawTexture(matrices, i + 56, j + 36 + 12, 176, 0, 14, 14);
        int l = this.handler.getCookProgress();
        this.drawTexture(matrices, i + 79, j + 34, 176, 14, l + 1, 16);
    }

}
