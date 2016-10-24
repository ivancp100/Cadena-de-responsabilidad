
/**
 *
 * @author Jorge Alonso, Ivan Contreras
 */

public class PresidenteOperaciones extends ManejadorPeticionesDeCompra {

    static double LIMITE = 400000;

    public PresidenteOperaciones(String nombre) {
        super(nombre);
    }

    @Override
    public String autorizar(PeticionDeCompra peticion) {
        double monto = peticion.getMonto();

        if (monto <= LIMITE) {
        	return " El presidente & COO " + getNombre()
                    + " ha autorizado la petición de compra - " + peticion;
            
        } else {
        	return "P.C. - " + peticion
                    + " no pudo ser autorizada, la Mesa Directiva necesita "
                    + "ser consultada para la aprobación.\n"
                    + "Razón: Monto demasiado grande";   
        }
    }

}
