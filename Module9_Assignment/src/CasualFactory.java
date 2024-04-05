public class CasualFactory implements ClothesFactory{
    //functions for returning casual clothes
    @Override
    public Pants CreatePants() {
        return new CasualPantsClass();
    }

    @Override
    public Tops CreateTop() {
        return new CasualTopsClass();
    }

    @Override
    public Shoes CreateShoes() {
        return new CasualShoesClass();
    }
}
