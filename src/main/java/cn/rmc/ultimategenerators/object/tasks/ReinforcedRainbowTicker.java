package cn.rmc.ultimategenerators.object.tasks;

import org.bukkit.Material;
import org.bukkit.block.Block;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.math.RandomUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;

public class ReinforcedRainbowTicker {
    public static class Fast extends BlockTicker {
        public Material meta;
        public Material[] queue;

        public Fast() {
            this( Material.ORANGE_STAINED_GLASS,
                    Material.MAGENTA_STAINED_GLASS,
                    Material.LIGHT_BLUE_STAINED_GLASS,
                    Material.YELLOW_STAINED_GLASS,
                    Material.LIME_STAINED_GLASS,
                    Material.PINK_STAINED_GLASS,
                    Material.GRAY_STAINED_GLASS,
                    Material.LIGHT_GRAY_STAINED_GLASS,
                    Material.CYAN_STAINED_GLASS,
                    Material.PURPLE_STAINED_GLASS,
                    Material.BLUE_STAINED_GLASS,
                    Material.BROWN_STAINED_GLASS,
                    Material.GREEN_STAINED_GLASS,
                    Material.RED_STAINED_GLASS,
                    Material.BLACK_STAINED_GLASS);
        }

        public Fast(Material... data) {
            this.queue = data;
            this.meta = data[0];
        }

        @Override
        public boolean isSynchronized() {
            return true;
        }

        @Override
        public void tick(Block block, SlimefunItem slimefunItem, Config config) {
            block.setType(meta);
        }

        @Override
        public void uniqueTick() {
            this.meta = this.queue[RandomUtils.nextInt(this.queue.length - 1)];

        }
    }


}
