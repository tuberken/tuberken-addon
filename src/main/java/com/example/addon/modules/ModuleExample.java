import com.example.addon.AddonTemplate;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.systems.modules.SettingGroup;
import meteordevelopment.meteorclient.events.game.ClickMouseInputEvent;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.MinecraftClient;


public class AntiMisclick extends Module {
    private final SettingGroup sgGeneral = this.settings.getDefaultGroup();
    private final SettingGroup sgRender = this.settings.createGroup("Combat");

    public AntiMisclick() {
        super(AddonTemplate.CATEGORY, "anti-misclick", "Never misclick.");
    }

}
