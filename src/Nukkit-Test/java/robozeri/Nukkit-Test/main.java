package robozeri.Nukkit-Test;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

import java.util.Objects;

public class main extends PluginBase implements Listener {
  
  public void onEnable{
    
    this.getLogger.warning(TextFormat.GREEN + "Plugin test is enable");
    this.getServer().getPluginManager().registerEvents(this, this);
    String name = this.getLogger.getName();
    this.getLogger.info(name);
  }
  public void onDisable{
    
    this.getlogger(TextFormat.GREEN + "Plugin test is disable");
  }
  
  
}


