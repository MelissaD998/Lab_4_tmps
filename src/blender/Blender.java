package blender;


import ingredients.GlassOfJuice;

public class Blender implements BlenderInterface {
    private int oranges;
    private int apples;
    private int carrots;

    @Override
    public void addOranges() { oranges++;}

    @Override
    public void addApples() {
        apples++;
    }

    @Override
    public void addCarrots() {
        carrots++;
    }

    @Override
    public boolean canMakeJuice() {
        return oranges > 0 && apples > 0 && carrots > 0;
    }

    @Override
    public GlassOfJuice makeJuice() {
        if (!canMakeJuice()) {
            throw new IllegalStateException("Can't make juice without sufficient fruits.");
        }
        oranges -= 1;
        apples -= 1;
        carrots -= 1;
        return new GlassOfJuice(200, 50, "Orange, Apple, Carrot");

    }
}
