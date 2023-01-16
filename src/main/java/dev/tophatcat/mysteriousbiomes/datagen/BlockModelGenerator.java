package dev.tophatcat.mysteriousbiomes.datagen;

import dev.tophatcat.mysteriousbiomes.setup.MysteriousContentSetup;
import dev.tophatcat.mysteriousbiomes.setup.MysteriousWoodTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.*;
import net.minecraft.data.family.BlockFamily;

public class BlockModelGenerator extends FabricModelProvider {

    private static final BlockFamily BLOODWOOD = fromWoodType(MysteriousWoodTypes.BLOODWOOD);
    private static final BlockFamily GHOSTLY = fromWoodType(MysteriousWoodTypes.GHOSTLY);
    private static final BlockFamily SORBUS = fromWoodType(MysteriousWoodTypes.SORBUS);
    private static final BlockFamily SEEPING = fromWoodType(MysteriousWoodTypes.SEEPING);
    private static final BlockFamily SAKURA = fromWoodType(MysteriousWoodTypes.SAKURA);

    public BlockModelGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator modelGen) {
        makeWoodTypes(modelGen, MysteriousWoodTypes.BLOODWOOD, BLOODWOOD);
        makeWoodTypes(modelGen, MysteriousWoodTypes.GHOSTLY, GHOSTLY);
        makeWoodTypes(modelGen, MysteriousWoodTypes.SORBUS, SORBUS);
        makeWoodTypes(modelGen, MysteriousWoodTypes.SEEPING, SEEPING);
        makeWoodTypes(modelGen, MysteriousWoodTypes.SAKURA, SAKURA);
        modelGen.registerSimpleCubeAll(MysteriousWoodTypes.BLOODWOOD.getLeaves().get());
        modelGen.registerSimpleCubeAll(MysteriousWoodTypes.GHOSTLY.getLeaves().get());
        modelGen.registerSimpleCubeAll(MysteriousWoodTypes.SORBUS.getLeaves().get());
        modelGen.registerSimpleCubeAll(MysteriousWoodTypes.SEEPING.getLeaves().get());
        modelGen.registerSimpleCubeAll(MysteriousWoodTypes.SAKURA.getLeaves().get());
        modelGen.registerTintableCross(MysteriousWoodTypes.BLOODWOOD.getSapling().get(),
            BlockStateModelGenerator.TintType.NOT_TINTED);
        modelGen.registerTintableCross(MysteriousWoodTypes.GHOSTLY.getSapling().get(),
            BlockStateModelGenerator.TintType.NOT_TINTED);
        modelGen.registerTintableCross(MysteriousWoodTypes.SORBUS.getSapling().get(),
            BlockStateModelGenerator.TintType.NOT_TINTED);
        modelGen.registerTintableCross(MysteriousWoodTypes.SEEPING.getSapling().get(),
            BlockStateModelGenerator.TintType.NOT_TINTED);
        modelGen.registerTintableCross(MysteriousWoodTypes.SAKURA.getSapling().get(),
            BlockStateModelGenerator.TintType.NOT_TINTED);

        modelGen.registerSimpleCubeAll(MysteriousContentSetup.BLOODIED_DIRT.get());
        modelGen.registerTopSoil(MysteriousContentSetup.BLOODIED_GRASS.get(),
            ModelIds.getBlockModelId(MysteriousContentSetup.BLOODIED_GRASS.get()),
            BlockStateVariant.create().put(VariantSettings.MODEL,
                Models.CUBE_BOTTOM_TOP.upload(MysteriousContentSetup.BLOODIED_GRASS.get(), "_snow",
                    new Texture().put(TextureKey.BOTTOM, Texture.getId(MysteriousContentSetup.BLOODIED_DIRT.get()))
                        .inherit(TextureKey.BOTTOM, TextureKey.PARTICLE).put(TextureKey.TOP,
                        Texture.getSubId(MysteriousContentSetup.BLOODIED_GRASS.get(), "_top"))
                    .put(TextureKey.SIDE, Texture.getSubId(MysteriousContentSetup.BLOODIED_GRASS.get(), "_snow")),
                modelGen.modelCollector)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    private void makeWoodTypes(BlockStateModelGenerator generator, MysteriousWoodTypes woodType, BlockFamily family) {
        generator.registerLog(woodType.getLog().get()).log(woodType.getLog().get()).wood(woodType.getWood().get());
        generator.registerLog(woodType.getStrippedLog().get()).log(woodType.getStrippedLog().get())
            .wood(woodType.getStrippedWood().get());
        generator.registerCubeAllModelTexturePool(woodType.getPlanks().get()).family(family);
    }

    private static BlockFamily fromWoodType(MysteriousWoodTypes woodTypes) {
        return new BlockFamily.Builder(woodTypes.getPlanks().get())
            .button(woodTypes.getButton().get())
            .door(woodTypes.getDoor().get())
            .fence(woodTypes.getFence().get())
            .fenceGate(woodTypes.getGate().get())
            .pressurePlate(woodTypes.getPressurePlate().get())
            .slab(woodTypes.getSlab().get())
            .stairs(woodTypes.getStairs().get())
            //TODO Sign stuff!
            //.sign(woodTypes.getFloorSign().get(), woodTypes.getWallSign().get())
            .trapdoor(woodTypes.getTrapdoor().get()).group("wooden").unlockCriterionName("has_planks").build();

    }
}
