package projectt.misaildoropper.item;
 
import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

 
@Mod(modid = "PRTp",name = "PrjectTtestpack",virsion = "1.0.0.2")
@NetworkMod(cliantSideRequired = true,serverSideRequired = false,versionBounds ="1.0.0.2")


public class SampleMod {
    public static final String MOD_ID = "prt";
 
    @Mod.Instance("prt")
 
    public static prt INSTANCE;
 
    public static Brock misail;
 
 
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
           sampleItem = new Item()
                .setCreativeTab(CreativeTabs.tabMaterials)/*クリエイティブのタブ*/
                .setUnlocalizedName("SampleItem")/*システム名の登録*/
		/*.setHasSubtypes(true)*//*ダメージ値等で複数の種類のアイテムを分けているかどうか。デフォルトfalse*/
		/*.setMaxDamage(256)*//*耐久値の設定。デフォルト0*/
		/*.setFull3D()*//*３D表示で描画させる。ツールや骨、棒等。*/
		
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*指定文字列に対応した素材として醸造台で使える。PotionHelper参照のこと。*/
		/*.setNoRepair()*//*修理レシピを削除し、金床での修繕を出来なくする*/
                .setMaxStackSize(32);/*スタックできる量。デフォルト64*/
misail = new misail();
        //ブロックの登録。登録文字列はMOD内で被らなければ何でも良い。
 
        GameRegistry.registerBlock(misail, misail.class, "misail");
 
        //テクスチャ・モデル指定JSONファイル名の登録。
        if (event.getSide().isClient()) {
            //モデルJSONファイルのファイル名を登録。1IDで1つだけなら、登録名はGameRegistryでの登録名と同じものにする。
            //ItemStackのmetadataで種類を分けて描画させたい場合。登録名を予め登録する。
            ModelBakery.addVariantName(Item.getItemFromBlock(sampleBlock), MOD_ID + ":" + "sampleblock0", MOD_ID + ":" + "sampleblock1");
            //1IDで複数モデルを登録するなら、上のメソッドで登録した登録名を指定する。
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(sampleBlock), 0, new ModelResourceLocation(MOD_ID + ":" + "sampleblock0", "inventory"));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(sampleBlock), 1, new ModelResourceLocation(MOD_ID + ":" + "sampleblock1", "inventory"));
            //ModelLoader.setCustomStateMapper(sampleBlock, (new StateMap.Builder()).addPropertiesToIgnore(sampleBlock.METADATA).build());
            //上記のようにして無視させたいPropertyを指定することもできる。
            //その他にもここで設定できる項目もあるが割愛させていただく。
        }

    }
}
