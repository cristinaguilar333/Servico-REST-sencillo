
import wsAutos.Autos;
import wsAutos.service.AutosFacadeREST;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutosFacadeREST afr = new AutosFacadeREST();
        Autos a = afr.find(2);
        System.out.println(a.getIdAutos());
        
//        Autos a= new Autos(5);
//        a.setMarca("ford");
//        a.setModelo("2009");
//        a.setNombre("lord");
//        
//        afr.create(a);
    }
    
}
