package robozeri.Nukkit-Test;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

import java.util.Objects;

public class main extends PluginBase implements Listener {
  
  String name = getLogger.getName();
  
  public void onEnable{
    
    this.getLogger.warning(TextFormat.GREEN + "Plugin test is enable");
    this.getServer().getPluginManager().registerEvents(this, this);
    
    this.getLogger.info(name);
  }
  public void onDisable{
    
    this.getlogger(TextFormat.GREEN + "Plugin test is disable");
    this.getlogger(TextFormat.YELLOW + "")
    
    
  }
  public void OnCommand(CommandExecuter e){
    
    if(getCommand == "mario"){
      
      
    }
    else {
      
      
    }
  }
  
  
}


