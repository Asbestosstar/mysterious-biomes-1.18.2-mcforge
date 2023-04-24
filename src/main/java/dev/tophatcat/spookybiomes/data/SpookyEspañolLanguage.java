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
package dev.tophatcat.spookybiomes.data;

import dev.tophatcat.spookybiomes.SpookyBiomes;
import dev.tophatcat.spookybiomes.init.SpookyBlocks;
import dev.tophatcat.spookybiomes.init.SpookyEntities;
import net.minecraft.Util;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class SpookyEspañolLanguage extends LanguageProvider {
    public SpookyEspañolLanguage(final DataGenerator gen) {
        super(gen, SpookyBiomes.MOD_ID, "es_mx");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.spookybiomes", "Spooky Biomes");

        addBlock(SpookyBlocks.SORBUS_LOG_STRIPPED, "Tronco de Soboro sin corteza");
        addBlock(SpookyBlocks.SORBUS_LOG, "Tronco de Soboro");
        addBlock(SpookyBlocks.SORBUS_LEAVES, "Hojas de Soboro");
        addBlock(SpookyBlocks.SORBUS_PLANKS, "Madera de Soboro");
        addBlock(SpookyBlocks.SORBUS_SAPLING, "Retoño de Soboro");
        addBlock(SpookyBlocks.SORBUS_GATE, "Puerta de valla de Soboro");
        addBlock(SpookyBlocks.SORBUS_DOOR, "Puerta de Soboro");
        addBlock(SpookyBlocks.SORBUS_TRAPDOOR, "Trampilla de Soboro");
        addBlock(SpookyBlocks.SORBUS_STAIRS, "Escalares de Soboro");
        addBlock(SpookyBlocks.SORBUS_FENCE, "Valla de Soboro");
        addBlock(SpookyBlocks.SORBUS_SLAB, "Losa de Soboro");
        addBlock(SpookyBlocks.SORBUS_PRESSURE_PLATE, "Placa de presión de Soboro");
        addBlock(SpookyBlocks.SORBUS_BUTTON, "Soboro");
        addBlock(SpookyBlocks.SORBUS_SIGN, "Letrero de Soboro");
        // Just in case, we manually create the translation key for the wall sign block, even though nothing uses it,
        // only because vanilla Minecraft provides the same translation keys
        add(Util.makeDescriptionId("block", SpookyBlocks.SORBUS_WALL_SIGN.getId()), "Pared Letrero de Soboro");

        addBlock(SpookyBlocks.GHOSTLY_LOG_STRIPPED, "Tronco de Fantasmal sin corteza");
        addBlock(SpookyBlocks.GHOSTLY_LOG, "Tronco de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_LEAVES, "Hojas de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_PLANKS, "Madera de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_SAPLING, "Retoño de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_GATE, "Puerta de valla de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_DOOR, "Puerta de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_TRAPDOOR, "Trampilla de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_STAIRS, "Escalares de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_FENCE, "Valla de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_SLAB, "Losa de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_PRESSURE_PLATE, "Placa de presión de Fantasmal");
        addBlock(SpookyBlocks.GHOSTLY_BUTTON, "Botón de Fantasmal ");
        addBlock(SpookyBlocks.GHOSTLY_SIGN, "Letrero de Fantasmal");
        add(Util.makeDescriptionId("block", SpookyBlocks.GHOSTLY_WALL_SIGN.getId()), "Pared Letrero de Fantasmal");

        addBlock(SpookyBlocks.SEEPING_LOG_STRIPPED, "Tronco de Seeping sin corteza");
        addBlock(SpookyBlocks.SEEPING_LOG, "Tronco de Seeping");
        addBlock(SpookyBlocks.SEEPING_LEAVES, "Hojas de Seeping");
        addBlock(SpookyBlocks.SEEPING_PLANKS, "Madera de Seeping");
        addBlock(SpookyBlocks.SEEPING_SAPLING, "Retoño de Seeping");
        addBlock(SpookyBlocks.SEEPING_GATE, "Puerta de valla de Seeping");
        addBlock(SpookyBlocks.SEEPING_DOOR, "Puerta de Seeping");
        addBlock(SpookyBlocks.SEEPING_TRAPDOOR, "Trampilla de Seeping");
        addBlock(SpookyBlocks.SEEPING_STAIRS, "Escalares de Seeping");
        addBlock(SpookyBlocks.SEEPING_FENCE, "Valla de Seeping");
        addBlock(SpookyBlocks.SEEPING_SLAB, "Losa de Seeping");
        addBlock(SpookyBlocks.SEEPING_PRESSURE_PLATE, "Placa de presión de Seeping");
        addBlock(SpookyBlocks.SEEPING_BUTTON, "Botón de Seeping");
        addBlock(SpookyBlocks.SEEPING_SIGN, "Letrero de Seeping");
        add(Util.makeDescriptionId("block", SpookyBlocks.SEEPING_WALL_SIGN.getId()), "Pared Letrero de Seeping");

        addBlock(SpookyBlocks.BLOODWOOD_LOG_STRIPPED, "Tronco de Sangre sin corteza");
        addBlock(SpookyBlocks.BLOODWOOD_LOG, "Tronco de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_LEAVES, "Hojas de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_PLANKS, "Madera de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_SAPLING, "Retoño de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_GATE, "Puerta de valla de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_DOOR, "Puerta de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_TRAPDOOR, "Trampilla de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_STAIRS, "Escalares de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_FENCE, "Valla de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_SLAB, "Losa de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_PRESSURE_PLATE, "Placa de presión de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_BUTTON, "Botón de Sangre");
        addBlock(SpookyBlocks.BLOODWOOD_SIGN, "Letrero de Sangre");
        add(Util.makeDescriptionId("block", SpookyBlocks.BLOODWOOD_WALL_SIGN.getId()), "Pared Letrero de Sangre");

        addBlock(SpookyBlocks.BLOODIED_DIRT, "Sangrento Tierra");
        addBlock(SpookyBlocks.BLOODIED_GRASS, "Sangrento Pasto");

        addEntityType(SpookyEntities.THE_FORGOTTEN_WARLOCK, "El Warlock Olvidado");

        add("spookybiomes.config.biomeGeneration", "Biome Generation");
        add("spookybiomes.config.biomeGeneration.tooltip", "Biome settings for Spooky Biomes");
        add("spookybiomes.config.ghostlyBiomeWeight", "Ghostly Biome Weight");
        add("spookybiomes.config.sorbusBiomeWeight", "Sorbus Biome Weight");

        add("spookybiomes.config.treeGeneration", "Tree Generation");
        add("spookybiomes.config.treeGeneration.tooltip", "Tree generation settings for Spooky Biomes trees");
        add("spookybiomes.config.ghostlyOnHills", "Ghostly Trees on hills");
        add("spookybiomes.config.sorbusOnHills", "Sorbus Trees on hills");
    }
}
