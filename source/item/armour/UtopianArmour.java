package net.tslat.aoa3.item.armour;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.ItemUtil;
import net.tslat.aoa3.utils.player.PlayerDataManager;

import javax.annotation.Nullable;
import java.util.List;

import static net.tslat.aoa3.common.registration.MaterialsRegister.ARMOUR_UTOPIAN;

public class UtopianArmour extends AdventArmour {
	public UtopianArmour(String name, String registryName, EntityEquipmentSlot slot) {
		super(ARMOUR_UTOPIAN, name, registryName, slot);
	}

	@Override
	public Enums.ArmourSets setType() {
		return Enums.ArmourSets.UTOPIAN;
	}

	@Override
	public void addBuffs(PlayerDataManager.PlayerBuffs plBuffs, @Nullable EntityEquipmentSlot slot) {
		if (slot == null) {
			plBuffs.addGlobalXpModifier(0.1f);
		}
		else {
			plBuffs.addGlobalXpModifier(0.05f);
		}
	}

	@Override
	public void removeBuffs(PlayerDataManager.PlayerBuffs plBuffs, @Nullable EntityEquipmentSlot slot) {
		if (slot == null) {
			plBuffs.removeGlobalXpModifier(0.1f);
		}
		else {
			plBuffs.removeGlobalXpModifier(0.05f);
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(pieceEffectHeader());
		tooltip.add(ItemUtil.getFormattedDescriptionText("item.UtopianArmour.desc.1", Enums.ItemDescriptionType.POSITIVE));
		tooltip.add(setEffectHeader());
		tooltip.add(ItemUtil.getFormattedDescriptionText("item.UtopianArmour.desc.2", Enums.ItemDescriptionType.POSITIVE));
	}
}
