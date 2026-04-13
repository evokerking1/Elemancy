package dev.evokerking.elemancy.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;


public class ElemancyCraftRecipes extends FabricRecipeProvider {

    public ElemancyCraftRecipes(FabricPackOutput output, CompletableFuture<Provider> registriesFuture) {
        super(output, registriesFuture);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    protected RecipeProvider createRecipeProvider(Provider registries, RecipeOutput output) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createRecipeProvider'");
    }

}
