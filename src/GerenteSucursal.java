/**
 *
 * @author Jorge Alonso, Ivan Contreras
 */

public class GerenteSucursal extends ManejadorPeticionesDeCompra {

    static double LIMIT = 25000;

    public GerenteSucursal(String nombre) {
        super(nombre);
    }

    @Override
    public String autorizar(PeticionDeCompra peticion) {
        double monto = peticion.getMonto();

        if (monto <= LIMIT) {
            return "El Gerente de sucursal " + getNombre()
                    + " ha autorizado la P.C. - " + peticion;            
        } else {
            return getSiguienteManejador().autorizar(peticion);
        }
    }

}
