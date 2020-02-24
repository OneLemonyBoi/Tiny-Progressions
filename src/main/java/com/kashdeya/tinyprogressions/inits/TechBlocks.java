package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.main.Reference;

import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TechBlocks {
	
	
	public static final DeferredRegister<Block> BLOCK_REGISTEY = new DeferredRegister<>(ForgeRegistries.BLOCKS, Reference.MOD_ID);
	
	// Tech Blocks
	public static Block growth_block;
	public static Block growth_upgrade;
	public static Block growth_upgrade_two;
	public static Block cobblegen_block;
	public static Block iron_cobblegen_block;
	public static Block diamond_cobblegen_block;
	public static Block emerald_cobblegen_block;
	public static Block blaze_cobblegen_block;
	public static Block iron_furnace_block;
	// Deco Blocks
	public static Block charcoal_block;
	public static Block reinforced_glass;
	public static Block reinforced_obsidian;
	public static Block dirty_glass;
	public static Block diorite_brick;
	public static Block granite_brick;
	public static Block andesite_brick;
	public static Block old_reed;
	// Compressed Blocks
	public static Block flesh_block;
	public static Block bone_block;
	public static Block netherstar_block;
	public static Block flint_block;
	// Stone Torch
	public static Block stone_torch;
	// EnderOre
	public static Block ender_ore;
	// wub ore
	public static Block wub_ore;
	public static Block nether_wub_ore;
	// Lava Block
	public static Block lava_block;
	public static Block nether_lava_block;
	// Water Block
	public static Block water_block;
	// Hardened Stone
	public static Block unhardened_stone;
	public static Block hardened_stone;
	public static Block hardened_stone_bricks;
	public static Block hardened_stone_smallbricks;
	
	public static Block hardened_stone_stairs;
	public static Block hardened_stone_bricks_stairs;
	public static Block hardened_stone_smallbricks_stairs;
	
	public static Block hardened_stone_slab_half;
	public static Block hardened_stone_slab_double;
	
	public static Block hardened_stone_bricks_slab_half;
	public static Block hardened_stone_bricks_slab_double;
	
	public static Block hardened_stone_smallbricks_slab_half;
    public static Block hardened_stone_smallbricks_slab_double;
    // Angel
    public static Block fmf_block;
    // Lamp Blocks
    public static Block lamp;
    public static Block colored_lamp;
	// Glowstone Blocks
    public static Block colored_glowstone;
    // Withered Block
    public static Block withered_block;
    // berries
    public static Block blueberry_bush;
    public static Block blackberry_bush;
    public static Block maloberry_bush;
    public static Block raspberry_bush;
    // bsc sugar blocks
    public static Block compressed_sugar;
    public static Block double_compressed_sugar;
    // bsc sugar cane blocks
    public static Block compressed_sugar_cane;
    public static Block double_compressed_sugar_cane;
    public static Block triple_compressed_sugar_cane;
    public static Block quadruple_compressed_sugar_cane;
    public static Block quintuple_compressed_sugar_cane;
    public static Block sextuple_compressed_sugar_cane;
    public static Block septuple_compressed_sugar_cane;
    public static Block octuple_compressed_sugar_cane;
    // nether blocks
    public static Block compressed_nether_block;
    public static Block double_compressed_nether_block;
    public static Block triple_compressed_nether_block;
    public static Block quadruple_compressed_nether_block;
    public static Block quintuple_compressed_nether_block;
    public static Block sextuple_compressed_nether_block;
    public static Block septuple_compressed_nether_block;
    public static Block octuple_compressed_nether_block;
    public static Block soul_sandstone;
    // water harvester
    public static Block water_harvester;
    // bridge
    public static Block bridge_builder;
    public static Block tower_builder;
    // vasholine
    public static Block VASHOLINE;
    // asphalt
    public static Block asphalt_block;
    // Lava Infused Stone Block
    public static Block lava_infused_stone;
    // Steel Block
    public static Block steel_block;
    // Ghost Block
    public static Block ghost_block;
    // quicksand
    public static Block quick_sand;
    // Glowstone Glass
    public static Block glowstone_glass;
    
    
    //TODO
//	public static void init() {
//		// glowstone glass
//		if (ConfigHandler.glowstone_glass) {
//			glowstone_glass = new GlowstoneGlass().setTranslationKey("glowstone_glass");
//		}
//		// quicksand
//		if (ConfigHandler.quick_sand){
//			quick_sand = new QuickSand().setTranslationKey("quick_sand");
//		}
//		// wub ore
//		if (ConfigHandler.vasholine){
//			wub_ore = new WubOre().setTranslationKey("wub_ore");
//			nether_wub_ore = new NetherWubOre().setTranslationKey("nether_wub_ore");
//		}
//		// Steel Block
//		if (ConfigHandler.steel_ingot){
//			steel_block = new DecoMain().setOreDictName("blockSteel").setTranslationKey("steel_block");
//		}
//		// Lava Infused Stone Block
//		if (ConfigHandler.lava_infused_stone){
//			lava_infused_stone = new Infused();
//		}
//		// asphalt
//		if (ConfigHandler.asphalt){
//			asphalt_block = new Asphalt();
//		}
//		// Compressed Blocks
//		if (ConfigHandler.nether_compressed_blocks){
//			compressed_nether_block = new CompressedBlocks("compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.compressed_nether_block, 1, 1).setHardness(0.4F).setResistance(10.0F);
//			double_compressed_nether_block = new CompressedBlocks("double_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.double_compressed_nether_block, 1, 1).setHardness(0.8F).setResistance(20.0F);
//			triple_compressed_nether_block = new CompressedBlocks("triple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.triple_compressed_nether_block, 1, 1).setHardness(1.2F).setResistance(30.0F);
//			quadruple_compressed_nether_block = new CompressedBlocks("quadruple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.quadruple_compressed_nether_block, 1, 1).setHardness(1.6F).setResistance(40.0F);
//			quintuple_compressed_nether_block = new CompressedBlocks("quintuple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.quintuple_compressed_nether_block, 1, 1).setHardness(2.0F).setResistance(50.0F);
//			sextuple_compressed_nether_block = new CompressedBlocks("sextuple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.sextuple_compressed_nether_block, 1, 1).setHardness(2.4F).setResistance(60.0F);
//			septuple_compressed_nether_block = new CompressedBlocks("septuple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.septuple_compressed_nether_block, 1, 1).setHardness(2.8F).setResistance(70.0F);
//			octuple_compressed_nether_block = new CompressedBlocks("octuple_compressed_nether_block", Material.ROCK, SoundType.STONE, TechBlocks.octuple_compressed_nether_block, 1, 1).setHardness(3.2F).setResistance(80.0F);
//		}
//		
//		// water harvester
//		if (ConfigHandler.water_harvester){
//			water_harvester = new WaterHarvester();
//		}
//		
//		// bridge
//		if (ConfigHandler.bridge_builder){
//			bridge_builder = new BridgeBuilder();
//		}
//		
//		// tower
//		if (ConfigHandler.tower_builder){
//			tower_builder = new TowerBuilder();
//		}
//		
//		// bsc sugar blocks
//		if (ConfigHandler.bsc_sugar_compressed_blocks){
//			compressed_sugar = new CompressedBlocks("compressed_sugar", Material.CLAY, SoundType.SNOW, TechBlocks.compressed_sugar, 1, 1).setHardness(0.6F).setResistance(0.6F);			
//			double_compressed_sugar = new CompressedBlocks("double_compressed_sugar", Material.CLAY, SoundType.SNOW, TechBlocks.double_compressed_sugar, 1, 1).setHardness(1.0F).setResistance(1.2F);
//		}
//		
//		// bsc sugar cane blocks
//		if (ConfigHandler.bsc_sugarcane_compressed_blocks){
//			compressed_sugar_cane = new CompressedBlocks("compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.compressed_sugar_cane, 1, 1).setHardness(1.0F).setResistance(1.0F);
//			double_compressed_sugar_cane = new CompressedBlocks("double_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.double_compressed_sugar_cane, 1, 1).setHardness(1.2F).setResistance(1.2F);
//			triple_compressed_sugar_cane = new CompressedBlocks("triple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.triple_compressed_sugar_cane, 1, 1).setHardness(1.4F).setResistance(1.4F);
//			quadruple_compressed_sugar_cane = new CompressedBlocks("quadruple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.quadruple_compressed_sugar_cane, 1, 1).setHardness(1.6F).setResistance(1.6F);
//			quintuple_compressed_sugar_cane = new CompressedBlocks("quintuple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.quintuple_compressed_sugar_cane, 1, 1).setHardness(1.8F).setResistance(1.8F);
//			sextuple_compressed_sugar_cane = new CompressedBlocks("sextuple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.sextuple_compressed_sugar_cane, 1, 1).setHardness(2.0F).setResistance(2.0F);
//			septuple_compressed_sugar_cane = new CompressedBlocks("septuple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.septuple_compressed_sugar_cane, 1, 1).setHardness(2.2F).setResistance(2.2F);
//			octuple_compressed_sugar_cane = new CompressedBlocks("octuple_compressed_sugar_cane", Material.GROUND, SoundType.GROUND, TechBlocks.octuple_compressed_sugar_cane, 1, 1).setHardness(2.4F).setResistance(2.4F);
//		}
//		
//		// Berry Bushes
//		if (ConfigHandler.ExtraJuices || ConfigHandler.ExtraJuicesBottles){
//			blueberry_bush = new BlueberryBush();
//			blackberry_bush = new BlackberryBush();
//			maloberry_bush = new MaloberryBush();
//			raspberry_bush = new RaspberryBush();
//		}
//		
//		// Tech Blocks
//		if (ConfigHandler.BlockGrowth) {
//			growth_block = new BlockGrowth();
//		}
//		if (ConfigHandler.BlockGrowthUpgrade) {
//			growth_upgrade = new BlockGrowthUpgrade();
//		}
//		if (ConfigHandler.BlockGrowthUpgradeTwo) {
//			growth_upgrade_two = new BlockGrowthUpgradeTwo();
//		}
//		if (ConfigHandler.Cobblegen) {
//			cobblegen_block = new Cobblegen();
//		}
//		if (ConfigHandler.IronCobblegen) {
//			iron_cobblegen_block = new IronCobblegen();
//		}
//		if (ConfigHandler.DiamondCobblegen) {
//			diamond_cobblegen_block = new DiamondCobblegen();
//		}
//		if (ConfigHandler.BlazeCobblegen) {
//			blaze_cobblegen_block = new BlazeCobblegen();
//		}
//		if (ConfigHandler.EmeraldCobblegen) {
//			emerald_cobblegen_block = new EmeraldCobblegen();
//		}
//		if(ConfigHandler.iron_furnace)
//			iron_furnace_block = new IronFurnaceBlock(100); // 200 is vanilla furnace speed
//
//		// Deco Blocks
//		if (ConfigHandler.StoneTorch) {
//			stone_torch = new StoneTorch();
//		}
//		if (ConfigHandler.CharcoalBlock) {
//			charcoal_block = new CharcoalBlock();
//		}
//		if (ConfigHandler.ReinforcedGlass) {
//			reinforced_glass = new ReinforcedGlass();
//		}
//		if (ConfigHandler.ReinforcedObsidian) {
//			reinforced_obsidian = new ReinforcedObsidian();
//		}
//		if (ConfigHandler.DirtyGlass) {
//			dirty_glass = new DirtyGlass();
//		}
//		if (ConfigHandler.hardened_stone) {
//			unhardened_stone = new UnhardenedBlock();
//			hardened_stone = new HardenedBlocks("hardened_stone", Material.ROCK, TechBlocks.hardened_stone, 1, 1);
//			hardened_stone_bricks = new HardenedBlocks("hardened_stone_bricks", Material.ROCK, TechBlocks.hardened_stone_bricks, 1, 1);
//			hardened_stone_smallbricks = new HardenedBlocks("hardened_stone_smallbricks", Material.ROCK, TechBlocks.hardened_stone_smallbricks, 1, 1);
//			
//			hardened_stone_stairs = new Stairs(hardened_stone).setTranslationKey("hardened_stone_stairs");
//            hardened_stone_bricks_stairs = new Stairs(hardened_stone_bricks).setTranslationKey("hardened_stone_bricks_stairs");
//            hardened_stone_smallbricks_stairs = new Stairs(hardened_stone_smallbricks).setTranslationKey("hardened_stone_smallbricks_stairs");
//            
//            hardened_stone_slab_double = new Slabs().setDropped(hardened_stone_slab_half).setTranslationKey("hardened_stone_slab_double");
//            hardened_stone_slab_half = new Slabs((BlockSlab)hardened_stone_slab_double).setTranslationKey("hardened_stone_slab_half");
//
//            hardened_stone_bricks_slab_double = new Slabs().setDropped(hardened_stone_bricks_slab_half).setTranslationKey("hardened_stone_bricks_slab_double");
//            hardened_stone_bricks_slab_half = new Slabs((BlockSlab)hardened_stone_bricks_slab_double).setTranslationKey("hardened_stone_bricks_slab_half");
//            
//            hardened_stone_smallbricks_slab_double = new Slabs().setDropped(hardened_stone_smallbricks_slab_half).setTranslationKey("hardened_stone_smallbricks_slab_double");
//            hardened_stone_smallbricks_slab_half = new Slabs((BlockSlab)hardened_stone_smallbricks_slab_double).setTranslationKey("hardened_stone_smallbricks_slab_half");
//		}
//		if (ConfigHandler.old_reed) {
//			old_reed = new OldReed();
//		}
//		// Lamps
//		if (ConfigHandler.ColorLamps){
//			lamp = new Lamp().setTranslationKey("lamp");
//			colored_lamp = new LampColored();
//		}
//		// Glowstone
//		if (ConfigHandler.ColorGlowstone){
//			colored_glowstone = new GlowstoneColored();
//		}
//		
//
//		// Compressed Blocks
//		if (ConfigHandler.FleshBlock) {
//			flesh_block = new FleshBlock();
//		}
//		if (ConfigHandler.BoneBlock) {
//			bone_block = new BoneBlock();
//		}
//		if (ConfigHandler.NetherStarBlock) {
//			netherstar_block = new NetherStarBlock();
//		}
//		if (ConfigHandler.DioriteBrick) {
//			diorite_brick = new DioriteBrick();
//		}
//		if (ConfigHandler.GraniteBrick) {
//			granite_brick = new GraniteBrick();
//		}
//		if (ConfigHandler.AndesiteBrick) {
//			andesite_brick = new AndesiteBrick();
//		}
//
//		// Flint Block
//		if (ConfigHandler.FlintBlock) {
//			flint_block = new FlintBlock();
//		}
//
//		// Ore
//		if (ConfigHandler.ender_ore) {
//			ender_ore = new EnderOre();
//		}
//		
//		// FMF Block
//		if(ConfigHandler.angel_block) {
//			fmf_block = new StandardBlock(Material.GROUND).setUnlocalName("fmf_block")
//					.setSound(SoundType.STONE).setHarvestLvl("pickaxe", 0)
//					.setItemBlock(AngelItemBlock.class).setBlockRenderLayer(BlockRenderLayer.CUTOUT)
//					.setHardness(1.5F).setResistance(1000F);
//		}
//		
//		// Lava & Water Blocks
//		if (ConfigHandler.lava_block) {
//			lava_block = new LavaBlock();
//		}
//		if (ConfigHandler.nether_lava_block) {
//			nether_lava_block = new NetherLavaBlock();
//		}
//		if (ConfigHandler.water_block) {
//			water_block = new WaterBlock();
//		}
//		
//		// Withered Block
//		if (ConfigHandler.WitheredBlock){
//			withered_block = new WitheredBlock();
//		}
//		if (ConfigHandler.vasholine){
//			VASHOLINE = new BlockFluidVasholine();
//		}
//		
//		// Can not turn off
//			ghost_block = new GhostBlock();
//			soul_sandstone = new CompressedBlocks("soul_sandstone", Material.ROCK, SoundType.STONE, TechBlocks.soul_sandstone, 1, 1).setHardness(0.4F).setResistance(10.0F);
//	}
}
