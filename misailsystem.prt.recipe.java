package  projectt.misaildoropper.recipe;
 
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
 
@Mod(modid = "recipe_sample")
public class RecipeSample{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
    }
 
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
 
        GameRegistry.addRecipe(new ItemStack(tile.misaildoropper,4),
                "RRR",
                "CDM",
                "SSS",

                'D',tile.Doropper,
                'R',Items.Redstone,
                'S',tile.Stone,
                'M',tile.Misail,
                'C',tile.Chest
        );
       GameRegistry.addRecipe(new ItemStack(tile.misail,8),
                "RSS",
                "UAT",
                "RSS",

                'A',tile.air,
                'R',Items.Redstone,
                'S',tile.Stone,
                'T',tile.tnt,
                'U',item.sulphur
        );
        GameRegistry.addRecipe(new ItemStack(tile.air,12),
                "UBU",
                "S S",
                "RGR",

                'U',item.bucketWater,
                'R',Items.Redstone,
                'S',tile.Stone,
                'G',item.glassBottle,
                'B',item.brewingStand
        );
       
    }
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }
}
