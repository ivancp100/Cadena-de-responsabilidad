
/**
 *
 * @author Jorge Alonso, Ivan Contreras
 */

public class VicePresidente extends ManejadorPeticionesDeCompra {

    static double LIMITE = 200000;

    public VicePresidente(String nombre) {
        super(nombre);
    }

    @Override
    public String autorizar(PeticionDeCompra peticion) {
        double monto = peticion.getMonto();

        if (monto <= LIMITE) {
        	return "La Vicepresidente " + getNombre()
                    + " ha autorizado la P.C. - " + peticion;
            
        } else {
            return getSiguienteManejador().autorizar(peticion);
        }
    }

}
