package com.kodilla.patterns.factory.builder.bigmack;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final String bun;
    private final String burgers;
    private final String sauce;
    private final List<String> ingredients;

    public Bigmac(final String bun, final String burgers, final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {

        private String bun;
        private String burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(String burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredients(String ingredients){
            this.ingredients.add(ingredients);
            return this;
        }
        public Bigmac build(){
            return new Bigmac(bun,burgers,sauce,ingredients);
        }

    }

    public String getBun() {
        return bun;
    }

    public String getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac: " +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
