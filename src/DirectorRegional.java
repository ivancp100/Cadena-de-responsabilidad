
/**
 *
 * @author Jorge Alonso, Ivan Contreras
 */


public class DirectorRegional extends ManejadorPeticionesDeCompra {

    static double LIMITE = 100000;

    public DirectorRegional(String nombre) {
        super(nombre);
    }

    @Override
    public String autorizar(PeticionDeCompra peticion) {
        double monto = peticion.getMonto();

        if (monto <= LIMITE) {
            return " El director regional " + getNombre()
                    + " ha autorizado la petición de compra - "
                    + peticion;
            
        } else {
            return getSiguienteManejador().autorizar(peticion);
        }
    }

}
