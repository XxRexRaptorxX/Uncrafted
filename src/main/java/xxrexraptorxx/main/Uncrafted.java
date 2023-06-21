package xxrexraptorxx.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.util.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @forumThread https://minecraft.curseforge.com/projects/uncrafted-mod
 **/
@Mod(References.MODID)
public class Uncrafted {

    public static final Logger LOGGER = LogManager.getLogger();


    public Uncrafted() {
        //Config
        Config.init();
    }


}

