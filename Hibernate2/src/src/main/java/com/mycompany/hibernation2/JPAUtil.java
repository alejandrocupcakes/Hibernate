package com.mycompany.hibernation2;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    private static final String UNIDAD_DE_PERSISTENCIA="PruebaHibernate";
private static EntityManagerFactory factory;
public static EntityManagerFactory getEntityManagerFactory (){
if (factory==null) {
factory=Persistence.createEntityManagerFactory(UNIDAD_DE_PERSISTENCIA);
}
return factory;
}
{
if (factory!=null) {
factory.close();
}
}
}
