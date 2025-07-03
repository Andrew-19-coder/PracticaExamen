/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import java.time.LocalDate;
/**
 *
 * @author itsth
 */
public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private String telefono;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona(int id, String nombre, int edad, LocalDate fechaNacimiento, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", Fecha de nacimiento=" + fechaNacimiento + ", telefono=" + telefono + '}';
    }
    
    
}
