package jas7277.circuitbuilder.block.custom;

import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.HashMap;

public class CircuitBaseBlock extends Block {
    private static final HashMap<Direction, VoxelShape> BASE = new HashMap<>();

    public CircuitBaseBlock() {
        super(AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.STONE)
                .strength(2.0f)
        );
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){

        return VoxelShapes.cuboid(0f, 0f, 0f, 1f, 0.125f, 1f);
    }
}
