package cn.rmc.ultimategenerators.lists;

import cn.rmc.ultimategenerators.UltimateGenerators;
import cn.rmc.ultimategenerators.Utils;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

public class UGItems {

        public static ItemStack ENDLESS_GENERATOR;

        public static ItemStack NETHER_STAR_GENERATOR;

        public static ItemStack DIESEL_REFINERY;
        public static ItemStack DIESEL_BUCKET;
        public static ItemStack DIESEL_GENERATOR;

        public static ItemStack BIOMASS_EXTRACTION_MACHINE;
        public static ItemStack BIOMASS_BUCKET;
        public static ItemStack BIOFUEL_REFINERY;
        public static ItemStack BIOFUEL_BUCKET;
        public static ItemStack BIOFUEL_GENERATOR;

        public static ItemStack DRAGON_BREATH_GENERATOR;

        public static ItemStack REACTION_GENERATOR;

        public static ItemStack SOLID_STORAGE_EXPANSION, LIQUID_STORAGE_EXPANSION;
        public static ItemStack COAL_GENERATOR, LAVA_GENERATOR, COMBUSTION_REACTOR;
        public static ItemStack BIO_REACTOR = new CustomItemStack(Material.LIME_TERRACOTTA,
                        "&2生化反应器 &7(扩容版)&r", "", "&6发电机组", "&8\u21E8 &e\u26A1 &7128 J 缓存", "&8\u21E8 &e\u26A1 &78 J/s");

        public static ItemStack ELECTRICITY_STORAGE_UNIT;
        public static ItemStack ADVANCED_BATTERY, ALPHA_BATTERY, BETA_BATTERY, GAMMA_BATTERY;
        public static ItemStack BASIC_ELECTRICITY_STORAGE, ADVANCED_ELECTRICITY_STORAGE, ALPHA_ELECTRICITY_STORAGE,
                        BETA_ELECTRICITY_STORAGE, GAMMA_ELECTRICITY_STORAGE, LAMBDA_ELECTRICITY_STORAGE,
                        KAPA_ELECTRICITY_STORAGE, PHI_ELECTRICITY_STORAGE;

//        public static ItemStack MAGNESIUM_SALT, MAGNESIUM_GENERATOR;

        public static ItemStack QUANTUM_SOLAR_GENERATOR;

        public static ItemStack MODULAR_GENERATOR_REGULATOR;

        public static ItemStack ENDER_CRYSTAL_GENERATOR, ENDER_CRYSTAL_GENERATOR_BASE,
                        ENDER_CRYSTAL_GENERATOR_STABILIZER, ENDER_CRYSTAL_ENHANCER;
        public static ItemStack RUNE_COMPLEX_ENDER, ENDER_LUMP_4;

        public static ItemStack HEAVY_WATER_BUCKET, HEAVY_WATER_REFINING_MACHINE;

        public static ItemStack THERMAL_NEUTRON_REACTOR, THERMAL_NEUTRON_REACTOR_COOLANT_CELL;
        public static ItemStack NEUTRON_MODERATOR;

        public static ItemStack RAINBOW_ALLOY, REINFORCED_RAINBOW_GLASS;
        public static ItemStack RAINBOW_REACTOR;

        public static ItemStack GLASS_ELECTRICITY_TRANSMITTER;

        static {
                try {
                        ENDLESS_GENERATOR = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2Y5ZjM1NmY1ZmU3ZDFiYzkyY2RkZmFlYmEzZWU3NzNhYzlkZjFjYzRkMWMyZjhmZTVmNDcwMTMwMzJjNTUxZCJ9fX0="),
                                        "&6无尽发电机&r", "", "&r当接收到红石信号时工作", "", "&5创造发电机", "&8⇨ &e⚡ &7发电效率由接收到的红石信号强度决定");

                        NETHER_STAR_GENERATOR = new CustomItemStack(Material.GRAY_STAINED_GLASS,
                                        "&d下届之星发电机&r", "", "&4终极发电机", "&8⇨ &e⚡ &71024 J 缓存", "&8⇨ &e⚡ &7128 J/s");

                        DIESEL_REFINERY = new CustomItemStack(Material.PISTON, "&c柴油精炼器&r", "",
                                        "&r精炼石油生产柴油");
                        DIESEL_BUCKET = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWFmZTgzNjkyZjcxZjA1ZDExM2Q4OTFmOGI4MzhlMDdkN2NiODE0MTliMjBkYzFiMjA5ZWI4NGY3NzFmMGM5ZiJ9fX0="),
                                        "&r桶装柴油&r");
                        DIESEL_GENERATOR = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWVlMTE1NjU2YmMyMjA3NTVjNmQ1YmM4NzI2MGM4MjE0MWMyNTNhMzRiYzNkYjJiZDcyYjcyN2JlZmNjMCJ9fX0="),
                                        "&7柴油发电机&r", "", "&6高级发电机", "&8⇨ &e⚡ &7256 J 缓存", "&8⇨ &e⚡ &736 J/s");

                        BIOMASS_EXTRACTION_MACHINE = new CustomItemStack(Material.LIME_STAINED_GLASS,
                                        "&a生物质萃取机&r", "", "&a中级机器", "&8⇨ &e⚡ &76 J/s");
                        BIOMASS_BUCKET = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzdkYmYxNTAzYmQxYTI3YTQ1N2M1MDk3NDRkNTIwZWVjMzhlM2Q0OGQ4YTNiZmUzY2FkZTc2Nzc4OTY0MmYifX19"),
                                        "&r桶装生物质&r");
                        BIOFUEL_REFINERY = new CustomItemStack(Material.PISTON, "&c生物燃油精炼器&r",
                                        "", "&r精炼生物质生产生物燃油");
                        BIOFUEL_BUCKET = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTdjNDA3YWE3YjMzNjIyNTMwOWQ1MzUwZTNmNDUyYmZjZjM1NTY5MmU5ODFkODFkZGZlMzIwOGJjZjZlZDI2YyJ9fX0="),
                                        "&r桶装生物燃油&r");
                        BIOFUEL_GENERATOR = new CustomItemStack(Material.YELLOW_STAINED_GLASS,
                                        "&2生物燃油发电机&r", "", "&6高级发电机", "&8⇨ &e⚡ &7256 J 缓存", "&8⇨ &e⚡ &736 J/s");

                        DRAGON_BREATH_GENERATOR = new CustomItemStack(Material.MAGENTA_STAINED_GLASS,
                                        "&5龙息发电机&r", "", "&6高级发电机", "&8⇨ &e⚡ &7256 J 缓存", "&8⇨ &e⚡ &718 J/s");

                        REACTION_GENERATOR = new CustomItemStack(Material.GREEN_TERRACOTTA,
                                        "&2反应发电机&r", "", "&r无需冷却的小型核反应发电机", "&r直接消耗低能核燃料发电", "&r但此发电方式的燃料利用率较低", "",
                                        "&6高级发电机", "&8⇨ &e⚡ &7256 J 缓存", "&8⇨ &e⚡ &716 J/s");

                        ENDER_CRYSTAL_GENERATOR = new CustomItemStack(Material.PURPLE_STAINED_GLASS,
                                        "&d末影水晶发电机&r", "", "&r连接并利用附近的强化末影水晶发电", "", "&4终极发电机", "&8⇨ &e⚡ &714336 J 缓存",
                                        "&8⇨ &e⚡ &70 ~ +∞ J/s");
                        ENDER_CRYSTAL_GENERATOR_BASE = new CustomItemStack(Material.END_STONE_BRICKS,
                                        "&b末影水晶发电机基座&r");
                        ENDER_CRYSTAL_GENERATOR_STABILIZER = new CustomItemStack(Material.OBSIDIAN,
                                        "&5末影水晶发电机稳定机&r", "", "&6高级机器", "&8⇨ &e⚡ &718 J/s");
                        ItemStack itemECE = new CustomItemStack(Material.POTION, "&9末影水晶强化药剂&r");
                        PotionMeta imECE = (PotionMeta) itemECE.getItemMeta();
                        imECE.clearCustomEffects();
                        imECE.setColor(Color.fromRGB(85, 0, 255));
                        itemECE.setItemMeta(imECE);
                        ENDER_CRYSTAL_ENHANCER = itemECE;

                        MODULAR_GENERATOR_REGULATOR = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGI4NzM2ZmY0MmJjNjhjMTFlZGU4ZDg3NGIxNTEyZDI5ZjJlOGM1ZjZmZWJlOGY1OGRmY2Q5YTBhNTFkNmRlZSJ9fX0="),
                                        "&b模块化发电机核心&r");

                        SOLID_STORAGE_EXPANSION = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjRmY2M5ODlmMDMzOTQ3YmYyYjc1NDE2ZDRjZTk0YTUxOGNmN2MyYmRiNTdjNDMyNDBlODdkN2FlMjY2MzI3OSJ9fX0="),
                                        "&f固体储存拓展&r");
                        LIQUID_STORAGE_EXPANSION = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZiY2QxODBiMWM4ZmM0Y2EzOWNmNDY3YzM0NWFlODNjYzE2YjYzY2IyNTU3MDM0NjAxMDNhM2VlYmE0NTcifX19"),
                                        "&f流体储存拓展&r");
                        COAL_GENERATOR = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="),
                                        "&c煤炭发电机 &7(扩容版)&r", "", "&6发电机组", "&8\u21E8 &e\u26A1 &764 J 缓存",
                                        "&8\u21E8 &e\u26A1 &716 J/s");
                        LAVA_GENERATOR = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="),
                                        "&4岩浆发电机 &7(扩容版)&r", "", "&6发电机组", "&8\u21E8 &e\u26A1 &7512 J 缓存",
                                        "&8\u21E8 &e\u26A1 &720 J/s");
                        COMBUSTION_REACTOR = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="),
                                        "&c燃烧反应器 &7(扩容版)&r", "", "&6高级发电机", "&8\u21E8 &e\u26A1 &7256 J 缓存",
                                        "&8\u21E8 &e\u26A1 &724 J/s");

                        ELECTRICITY_STORAGE_UNIT = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7ImlkIjoiODljMzVjZjNmZmZkNDAxMWJhMTM5MmJiYjE1MjM1NzYiLCJ0eXBlIjoiU0tJTiIsInVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzFhM2NkOWIwMTZiMTIyOGVjMDFmZDZmMDk5MmM2NGYzYjliN2IyOTc3M2ZhNDY0MzlhYjNmM2M4YTM0NzcwNCIsInByb2ZpbGVJZCI6IjYwNTc2YTMwMzYwYjRhYTBiYTRjNTczMGUyZDhhYTc0IiwidGV4dHVyZUlkIjoiMzFhM2NkOWIwMTZiMTIyOGVjMDFmZDZmMDk5MmM2NGYzYjliN2IyOTc3M2ZhNDY0MzlhYjNmM2M4YTM0NzcwNCJ9fSwic2tpbiI6eyJpZCI6Ijg5YzM1Y2YzZmZmZDQwMTFiYTEzOTJiYmIxNTIzNTc2IiwidHlwZSI6IlNLSU4iLCJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzMxYTNjZDliMDE2YjEyMjhlYzAxZmQ2ZjA5OTJjNjRmM2I5YjdiMjk3NzNmYTQ2NDM5YWIzZjNjOGEzNDc3MDQiLCJwcm9maWxlSWQiOiI2MDU3NmEzMDM2MGI0YWEwYmE0YzU3MzBlMmQ4YWE3NCIsInRleHR1cmVJZCI6IjMxYTNjZDliMDE2YjEyMjhlYzAxZmQ2ZjA5OTJjNjRmM2I5YjdiMjk3NzNmYTQ2NDM5YWIzZjNjOGEzNDc3MDQifSwiY2FwZSI6bnVsbH0="),
                                        "&f电力储存单元&r");
                        ADVANCED_BATTERY = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjRmMjFjZjVjMjM0ZmM5NmRiOTBhMGEzMTFkNmZiZTEyZjg3ODliN2ZhODE1NTcxNjc1N2ZkNTE2YjE4MTEifX19"),
                                        "&e高级电池&r");
                        ALPHA_BATTERY = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODUzYjRjYTdmZTlhOWUyOTlkMzc3ZWNlNGMwMzdlMWNkMDA5YTBiNTcyZDUzYzg0NjlmMGNlMGZmZTNiYThhMiJ9fX0="),
                                        "&aAlpha 电池&r");
                        BETA_BATTERY = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjIxNjcxN2YxZGE5NGY5OWJlODI0MmE5MzFlMzliYmYzMjI1MWRlZGY0NmNkMjA3M2ZmYTg4OTY5ZDc0Zjk2MyJ9fX0="),
                                        "&9Beta 电池&r");
                        GAMMA_BATTERY = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDgwZTJjMzNjNGM4MzI0NDUyYWNjZjkyMzU2NjllNjVmMDBkMTkyNmNjNTMzMTQ1MTkyNWNhMjZlNmFhNzIxIn19fQ=="),
                                        "&dGamma 电池&r");

                        BASIC_ELECTRICITY_STORAGE = new CustomItemStack(Material.YELLOW_STAINED_GLASS,
                                        "&e基础电力存储机&r", "", "&e基础电力存储机", "&8\u21E8 &e\u26A1 &7640 J 容量");
                        ADVANCED_ELECTRICITY_STORAGE = new CustomItemStack(Material.ORANGE_STAINED_GLASS,
                                        "&d高级电力存储机&r", "", "&6中型电力存储机", "&8\u21E8 &e\u26A1 &72560 J 容量");
                        ALPHA_ELECTRICITY_STORAGE = new CustomItemStack(Material.LIME_STAINED_GLASS,
                                        "&a&lAlpha&a-α 电力存储机&r", "", "&a大型电力存储机", "&8\u21E8 &e\u26A1 &75120 J 容量");
                        BETA_ELECTRICITY_STORAGE = new CustomItemStack(Material.BLUE_STAINED_GLASS,
                                        "&9&lBeta&9-β 电力存储机&r", "", "&2超级电力存储机", "&8\u21E8 &e\u26A1 &740960 J 容量");
                        GAMMA_ELECTRICITY_STORAGE = new CustomItemStack(Material.MAGENTA_STAINED_GLASS,
                                        "&5&lGamma&5-γ 电力存储机&r", "", "&4终极电力存储机", "&8\u21E8 &e\u26A1 &7327680 J 容量");
                        LAMBDA_ELECTRICITY_STORAGE = new CustomItemStack(Material.PINK_STAINED_GLASS,
                                        "&d&lLAMBDA&d-λ 电力存储机&r", "", "&f其实没必要搞这么大的电容了...吧......", "", "&4终极电力存储机",
                                        "&8\u21E8 &e\u26A1 &72621440 J 容量", "",
                                        Utils.db64s("Jjgmb+S9oOS7peS4uui/meWwseaYr+acgOWkp+WuuemHj+eahOeUteWuueS6huWQlz8="));

                        // Hidden Items (Encoded to prevent freely editing)
                        KAPA_ELECTRICITY_STORAGE = new CustomItemStack(Material.BLACK_STAINED_GLASS,
                                        Utils.db64s("JjAmbEtBUEEmMC3OuiAmMOeUteWKm+WtmOWCqOacuiZy"), "",
                                        Utils.db64s("JmPlvakmZeibiyZh54mpJmLlk4Emcg=="), "", "&4终极电力存储机",
                                        Utils.db64s("Jjjih6ggJmXimqEgJjcyMDk3MTUyMCBKIOWuuemHjw=="), "",
                                        Utils.db64s("Jjgmb0ZyZWV6ZV9Eb2xwaGluIOW5tuS4jeaJk+eul+atouatpeS6juatpC4uLg=="));
                        PHI_ELECTRICITY_STORAGE = new CustomItemStack(Material.WHITE_STAINED_GLASS, Utils
                                        .db64s("JmYmbFAmNyZsSCZmJmxJJjctJmbPhiAmN+eUtSZm5YqbJjflrZgmZuWCqCY35py6JnI="),
                                        "", Utils.db64s("JmPlvakmZeibiyZh54mpJmLlk4Emcg=="), "", "&4终极电力存储机",
                                        Utils.db64s("Jjjih6ggJmXimqEgJjcxNjc3NzIxNjAgSiDlrrnph48="), "",
                                        Utils.db64s("Jmbov5novrnlu7rorq7mg7PopoHlvZPmnI3pnLjnmoTlhYjmiorov5nlgqjnlLXmnLrlhYXmu6HnlLU="));

//                        MAGNESIUM_SALT = new CustomItemStack(Material.SUGAR, "&f镁盐&r");
//                        MAGNESIUM_GENERATOR = new CustomItemStack(Material.LIGHT_GRAY_TERRACOTTA,
//                                        "&f镁发电机&r", "", "&a中级发电机", "&8\u21E8 &e\u26A1 &7128 J 缓存",
//                                        "&8\u21E8 &e\u26A1 &736 J/s");

                        QUANTUM_SOLAR_GENERATOR = new CustomItemStack(new ItemStack(Material.DAYLIGHT_DETECTOR),
                                        "&d量子太阳能发电机&r",
                                "", "&9可在夜晚发电", "", "&4终极发电机", "&8⇨ &e⚡ &765536 J 缓存",
                                "&8⇨ &e⚡ &72048 J/s (白天)", "&8⇨ &e⚡ &71024 J/s (夜晚)");

                        ItemStack itemRCE = new ItemStack(Material.FIREWORK_STAR);
                        FireworkEffectMeta imRCE = ((FireworkEffectMeta) itemRCE.getItemMeta());
                        imRCE.setEffect(FireworkEffect.builder().with(FireworkEffect.Type.BURST)
                                        .withColor(Color.fromRGB(85, 0, 255)).build());
                        imRCE.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7远古符文 &8&l[&b&l终界&8&l]"));
                        itemRCE.setItemMeta(imRCE);
                        RUNE_COMPLEX_ENDER = itemRCE;

                        ENDER_LUMP_4 = new CustomItemStack(Material.GOLD_NUGGET, "&5末影结晶 &7- &eIV",
                                "", "&c品级: IV");

                        HEAVY_WATER_BUCKET = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTFlNWRhMGM1NmNmOWQ4OTNkOWJkM2I3Y2E0MGYwODFjMTFhMDAzZWZiNzc2MjQzNDYwYzJiYThiYTVjMzUyYSJ9fX0="),
                                        "&f桶装重水&r");
                        HEAVY_WATER_REFINING_MACHINE = new CustomItemStack(Material.GRAY_STAINED_GLASS,
                                        "&7重水提炼机&r", "", "&6高级机器", "&8⇨ &e⚡ &718 J/s");

                        ItemStack itemNM = new CustomItemStack(Material.POTION, "&9中子慢化剂&r");
                        PotionMeta imNM = (PotionMeta) itemNM.getItemMeta();
                        imNM.clearCustomEffects();
                        imNM.setColor(Color.BLACK);
                        itemNM.setItemMeta(imNM);
                        NEUTRON_MODERATOR = itemNM;

                        THERMAL_NEUTRON_REACTOR = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ=="),
                                        "&c热中子核能反应器&r",
                                "", "&r需要冷却!", "&8⇨ &b必须完全浸入水中", "&8⇨ &b必须配备热中子核能反应器冷却单元", "",
                                "&4终极发电机", "&8⇨ &e⚡ &716384 J 缓存", "&8⇨ &e⚡ &7896 J/s");
                        THERMAL_NEUTRON_REACTOR_COOLANT_CELL = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGM3NjBjNTc2YTA4OGNiMjljZWIyNmUzMTQzYjdmM2M0NDZjZDZlNWM1MGJmMzMxNTE2NjFjZTYzNmQwNTk3ZSJ9fX0="),
                                        "&c热中子核能反应器冷却单元&r");

                        RAINBOW_ALLOY = new CustomItemStack(SlimefunUtils.getCustomHead(
                                        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFmZTI3YTEzYzVmYzE3NTE1Y2FlNjk1ODUyNzE2MzI2YjJiNWRmNDdkOGQ2Yjk1YTc4OWFlMzhjYWM3YjEifX19"),
                                        "&d彩虹合金&r");

                        ItemStack itemRRG = new CustomItemStack(Material.MAGENTA_STAINED_GLASS,
                                        "&d强化彩虹玻璃&r", "", "&f能如彩虹一般随机改变颜色");
                        itemRRG.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
                        ItemMeta imRRG = itemRRG.getItemMeta();
                        imRRG.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                        itemRRG.setItemMeta(imRRG);
                        REINFORCED_RAINBOW_GLASS = itemRRG;

                        RAINBOW_REACTOR = new CustomItemStack(Material.PINK_STAINED_GLASS, "&d彩虹反应器&r",
                                        "", "&8⇨ &b必须建造完整的结构", "", "&4终极发电机", "&8⇨ &e⚡ &732768 J 缓存",
                                        "&8⇨ &e⚡ &71536 J/s", "&8⇨ &e⚡ &7所在世界处于雷暴天气时发电量翻 1.5倍");

                        GLASS_ELECTRICITY_TRANSMITTER = new CustomItemStack(Material.CYAN_STAINED_GLASS,
                                        "&2电力传递器&r", "", "&a玻璃电力传递器", "&8\u21E8 &e\u26A1 &716 J 容量");

                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

        public UGItems(UltimateGenerators plug) {
        }

}
