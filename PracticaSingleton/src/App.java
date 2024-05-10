import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getIntance();
        List<String> ciudadesColombia = singleton.getCiudades();

        for(String ciudad : ciudadesColombia){
            System.out.println(ciudad);
        }
    }
}
