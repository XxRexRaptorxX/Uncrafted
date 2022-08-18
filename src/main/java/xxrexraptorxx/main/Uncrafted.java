package xxrexraptorxx.main;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.util.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @forumThread https://minecraft.curseforge.com/projects/uncrafted-mod
 **/
@Mod(Uncrafted.MODID)
public class Uncrafted {

    public static final String NAME = "Uncrafted";
    public static final String MODID = "uncrafted";

    public static final Logger LOGGER = LogManager.getLogger();


    public Uncrafted() {

        //Config
        Config.init();

        //Events
        MinecraftForge.EVENT_BUS.register(this);
    }


}

