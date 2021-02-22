package excelsus.excelsus.machines.ElectricFurnace;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ElectricFurnace extends AbstractFurnaceBlock {

    protected ElectricFurnace(Settings settings) {
        super(settings);
    }

    @Override
    public void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ElectricFurnaceEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            //Optional
            player.incrementStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new ElectricFurnaceEntity();
    }



}
