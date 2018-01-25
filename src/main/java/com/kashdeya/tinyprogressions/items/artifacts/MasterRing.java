package com.kashdeya.tinyprogressions.items.artifacts;

import java.util.List;

import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MasterRing extends Item {
	
	public MasterRing() {
		super();
		this.setCreativeTab(TinyProgressions.tabTP);
	}
	
	
	public void onUpdate(ItemStack stack, World worldIn, Entity player, int itemSlot, boolean isSelected) {
		if(player instanceof EntityLivingBase && worldIn.isRemote)
			if(((EntityLivingBase) player).isPotionActive(MobEffects.NAUSEA))
				((EntityLivingBase) player).removePotionEffect(MobEffects.NAUSEA);
			if(((EntityLivingBase) player).isPotionActive(MobEffects.POISON))
				((EntityLivingBase) player).removePotionEffect(MobEffects.POISON);
			if(((EntityLivingBase) player).isPotionActive(MobEffects.WITHER))
				((EntityLivingBase) player).removePotionEffect(MobEffects.WITHER);
			if(((EntityLivingBase) player).isBurning())
				((EntityLivingBase) player).extinguish();
				((EntityLivingBase) player).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 3, 0, false, false));
	}
	
	@Override
	public EnumRarity getRarity(ItemStack stack) {
		return EnumRarity.EPIC;
	}
	
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack){
        return true;
    }
    
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced)
	{
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.masterring_1").getFormattedText());
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.masterring_2").getFormattedText());
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.masterring_3").getFormattedText());
		tooltip.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.masterring_4").getFormattedText());
	}
}