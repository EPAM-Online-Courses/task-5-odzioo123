package efs.task.collections.entity;

import java.util.Objects;

public class Hero {
    private String name;
    private String heroClass;

    public Hero(String name, String heroClass) {
        this.name = name;
        this.heroClass = heroClass;
    }

    public String getName() {
        return name;
    }

    public String getHeroClass() {
        return heroClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hero hero)) return false;
        return getName().equals(hero.getName()) && getHeroClass().equals(hero.getHeroClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHeroClass());
    }

    @Override
    public String toString() {
        return "My name is " + name + "and I am " + heroClass;
    }
}
