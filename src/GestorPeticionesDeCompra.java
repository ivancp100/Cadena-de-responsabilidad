/**
 *
 * @author Jorge Alonso, Ivan Contreras
 */

import edu.udistrital.inout.Salida;


public class GestorPeticionesDeCompra {

    private GerenteSucursal gerenteSucursal;
    private DirectorRegional directorRegional;
    private VicePresidente vicepresidente;
    private PresidenteOperaciones coo;

    public static void main(String[] args) {
    	
    	Salida salida =  new Salida();
    	
    	
        GestorPeticionesDeCompra gestor = new GestorPeticionesDeCompra();
        gestor.crearFlujoDeAutorizacion();       
        

        PeticionDeCompra peticion = new PeticionDeCompra(1, "Elementos de oficina", 10000);
        salida.mostrar(gestor.gerenteSucursal.autorizar(peticion) + "\n");

        peticion = new PeticionDeCompra(2, "Hardware", 175000);
        salida.mostrar(gestor.gerenteSucursal.autorizar(peticion) + "\n");

        peticion = new PeticionDeCompra(3, "Campaña de Publicidad", 800000);
        salida.mostrar(gestor.gerenteSucursal.autorizar(peticion) + "\n");

    }

    public void crearFlujoDeAutorizacion() {
        gerenteSucursal = new GerenteSucursal("Roberto");
        directorRegional = new DirectorRegional("Oscar");
        vicepresidente = new VicePresidente("Alicia");
        coo = new PresidenteOperaciones("Jose");

        gerenteSucursal.setSiguienteManejador(directorRegional);
        directorRegional.setSiguienteManejador(vicepresidente);
        vicepresidente.setSiguienteManejador(coo);
    }

}

