/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package versionamiento;

/**
 *
 * @author nelita
 */
public class Versionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea un objento de los datos personales
        DatosPersonales persona1 = new DatosPersonales();
                //Ingreso los datos con los Setter a la nueva instancia de datos personales
                persona1.setNombre("Marianela");
                persona1.setApellido("Gonzaga");
                persona1.setCedula("1104679541");
                persona1.setMail("mgonzaga@utpl.edu.ec");
                persona1.setDireccion("Miraflores bajo");
                persona1.setTelefono("0986740629");
                persona1.setFecha_nac("23 de Junio de 1992");
                persona1.setEdad(21);

                //Para obtener los datos uso los Getter
                System.out.println(persona1.getNombre());
                System.out.println(persona1.getApellido());
                System.out.println(persona1.getCedula());
                System.out.println(persona1.getMail());
                System.out.println(persona1.getDireccion());
                System.out.println(persona1.getTelefono());
                System.out.println(persona1.getFecha_nac());
                System.out.println(persona1.getEdad());
    }
    
}
