package net.tslat.aoa3.block.functional.utility;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.CreativeTabsRegister;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.WeaponRegister;
import net.tslat.aoa3.utils.ItemUtil;

public class StrangeBlock extends Block {
	public StrangeBlock() {
		super(Material.ROCK);
		setTranslationKey("StrangeBlock");
		setRegistryName("aoa3:strange_block");
		setHardness(-1f);
		setResistance(999999999f);
		setSoundType(SoundType.STONE);
		setCreativeTab(CreativeTabsRegister.FUNCTIONAL_BLOCKS);
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && !player.getHeldItem(hand).isEmpty()) {
			ItemStack stack = player.getHeldItem(hand);

			if (stack.getItem() == ItemRegister.BLUE_STRANGE_STONE) {
				if (!player.capabilities.isCreativeMode)
					player.getHeldItem(hand).shrink(1);

				ItemUtil.givePlayerItemOrDrop(player, new ItemStack(WeaponRegister.SHYRE_BLASTER));
				return true;
			}
			else if (stack.getItem() == ItemRegister.YELLOW_STRANGE_STONE) {
				if (!player.capabilities.isCreativeMode)
					player.getHeldItem(hand).shrink(1);

				ItemUtil.givePlayerItemOrDrop(player, new ItemStack(WeaponRegister.AMPLIFIER));
				return true;
			}
			else if (stack.getItem() == ItemRegister.WHITE_STRANGE_STONE) {
				if (!player.capabilities.isCreativeMode)
					player.getHeldItem(hand).shrink(1);

				ItemUtil.givePlayerItemOrDrop(player, new ItemStack(WeaponRegister.SUBLIMUS));
				return true;
			}
		}

		return true;
	}
}
