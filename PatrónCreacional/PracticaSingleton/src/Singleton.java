import java.util.ArrayList;
import java.util.List;

public class Singleton {
    private static Singleton instance;
    private List<String> ciudades;

    private Singleton(){
        ciudades = new ArrayList<>();
        ciudades.add("Cali");
        ciudades.add("Bogotá");
    }

    public static synchronized Singleton getIntance(){
        if(instance == null){
            instance =  new Singleton();
        }
        return instance;
    } 

    public List<String> getCiudades(){
        return ciudades;
    }
}
