package blender;

import ingredients.GlassOfJuice;

public interface BlenderInterface {
    void addOranges();
    void addApples();
    void addCarrots();
    boolean canMakeJuice();
    GlassOfJuice makeJuice();
}
