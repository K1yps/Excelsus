package excelsus.excelsus.machines.ElectricFurnace;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;

public class ElectricFurnaceScreenHandler extends AbstractFurnaceScreenHandler {

    public ElectricFurnaceScreenHandler(int i, PlayerInventory playerInventory) {
        super(ElectricFurnaceRegistry.SCREEN_HANDLER, RecipeType.SMELTING, RecipeBookCategory.FURNACE, i, playerInventory);
    }

    public ElectricFurnaceScreenHandler(int i, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(ElectricFurnaceRegistry.SCREEN_HANDLER, RecipeType.SMELTING, RecipeBookCategory.FURNACE, i, playerInventory, inventory, propertyDelegate);
    }
}
