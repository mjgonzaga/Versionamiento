/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package versionamiento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
//                System.out.println(persona1.getNombre());
//                System.out.println(persona1.getApellido());
//                System.out.println(persona1.getCedula());
//                System.out.println(persona1.getMail());
//                System.out.println(persona1.getDireccion());
//                System.out.println(persona1.getTelefono());
//                System.out.println(persona1.getFecha_nac());
//                System.out.println(persona1.getEdad());
                
                // CREACION DEL ARCHIVO TXT E INGRESO DE DATOS
                try {
                    //Creacion del archivo en una ruta especifica
                    File outFile = new File("C:\\Users\\nelita\\Desktop\\archivo.txt");
                    
                    BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
                    //Ingreso de datos especificos al archivo
                    writer.write("*********************DATOS PERSONALES********************");
                    writer.newLine(); 
                    writer.write("NOMBRE: "+persona1.getNombre());
                    writer.newLine(); 
                    writer.write("APELLIDO: "+persona1.getNombre());
                    writer.newLine(); 
                    writer.write("CEDULA: "+persona1.getCedula());
                    writer.newLine(); 
                    writer.write("MAIL: "+persona1.getMail());
                    writer.newLine(); 
                    writer.write("DIRECCION: "+persona1.getDireccion());
                    writer.newLine(); 
                    writer.write("TELEFONO: "+persona1.getTelefono());
                    writer.newLine(); 
                    writer.write("FECHA DE NACIMIENTO: "+persona1.getFecha_nac());
                    writer.newLine(); 
                    writer.write("EDAD: "+persona1.getEdad());
                    writer.newLine(); // Esto es un salto de linea
                    writer.close();
                } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
                }
                
                
    }
    
}
