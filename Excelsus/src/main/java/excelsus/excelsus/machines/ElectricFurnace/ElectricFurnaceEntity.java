package excelsus.excelsus.machines.ElectricFurnace;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class ElectricFurnaceEntity extends AbstractFurnaceBlockEntity {



    //Se quisermos especificar coisas especificas que isto faz temos de mudar o tipo de recipe
    public ElectricFurnaceEntity() {
        super(ElectricFurnaceRegistry.BLOCK_ENTITY, RecipeType.SMELTING);
    }

    @Override
    public Text getContainerName() {
        return new TranslatableText(  "block.excelsus.electric_furnace");
    }

    @Override
    public ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        //TODO POR FAZER : PARA QUESTOES DE TESTES USA A SCREEN DE UM FORNALHA NORMAL
        return new FurnaceScreenHandler(syncId,playerInventory);
    }

    //TODO NEED TO REPLACE TICK, NEED TO REPLACE ADDFUEL, NEED TO DO A LOT OF THINGS

}
