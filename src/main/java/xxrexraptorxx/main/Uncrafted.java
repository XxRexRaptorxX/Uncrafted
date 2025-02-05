package xxrexraptorxx.main;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.util.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://minecraft.curseforge.com/projects/uncrafted-mod">...</a>
 **/
@Mod(References.MODID)
public class Uncrafted {

    public static final Logger LOGGER = LogManager.getLogger();

    public Uncrafted(ModContainer container) {
        Config.init(container);
    }

}

