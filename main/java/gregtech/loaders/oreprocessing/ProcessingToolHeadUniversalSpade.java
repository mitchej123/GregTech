/*    */ package gregtech.loaders.oreprocessing;
/*    */ 
/*    */ import gregtech.api.enums.Materials;
/*    */ import gregtech.api.enums.OrePrefixes;
/*    */ import gregtech.api.enums.ToolDictNames;
/*    */ import gregtech.api.util.GT_ModHandler;
/*    */ import gregtech.common.items.GT_MetaGenerated_Tool_01;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class ProcessingToolHeadUniversalSpade implements gregtech.api.interfaces.IOreRecipeRegistrator
/*    */ {
/*    */   public ProcessingToolHeadUniversalSpade()
/*    */   {
/* 14 */     OrePrefixes.toolHeadUniversalSpade.add(this);
/*    */   }
/*    */   
/*    */   public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack)
/*    */   {
/* 19 */     GT_ModHandler.addShapelessCraftingRecipe(GT_MetaGenerated_Tool_01.INSTANCE.getToolWithStats(32, 1, aMaterial, aMaterial, null), new Object[] { aOreDictName, OrePrefixes.stick.get(aMaterial), OrePrefixes.screw.get(aMaterial), ToolDictNames.craftingToolScrewdriver });
/*    */   }
/*    */ }


/* Location:              F:\Torrent\minecraft\jdgui test\gregtech_1.7.10-5.07.07-dev.jar!\gregtech\loaders\oreprocessing\ProcessingToolHeadUniversalSpade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1-SNAPSHOT-20140817
 */