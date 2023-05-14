package ingredients;

public class GlassOfJuice implements Fruit, Juice {
    private final int volume;
    private final int pulpVolume;
    private final String fruitType;

    public GlassOfJuice(int volume, int pulpVolume, String fruitType) {
        this.volume = volume;
        this.pulpVolume = pulpVolume;
        this.fruitType = fruitType;
    }

    @Override
    public String getFruitType() {
        return fruitType;
    }

    public int getPulpVolume() {
        return pulpVolume;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
