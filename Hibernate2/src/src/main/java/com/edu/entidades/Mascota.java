
package com.edu.entidades;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="mascotas")//Se indica ya que el nombre de la clase es diferente al nombre de la tab
public class Mascota implements Serializable{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)//el id de la mascota es autoincrementabl
@Column(name = "id_mascota")//indicamos el nombre de campo al que la variable hace referenci
private Long idMascota;
@Column(nullable = false, length = 45)//el nombre no puede ser null en BD, así como el tamañ
private String nombre;
@Column(length = 45)//solo indicamos el tamaño ya que corresponde la variable al nombre del
private String raza;
@Column(name = "color", length = 45)//indicamos el nombre de campo al que la variable hace r
private String colorMascota;
@Column(length = 45)
private String sexo;

public Mascota () {
    
}
public Mascota(String nombre,String raza,String colorMascota,String sexo){
    super();
    this.nombre= nombre;
    this.raza = raza;
    this.colorMascota = colorMascota;
    this.sexo = sexo;
}
public long getIdMascota(){
    return idMascota;
}
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public String getRaza() {
return raza;
}
public void setRaza(String raza) {
this.raza = raza;
}
public String getColorMascota() {
return colorMascota;
}
public void setColorMascota(String colorMascota) {
this.colorMascota = colorMascota;
}
public String getSexo() {
return sexo;
}
public void setSexo(String sexo) {
this.sexo = sexo;
}
@Override
public String toString(){
  return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ","
+ " raza=" + raza + ", colorMascota="
+ colorMascota + ", sexo=" + sexo + "]";
}

    public void setIdMascota(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}