public class ProfessionalFactory implements ClothesFactory{
    //override functions that return new professional attire using Clothes Factory
    @Override
    public Pants CreatePants() {
        return new ProfessionalPantsClass();
    }

    @Override
    public Tops CreateTop() {
        return new ProfessionalTop();
    }

    @Override
    public Shoes CreateShoes() {
        return new ProfessionalShoesClass();
    }
}
