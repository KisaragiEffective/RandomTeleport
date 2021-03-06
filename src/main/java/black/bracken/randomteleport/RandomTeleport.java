package black.bracken.randomteleport;

import black.bracken.randomteleport.command.RandomTeleportCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class RandomTeleport extends JavaPlugin {

    private RandomTeleportConfig randomTeleportConfig;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        this.randomTeleportConfig = RandomTeleportConfig.from(getConfig());

        this.getCommand("randomteleport").setExecutor(new RandomTeleportCommand(randomTeleportConfig));
    }

}
