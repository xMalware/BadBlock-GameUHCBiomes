package fr.badblock.bukkit.games.uhc.biomes;

import org.bukkit.block.Biome;
import org.bukkit.craftbukkit.v1_8_R3.block.CraftBlock;
import org.bukkit.plugin.java.JavaPlugin;

import net.minecraft.server.v1_8_R3.BiomeBase;

public class UHCBiomes extends JavaPlugin
{

	@Override
	public void onLoad()
	{
		setBiomeBase(Biome.OCEAN, Biome.FOREST);
		setBiomeBase(Biome.DEEP_OCEAN, Biome.ROOFED_FOREST);
		setBiomeBase(Biome.FROZEN_OCEAN, Biome.BIRCH_FOREST);
		setBiomeBase(Biome.FROZEN_RIVER, Biome.FOREST);
		setBiomeBase(Biome.DESERT, Biome.PLAINS);
		setBiomeBase(Biome.DESERT_HILLS, Biome.FLOWER_FOREST);
		setBiomeBase(Biome.DESERT_MOUNTAINS, Biome.BIRCH_FOREST_MOUNTAINS);
	}

	public void setBiomeBase(Biome from, Biome to){
		BiomeBase[] biomes = BiomeBase.getBiomes();

		BiomeBase fromBB = CraftBlock.biomeToBiomeBase(from);
		BiomeBase toBB = CraftBlock.biomeToBiomeBase(to);

		biomes[(fromBB.id)] = toBB;
	}

}
