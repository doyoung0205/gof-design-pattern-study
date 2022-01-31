package me.doyoung.gof.flyweight.before;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private final Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            final String[] split = font.split(":");
            final Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
