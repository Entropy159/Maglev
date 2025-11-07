package archives.tater.maglev.block;

import archives.tater.maglev.HasOxidationLevel;
import eu.pb4.polymer.core.api.block.PolymerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.RailBlock;
import xyz.nucleoid.packettweaker.PacketContext;

public class WaxedRailBlock extends RailBlock implements HasOxidationLevel, PolymerBlock {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public WaxedRailBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    public Oxidizable.OxidationLevel getDegradationLevel() {
        return oxidationLevel;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState blockState, PacketContext packetContext) {
        return Blocks.RAIL.getStateWithProperties(blockState);
    }
}
