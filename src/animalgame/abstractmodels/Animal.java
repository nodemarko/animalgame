package animalgame.abstractmodels;

public abstract class Animal {
    public String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void eat(Animal animal);

}
