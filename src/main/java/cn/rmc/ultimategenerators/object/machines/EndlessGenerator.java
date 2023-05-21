package cn.rmc.ultimategenerators.object.machines;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;

public class EndlessGenerator extends SlimefunItem implements EnergyNetProvider {
    public EndlessGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int getGeneratedOutput(Location location, Config config) {
        return location.getBlock().getBlockPower()*256;
    }

    @Override
    public int getCapacity() {
        return 128;
    }
}
