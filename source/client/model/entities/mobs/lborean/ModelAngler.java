package net.tslat.aoa3.client.model.entities.mobs.lborean;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelAngler extends ModelBase {
	private ModelRenderer shape1;
	private ModelRenderer shape2;
	private ModelRenderer shape3;
	private ModelRenderer shape4;
	private ModelRenderer shape6;
	private ModelRenderer shape5;
	private ModelRenderer shape7;
	private ModelRenderer shape8;
	private ModelRenderer shape9;
	private ModelRenderer shape10;
	private ModelRenderer shape11;
	private ModelRenderer shape12;
	private ModelRenderer shape13;
	private ModelRenderer shape14;
	private ModelRenderer shape15;
	private ModelRenderer shape16;
	private ModelRenderer body;
	private ModelRenderer leg1;
	private ModelRenderer leg2;
	private ModelRenderer leg3;
	private ModelRenderer leg4;
	private ModelRenderer body2;

	public ModelAngler() {
		textureWidth = 64;
		textureHeight = 64;
		(shape1 = new ModelRenderer(this, 0, 56)).addBox(-1.5f, -7.0f, -10.5f, 3, 3, 3);
		shape1.setRotationPoint(5.0f, 7.0f, -5.0f);
		shape1.setTextureSize(64, 64);
		shape1.mirror = true;
		setRotation(shape1, -0.0872665f, 0.0f, 0.0f);
		(shape2 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -3.0f, -3.0f, 6, 6, 3);
		shape2.setRotationPoint(5.0f, 7.0f, -5.0f);
		shape2.setTextureSize(64, 64);
		shape2.mirror = true;
		setRotation(shape2, 0.0f, 0.0f, 0.0f);
		(shape3 = new ModelRenderer(this, 19, 10)).addBox(1.0f, 0.0f, -6.0f, 1, 4, 1);
		shape3.setRotationPoint(5.0f, 7.0f, -5.0f);
		shape3.setTextureSize(64, 64);
		shape3.mirror = true;
		setRotation(shape3, 0.0f, 0.0f, 0.0f);
		(shape4 = new ModelRenderer(this, 0, 31)).addBox(-1.5f, -3.5f, -2.0f, 3, 3, 2);
		shape4.setRotationPoint(5.0f, 7.0f, -5.0f);
		shape4.setTextureSize(64, 64);
		shape4.mirror = true;
		setRotation(shape4, -0.8179294f, 0.0f, 0.0f);
		(shape6 = new ModelRenderer(this, 0, 47)).addBox(-0.5f, -6.0f, -8.5f, 1, 1, 6);
		shape6.setRotationPoint(5.0f, 7.0f, -5.0f);
		shape6.setTextureSize(64, 64);
		shape6.mirror = true;
		setRotation(shape6, -0.0872665f, 0.0f, 0.0f);
		(shape5 = new ModelRenderer(this, 0, 39)).addBox(-1.0f, -3.0f, -6.0f, 2, 2, 5);
		shape5.setRotationPoint(5.0f, 7.0f, -5.0f);
		shape5.setTextureSize(64, 64);
		shape5.mirror = true;
		setRotation(shape5, -0.8179294f, 0.0f, 0.0f);
		(shape7 = new ModelRenderer(this, 0, 9)).addBox(-3.0f, -3.0f, -6.0f, 6, 3, 3);
		shape7.setRotationPoint(5.0f, 7.0f, -5.0f);
		shape7.setTextureSize(64, 64);
		shape7.mirror = true;
		setRotation(shape7, 0.0f, 0.0f, 0.0f);
		(shape8 = new ModelRenderer(this, 19, 10)).addBox(-2.0f, 0.0f, -6.0f, 1, 4, 1);
		shape8.setRotationPoint(5.0f, 7.0f, -5.0f);
		shape8.setTextureSize(64, 64);
		shape8.mirror = true;
		setRotation(shape8, 0.0f, 0.0f, 0.0f);
		(shape9 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -3.0f, -3.0f, 6, 6, 3);
		shape9.setRotationPoint(-5.0f, 7.0f, -5.0f);
		shape9.setTextureSize(64, 64);
		shape9.mirror = true;
		setRotation(shape9, 0.0f, 0.0f, 0.0f);
		(shape10 = new ModelRenderer(this, 19, 10)).addBox(1.0f, 0.0f, -6.0f, 1, 4, 1);
		shape10.setRotationPoint(-5.0f, 7.0f, -5.0f);
		shape10.setTextureSize(64, 64);
		shape10.mirror = true;
		setRotation(shape10, 0.0f, 0.0f, 0.0f);
		(shape11 = new ModelRenderer(this, 19, 10)).addBox(-2.0f, 0.0f, -6.0f, 1, 4, 1);
		shape11.setRotationPoint(-5.0f, 7.0f, -5.0f);
		shape11.setTextureSize(64, 64);
		shape11.mirror = true;
		setRotation(shape11, 0.0f, 0.0f, 0.0f);
		(shape12 = new ModelRenderer(this, 0, 9)).addBox(-3.0f, -3.0f, -6.0f, 6, 3, 3);
		shape12.setRotationPoint(-5.0f, 7.0f, -5.0f);
		shape12.setTextureSize(64, 64);
		shape12.mirror = true;
		setRotation(shape12, 0.0f, 0.0f, 0.0f);
		(shape13 = new ModelRenderer(this, 0, 31)).addBox(-1.5f, -3.5f, -2.0f, 3, 3, 2);
		shape13.setRotationPoint(-5.0f, 7.0f, -5.0f);
		shape13.setTextureSize(64, 64);
		shape13.mirror = true;
		setRotation(shape13, -0.8179294f, 0.0f, 0.0f);
		(shape14 = new ModelRenderer(this, 0, 39)).addBox(-1.0f, -3.0f, -6.0f, 2, 2, 5);
		shape14.setRotationPoint(-5.0f, 7.0f, -5.0f);
		shape14.setTextureSize(64, 64);
		shape14.mirror = true;
		setRotation(shape14, -0.8179294f, 0.0f, 0.0f);
		(shape15 = new ModelRenderer(this, 0, 47)).addBox(-0.5f, -6.0f, -8.5f, 1, 1, 6);
		shape15.setRotationPoint(-5.0f, 7.0f, -5.0f);
		shape15.setTextureSize(64, 64);
		shape15.mirror = true;
		setRotation(shape15, -0.0872665f, 0.0f, 0.0f);
		(shape16 = new ModelRenderer(this, 0, 56)).addBox(-1.5f, -7.0f, -10.5f, 3, 3, 3);
		shape16.setRotationPoint(-5.0f, 7.0f, -5.0f);
		shape16.setTextureSize(64, 64);
		shape16.mirror = true;
		setRotation(shape16, -0.0872665f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 18, 21)).addBox(-6.0f, -4.0f, -7.0f, 12, 8, 5);
		body.setRotationPoint(0.0f, 10.0f, 9.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 1.570796f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -2.0f, 4, 7, 4);
		leg1.setRotationPoint(-3.0f, 17.0f, 10.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 4, 7, 4);
		leg2.setRotationPoint(3.0f, 17.0f, 10.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 24, 2)).addBox(-3.0f, 0.0f, -3.0f, 4, 12, 4);
		leg3.setRotationPoint(-3.0f, 12.0f, -2.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 24, 2)).addBox(-1.0f, 0.0f, -3.0f, 4, 12, 4);
		leg4.setRotationPoint(3.0f, 12.0f, -2.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 18, 35)).addBox(-6.0f, -10.0f, -7.0f, 12, 18, 7);
		body2.setRotationPoint(0.0f, 5.0f, 5.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		shape1.render(par7);
		shape2.render(par7);
		shape3.render(par7);
		shape4.render(par7);
		shape6.render(par7);
		shape5.render(par7);
		shape7.render(par7);
		shape8.render(par7);
		shape9.render(par7);
		shape10.render(par7);
		shape11.render(par7);
		shape12.render(par7);
		shape13.render(par7);
		shape14.render(par7);
		shape15.render(par7);
		shape16.render(par7);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		body2.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
