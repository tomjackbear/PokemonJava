package com.tomlavalord.pokemon;

public enum Element {
    WATER("💧"),FIRE("🔥"),GRASS("🍃"),POISON("☠"),FIGHTING("✊"),
    PSYCHIC("👁"),DRAGON("🐉"),GHOST("👻"),GROUND("⛰"),ROCK("💎"),
    ICE("❄"),NORMAL("✶"),BUG("🐛"),ELECTRIC("⚡"),FLYING("☁");

    private final String icon;
    Element(String icon){
        this.icon = icon;
    }
    public String toString(){
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
    public String iconToString(){
        return icon;
    }
}
