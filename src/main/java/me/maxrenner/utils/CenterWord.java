package me.maxrenner.utils;

import java.awt.*;

public class CenterWord {
    public static void drawCenteredWord(Graphics2D g, String word, Font font, Color color, int x, int y, int screenWidth, int screenHeight){
        g.setColor(color);
        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics(font);
        g.drawString(word, x+screenWidth/2 - (metrics.stringWidth(word)/2),y+(screenHeight/2 + metrics.getAscent()/2));
    }

    public static void drawCenteredWordHorizontal(Graphics2D g, String word, Font font, Color color, int x, int y, int screenWidth){
        g.setColor(color);
        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics(font);
        g.drawString(word, x+screenWidth/2 - (metrics.stringWidth(word)/2),y);
    }
}
