public class PartyFactory implements ClothesFactory{
    //override functions to return new party clothes
    @Override
    public Pants CreatePants() {
        return new PartyPantsClass();
    }

    @Override
    public Tops CreateTop() {
        return new PartyTopsClass();
    }

    @Override
    public Shoes CreateShoes() {
        return new PartyShoesClass();
    }
}
