
package games.absolutephoenix.omnicoingenerator.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import games.absolutephoenix.omnicoingenerator.block.BlockOmnicoinGeneratorT1;
import games.absolutephoenix.omnicoingenerator.ElementsOmnicoinGenerator;

@ElementsOmnicoinGenerator.ModElement.Tag
public class TabOmnicoinGeneratorTab extends ElementsOmnicoinGenerator.ModElement {
	public TabOmnicoinGeneratorTab(ElementsOmnicoinGenerator instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabomnicoingeneratortab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockOmnicoinGeneratorT1.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
