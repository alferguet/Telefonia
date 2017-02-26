import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 * Created by al342052 on 21/02/2017.
 */
public class Particular extends Cliente {

    private String apellidos;

    public Particular(String nombre, String nif, Direccion dir, LocalDateTime fecha, Tarifa tarifa, String apellidos, LinkedList<Llamada> listall) {
        super(nombre, nif, dir, fecha, tarifa);
        this.apellidos=apellidos;
    }
}
