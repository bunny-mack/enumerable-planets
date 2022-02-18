package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY ("Mercury", 88, 0),
    VENUS ("Venus", 225, 0),
    EARTH ("Earth", 365, 1),
    MARS ("Mars", 687, 2),
    JUPITER ("Jupiter", 4333, 79),
    SATURN ("Saturn", 10759, 82),
    URANUS ("Uranus", 30687, 27),
    NEPTUNE ("Neptune", 60200, 14);

    private final String displayName;
    private final Integer yearLength;
    private final Integer moons;

    Planets(String displayName, Integer yearLength, Integer moons){
        this.displayName = displayName;
        this.yearLength = yearLength;
        this.moons = moons;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Integer getYearLength() {
        return yearLength;
    }

    public Integer getMoons() {
        return moons;
    }
}
