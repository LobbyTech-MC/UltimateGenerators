package cn.rmc.ultimategenerators.object.abstracts;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public abstract class ModularGenerator extends BGenerator{
    protected ModularGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    public abstract boolean checkStructure(Block b);

    @Override
    public int getGeneratedOutput(Location l, Config data) {
        if (!checkStructure(l.getBlock())) return 0;
        return super.getGeneratedOutput(l, data);
    }
}
