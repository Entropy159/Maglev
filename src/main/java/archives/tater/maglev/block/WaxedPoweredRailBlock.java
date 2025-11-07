package archives.tater.maglev.block;

import archives.tater.maglev.HasOxidationLevel;
import eu.pb4.polymer.core.api.block.PolymerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.PoweredRailBlock;
import xyz.nucleoid.packettweaker.PacketContext;

public class WaxedPoweredRailBlock extends PoweredRailBlock implements HasOxidationLevel, VariantPoweredRail, PolymerBlock {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public WaxedPoweredRailBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    public Oxidizable.OxidationLevel getDegradationLevel() {
        return oxidationLevel;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState blockState, PacketContext packetContext) {
        return Blocks.POWERED_RAIL.getStateWithProperties(blockState);
    }
}
