package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataProvider {
    public static final String DATA_SEPARATOR = ",";
    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    public List<Town> getTownsList() {
        List<Town> Town_list = new ArrayList<>();
        for(String elem : Data.baseTownsArray)
        {
            String townName = (elem.split(DATA_SEPARATOR))[0];
            List<String> heroClasses = new ArrayList<>();
            String hero_class1 = (elem.split(DATA_SEPARATOR))[1];
            hero_class1 = hero_class1.replaceAll(" ", "");
            String hero_class2 = (elem.split(DATA_SEPARATOR))[2];
            hero_class2 = hero_class2.replaceAll(" ", "");
            heroClasses.add(hero_class1);
            heroClasses.add(hero_class2);
            Town town = new Town(townName, heroClasses);
            Town_list.add(town);
        }
        return Town_list;
    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    public List<Town> getDLCTownsList()
    {
        List<Town> DLCTown_list = new ArrayList<>();
        for(String elem : Data.dlcTownsArray)
        {
            String townName = (elem.split(DATA_SEPARATOR))[0];
            List<String> heroClasses = new ArrayList<>();
            String hero_class1 = (elem.split(DATA_SEPARATOR))[1];
            hero_class1 = hero_class1.replaceAll(" ", "");
            String hero_class2 = (elem.split(DATA_SEPARATOR))[2];
            hero_class2 = hero_class2.replaceAll(" ", "");
            heroClasses.add(hero_class1);
            heroClasses.add(hero_class2);
            Town town = new Town(townName, heroClasses);
            DLCTown_list.add(town);
        }
        return DLCTown_list;
    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    public Set<Hero> getHeroesSet()
    {
        Set<Hero> herosSet = new HashSet<>();
        for(String elem : Data.baseCharactersArray)
        {
            String[] heroString = elem.split(DATA_SEPARATOR);
            Hero hero = new Hero(heroString[0], heroString[1].replaceAll(" ", ""));
            herosSet.add(hero);
        }
        return herosSet;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
    public Set<Hero> getDLCHeroesSet()
    {
        Set<Hero> DLCHerosSet = new HashSet<>();
        for(String elem : Data.dlcCharactersArray)
        {
            String[] heroString = elem.split(DATA_SEPARATOR);
            Hero hero = new Hero(heroString[0], heroString[1].replaceAll(" ", ""));
            DLCHerosSet.add(hero);
        }
        return DLCHerosSet;
    }
}
