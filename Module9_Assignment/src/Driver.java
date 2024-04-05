import java.util.Scanner;
//main method
public class Driver {
    private static Application configureApplication() {
        //initializes variables and the scanner method
        Application app;
        ClothesFactory factory;
        Scanner scn = new Scanner(System.in);
        String printName = scn.nextLine();
        //control flow for wether if the attire is casual, party or professional

        if (printName.contains("Casual")) {
            factory = new CasualFactory();
            app = new Application(factory);
            return app;
        } else if (printName.contains("Party")) {
            factory = new PartyFactory();
            app = new Application(factory);
            return app;
        } else if (printName.contains("Professional")) {
            factory = new ProfessionalFactory();
            app = new Application(factory);
            return app;

        } else {
            System.out.println("Please input whetehr you want a Casual, Party, or Professional outift.");
            return configureApplication();


        }
    }
    //configures the application based on the driver class and runs the code
    public static void main(String[] args) {
        System.out.println("Which Outfit would you like?");
        Application app = configureApplication();
        app.revealContent();
    }
}
