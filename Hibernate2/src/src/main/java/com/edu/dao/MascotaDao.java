package com.edu.dao;

import com.edu.entidades.Mascota;
import java.util.List;

import com.edu.aplicacion.JPAUtil;
import com.edu.entidades.Mascota;
import com.mycompany.hibernation2.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class MascotaDao {
EntityManager entityManager=JPAUtil.getEntityManagerFactory().createEntityManager();
    public String registrarMascotas(Mascota miMascota) {
    entityManager.getTransaction().begin();
    entityManager.persist(miMascota);
    entityManager.getTransaction().commit();

    String resp= "Mascota Resgistrada!";

    return resp;
    }
    public Mascota consultarMascota(Long idMascota) {
Mascota miMascota=entityManager.find(Mascota.class,idMascota);

if (miMascota!=null){
    return miMascota;
}else{
    return null;
}
    }

    public List<Mascota> consultarListaMascotas() {
    List<Mascota> listaMascotas= new ArrayList<Mascota>();
    Query query=entityManager.createQuery("SELECT m FROM Mascota m");
    listaMascota=query.getResultList();

    return listaMascotas;
    }

    public List<Mascota> consultarListaMascotasPorSexo(String sexo) {
        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        String sentencia="SELECT m FROM Mascota m WHERE m.sexo = :sexoMascota";
        Query query =entityManager.createQuery(sentencia);
        query.setParameter("sexoMascota",sexo);
        listaMascotas=query.getResultList();
        
        return listaMascotas;
    }

    public boolean actualizarMascota(Mascota miMascota) {
        entityManager.getTransaction().begin();
        entityManager.merge(miMascota);
        entityManager.getTransaction().commit();
        String respo ="Mascota Actualizada!";
        return resp;
    }
public String eliminarMascota(Mascota miMascota){
    entityManager.getTransaction().begin();
    entityManager.remove(miMascota);
    entityManager.getTransaction().commit();
    String resp="Mascota Eliminada!";
    
    return resp;
}
public void close(){
    entityManager.close();
    JPAUtil.shutdown();
}

    public boolean registrarMascota(Mascota miMascota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}