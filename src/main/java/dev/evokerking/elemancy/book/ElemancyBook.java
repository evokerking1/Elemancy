package dev.evokerking.elemancy.book;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.klikli_dev.modonomicon.api.datagen.BookProvider;
import com.klikli_dev.modonomicon.api.datagen.BookSubProvider;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;

public class ElemancyBook extends BookProvider {

    public ElemancyBook(PackOutput packOutput, CompletableFuture<Provider> registries, String modId,
            List<BookSubProvider> subProviders) {
        super(packOutput, registries, modId, subProviders);
        //TODO Auto-generated constructor stub
    }

}
