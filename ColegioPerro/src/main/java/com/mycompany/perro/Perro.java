/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.mycompany.perro;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author Santiago Velasquez, Mario Dorado y Jeimmy Naranjo
 */
@DatabaseTable(tableName = "perros")
public class Perro {
     //Atributos
    @DatabaseField(canBeNull = false)
    private String Nombre;
    @DatabaseField(canBeNull = false)
    private String Raza;
    @DatabaseField(canBeNull = false)
    private String Localidad;
    @DatabaseField(id = true)
    private int Ceduladueño;
    @DatabaseField(canBeNull = false)
    private String NombreDueño;
    @DatabaseField(canBeNull = false)
    private int telefono;
    @DatabaseField(canBeNull = false)
    private String DiaAsistencia;
    
    //constructor

    public Perro(String Nombre, String Raza, String Localidad, int Ceduladueño, String NombreDueño, int telefono, String DiaAsistencia) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Localidad = Localidad;
        this.Ceduladueño = Ceduladueño;
        this.NombreDueño = NombreDueño;
        this.telefono = telefono;
        this.DiaAsistencia = DiaAsistencia;
    }
    
    public Perro(){
    
    }

    Perro(String nombrePerro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public int getCeduladueño() {
        return Ceduladueño;
    }

    public void setCeduladueño(int Ceduladueño) {
        this.Ceduladueño = Ceduladueño;
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDiaAsistencia() {
        return DiaAsistencia;
    }

    public void setDiaAsistencia(String DiaAsistencia) {
        this.DiaAsistencia = DiaAsistencia;
    }
    
}
