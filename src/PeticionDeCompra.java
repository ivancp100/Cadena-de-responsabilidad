
/**
 *
 * @author Jorge Alonso, Ivan Contreras
 */

public class PeticionDeCompra {

    private final int ID;
    private final String descripcion;
    private final double monto;

    public PeticionDeCompra(int id, String desc, double mt) {
        ID = id;
        descripcion = desc;
        monto = mt;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return ID + ":" + descripcion;
    }

}
