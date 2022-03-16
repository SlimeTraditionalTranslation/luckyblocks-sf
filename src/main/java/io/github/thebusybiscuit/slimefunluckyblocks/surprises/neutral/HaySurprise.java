package io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;

public final class HaySurprise implements Surprise {
	
	@Override
	public String getName() {
		return "嘿 那邊的 (Hay There)";
	}

	@Override
	public void activate(Random random, Player p, Location l) {
		l.getWorld().dropItemNaturally(l, new ItemStack(Material.WHEAT));
		p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&b嘿 &f那邊的,"), "你過的怎麼樣? (Hey與Hay發同樣的音, Hay是乾草)", 10, 20, 10);
	}

	@Override
	public LuckLevel getLuckLevel() {
		return LuckLevel.NEUTRAL;
	}

}
