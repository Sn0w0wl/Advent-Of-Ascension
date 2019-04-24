package net.nevermine.structures.crystevia;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.nevermine.izer.Blockizer;

import java.util.Random;

public class CrystalTransferBlue extends WorldGenerator {
	public boolean generate(final World world, final Random rand, final int i, final int j, final int k) {
		boolean run = true;
		int y = j;
		while (run) {
			if (world.getBlock(i + 5, y - 1, k + 5) != Blockizer.CrysteviaRock) {
				world.setBlock(i + 5, y - 1, k + 5, Blockizer.CrystalBlockBlue);
				--y;
			}
			else {
				run = false;
			}
		}
		world.setBlock(i + 0, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 1, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 1, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 1, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 1, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 1, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 1, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 1, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 1, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 2, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 2, k + 1, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 2, k + 2, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 2, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 2, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 2, k + 8, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 2, k + 9, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 2, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 3, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 3, k + 1, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 3, k + 2, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 3, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 3, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 3, k + 8, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 3, k + 9, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 3, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 5, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 5, k + 2, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 5, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 5, k + 4, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 5, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 5, k + 6, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 5, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 5, k + 8, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 5, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 6, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 6, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 6, k + 4, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 6, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 6, k + 6, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 0, j + 6, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 6, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 7, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 7, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 0, j + 7, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 1, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 1, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 2, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 1, j + 2, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 1, j + 3, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 1, j + 3, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 1, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 5, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 5, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 6, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 6, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 7, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 7, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 7, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 7, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 8, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 8, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 1, j + 8, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 1, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 1, k + 2, Blockizer.CrystalBlue);
		world.setBlock(i + 2, j + 1, k + 4, Blockizer.CrystalBlue);
		world.setBlock(i + 2, j + 1, k + 6, Blockizer.CrystalBlue);
		world.setBlock(i + 2, j + 1, k + 8, Blockizer.CrystalBlue);
		world.setBlock(i + 2, j + 1, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 2, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 2, j + 2, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 2, j + 3, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 2, j + 3, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 2, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 5, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 2, j + 5, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 2, j + 6, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 6, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 7, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 7, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 8, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 8, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 8, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 8, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 2, j + 8, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 8, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 2, j + 8, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 1, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 1, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 2, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 2, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 3, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 3, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 5, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 5, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 6, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 6, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 7, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 7, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 8, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 3, j + 8, k + 3, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 3, j + 8, k + 4, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 3, j + 8, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 3, j + 8, k + 6, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 3, j + 8, k + 7, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 3, j + 8, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 1, k + 2, Blockizer.CrystalBlue);
		world.setBlock(i + 4, j + 1, k + 8, Blockizer.CrystalBlue);
		world.setBlock(i + 4, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 5, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 4, j + 5, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 4, j + 6, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 4, j + 6, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 4, j + 7, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 7, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 8, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 8, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 8, k + 3, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 4, j + 8, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 8, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 4, j + 8, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 8, k + 7, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 4, j + 8, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 8, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 9, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 9, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 4, j + 9, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 10, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 10, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 4, j + 10, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 11, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 11, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 4, j + 11, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 1, k + 5, Blockizer.CrystalCreatorBlue);
		world.setBlock(i + 5, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 5, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 5, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 6, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 6, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 7, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 7, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 8, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 8, k + 2, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 8, k + 3, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 8, k + 4, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 8, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 8, k + 6, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 8, k + 7, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 8, k + 8, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 8, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 9, k + 4, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 9, k + 6, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 10, k + 4, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 10, k + 6, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 11, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 11, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 11, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 12, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 5, j + 13, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 14, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 5, j + 15, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 1, k + 2, Blockizer.CrystalBlue);
		world.setBlock(i + 6, j + 1, k + 8, Blockizer.CrystalBlue);
		world.setBlock(i + 6, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 5, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 6, j + 5, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 6, j + 6, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 6, j + 6, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 6, j + 7, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 7, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 8, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 8, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 8, k + 3, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 6, j + 8, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 8, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 6, j + 8, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 8, k + 7, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 6, j + 8, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 8, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 9, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 9, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 6, j + 9, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 10, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 10, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 6, j + 10, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 11, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 11, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 6, j + 11, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 1, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 1, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 2, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 2, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 3, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 3, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 5, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 5, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 6, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 6, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 7, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 7, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 8, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 7, j + 8, k + 3, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 7, j + 8, k + 4, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 7, j + 8, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 7, j + 8, k + 6, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 7, j + 8, k + 7, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 7, j + 8, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 1, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 1, k + 2, Blockizer.CrystalBlue);
		world.setBlock(i + 8, j + 1, k + 4, Blockizer.CrystalBlue);
		world.setBlock(i + 8, j + 1, k + 6, Blockizer.CrystalBlue);
		world.setBlock(i + 8, j + 1, k + 8, Blockizer.CrystalBlue);
		world.setBlock(i + 8, j + 1, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 2, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 8, j + 2, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 8, j + 3, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 8, j + 3, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 8, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 5, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 8, j + 5, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 8, j + 6, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 6, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 7, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 7, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 8, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 8, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 8, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 8, k + 5, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 8, j + 8, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 8, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 8, j + 8, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 1, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 1, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 2, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 9, j + 2, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 9, j + 3, k + 0, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 9, j + 3, k + 10, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 9, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 5, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 5, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 6, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 6, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 7, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 7, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 7, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 7, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 8, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 8, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 9, j + 8, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 0, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 1, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 1, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 1, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 1, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 1, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 1, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 1, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 1, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 2, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 2, k + 1, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 2, k + 2, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 2, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 2, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 2, k + 8, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 2, k + 9, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 2, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 3, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 3, k + 1, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 3, k + 2, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 3, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 3, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 3, k + 8, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 3, k + 9, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 3, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 0, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 6, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 4, k + 10, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 5, k + 1, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 5, k + 2, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 5, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 5, k + 4, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 5, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 5, k + 6, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 5, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 5, k + 8, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 5, k + 9, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 6, k + 2, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 6, k + 3, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 6, k + 4, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 6, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 6, k + 6, Blockizer.CrystalBlockBlue);
		world.setBlock(i + 10, j + 6, k + 7, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 6, k + 8, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 7, k + 4, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 7, k + 5, Blockizer.CrystevianBricks);
		world.setBlock(i + 10, j + 7, k + 6, Blockizer.CrystevianBricks);
		return true;
	}
}