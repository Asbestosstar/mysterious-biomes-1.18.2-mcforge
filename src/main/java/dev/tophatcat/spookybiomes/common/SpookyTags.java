/*
 * Spooky Biomes - https://tophatcat.dev/spooky-biomes
 * Copyright (C) 2016-2022 <KiriCattus>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 * USA
 * https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 */
package dev.tophatcat.spookybiomes.common;

import java.util.function.Function;

import dev.tophatcat.spookybiomes.SpookyBiomes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * A class holding the bound tags used in this mod.
 */
public class SpookyTags {

    /**
     * A class holding the bound block tags used in this mod.
     */
    public static class Blocks {

        public static final TagKey<Block> SORBUS_LOGS = tag("sorbus_logs");
        public static final TagKey<Block> GHOSTLY_LOGS = tag("ghostly_logs");
        public static final TagKey<Block> SEEPING_LOGS = tag("seeping_logs");
        public static final TagKey<Block> BLOODWOOD_LOGS = tag("bloodwood_logs");

        /**
         * Binds a block tag via its name. The name is appended with the modid.
         *
         * @param name the name of the tag
         * @return a new named, block tag
         */
        private static TagKey<Block> tag(final String name) {
            return BlockTags.create(new ResourceLocation(name));
        }
    }

    /**
     * A class holding the bound item tags used in this mod.
     */
    public static class Items {

        public static final TagKey<Item> SORBUS_LOGS = tag("sorbus_logs");
        public static final TagKey<Item> GHOSTLY_LOGS = tag("ghostly_logs");
        public static final TagKey<Item> SEEPING_LOGS = tag("seeping_logs");
        public static final TagKey<Item> BLOODWOOD_LOGS = tag("bloodwood_logs");

        /**
         * Binds an item tag via its name. The name is appended with the modid.
         *
         * @param name the name of the tag
         * @return a new named, item tag
         */
        private static TagKey<Item> tag(final String name) {
            return ItemTags.create(new ResourceLocation(name));
        }
    }

    /**
     * Binds a tag via its name. The name is appended with the modid.
     *
     * @param name    the name of the tag
     * @param tagBind the binding function to create the tag
     * @param <T>     the type of the elements of the tag
     * @return a new named tag
     */
    private static <T> TagKey<T> genericTag(final String name, final Function<String, TagKey<T>> tagBind) {
        return tagBind.apply(SpookyBiomes.MOD_ID + ":" + name);
    }
}
