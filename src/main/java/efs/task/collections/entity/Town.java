package efs.task.collections.entity;

import java.util.List;
import java.util.Objects;

public class Town implements Comparable<Town> {
    private String townName;
    private List<String> startingHeroClasses;

    public Town(String townName, List<String> startingHeroesClass) {
        this.townName = townName;
        startingHeroClasses = startingHeroesClass;
    }

    public String getTownName() {
        return townName;
    }

    public List<String> getStartingHeroClasses() {
        return startingHeroClasses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Town town)) return false;
        return getTownName().equals(town.getTownName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTownName());
    }

    public int compareTo(Town other) {
        return this.townName.compareTo(other.townName);
    }
    @Override
    public String toString() {
        return "Miasto :" + townName;
    }
}
