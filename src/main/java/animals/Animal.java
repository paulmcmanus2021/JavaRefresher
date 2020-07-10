package animals;

import foods.Food;

public abstract class Animal {

    //Abstract fields

    private String name;
    private String voice;
    private String diet;
    private int hungerLevel;

    //Constructor

    public Animal(String name, String voice, String diet, int hungerLevel) {
        this.name = name;
        this.voice = voice;
        this.diet = diet;
        this. hungerLevel = hungerLevel;
    }

    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
}
