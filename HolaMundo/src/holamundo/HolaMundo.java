/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;

/**
 *
 * @author OmarA
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo Java");
        Persona per1 = new Persona();
        per1.setNombre("Jesús HC");

        System.out.println("Nombre:" + per1.getNombre());
        per1.comer("Hamburguesa Hawaiiana");
        
        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        per2.comer("Pizza");
        System.out.println("Nombre per 2:" + per2.getNombre());
        
        Automovil miBocho = new Automovil();
        
        
        miBocho.setMarca("VW");
        System.out.println("Marca:" + miBocho.getMarca());

        miBocho.setSubMarca("Sedan");
        System.out.println("SubMarca:" + miBocho.getSubMarca());

        miBocho.setModelo(1970);
        System.out.println("Modelo" + miBocho.getModelo());

        miBocho.setColor(Color.blue);
        System.out.println("Color" + miBocho.getColor());

        
        Automovil miAkura = new Automovil();

        miAkura.setMarca("Akura");
        System.out.println("Marca:" + miAkura.getMarca());

        miAkura.setSubMarca("NSX");
        System.out.println("SubMarca:" + miAkura.getSubMarca());

        miAkura.setModelo(2013);
        System.out.println("Modelo" + miAkura.getModelo());

        miAkura.setColor(Color.gray);
        System.out.println("Color" + miAkura.getColor());

        
        Automovil miMustang = new Automovil();
        
        miMustang.setMarca("Ford");
        System.out.println("Marca:" + miMustang.getMarca());

        miMustang.setSubMarca("Mustan");
        System.out.println("SubMarca:" + miMustang.getSubMarca());

        miMustang.setModelo(2010);
        System.out.println("Modelo" + miMustang.getModelo());

        miMustang.setColor(Color.yellow);
        System.out.println("Color" + miMustang.getColor());

        
    }
    
}
