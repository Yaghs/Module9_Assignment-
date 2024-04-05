public class Application {
    //private fields for pants,Tops,Shoes
    private Pants pairOfPants ;
    private Tops Top;
    private Shoes pairOfShoes;
    //Application function with the argument of Factory
    //initializes variables with the Clothes Factoryclass
    public Application(ClothesFactory factory) {
        pairOfPants = factory.CreatePants();
        Top = factory.CreateTop();
        pairOfShoes = factory.CreateShoes();
    }
    //reveals the type pants, tops and shoes
    public void revealContent(){
        pairOfPants.pants();
        Top.tops();
        pairOfShoes.shoes();
    }
}
