/**
 *
 * @author Jorge Alonso, Ivan Contreras
 */

public abstract class ManejadorPeticionesDeCompra {

    private ManejadorPeticionesDeCompra siguienteManejador;
    private final String nombreManejador;

    public ManejadorPeticionesDeCompra(String nombre) {
        nombreManejador = nombre;
    }

    public String getNombre() {
        return nombreManejador;
    }

    public abstract String autorizar(PeticionDeCompra peticion);   
    

    public ManejadorPeticionesDeCompra getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(ManejadorPeticionesDeCompra manejador) {
        siguienteManejador = manejador;
    }
}
