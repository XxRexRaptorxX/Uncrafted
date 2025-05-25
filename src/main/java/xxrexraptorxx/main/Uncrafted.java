package xxrexraptorxx.main;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import xxrexraptorxx.magmacore.main.ModRegistry;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://minecraft.curseforge.com/projects/uncrafted-mod">...</a>
 **/
@Mod(References.MODID)
public class Uncrafted {

    public Uncrafted(ModContainer container) {
        ModRegistry.register(References.MODID, References.NAME, References.URL);
    }

}

