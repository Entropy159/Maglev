package archives.tater.maglev.block;

import archives.tater.maglev.HasOxidationLevel;
import eu.pb4.polymer.core.api.block.PolymerBlock;
import net.minecraft.block.Oxidizable;

public class WaxedVariableRailBlock extends VariableRailBlock implements HasOxidationLevel, PolymerBlock {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public WaxedVariableRailBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    public Oxidizable.OxidationLevel getDegradationLevel() {
        return oxidationLevel;
    }
}
