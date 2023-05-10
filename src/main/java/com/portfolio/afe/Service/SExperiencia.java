/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.afe.Service;

import com.portfolio.afe.Entity.Experiencia;
import com.portfolio.afe.Repository.RExperiencia;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import javax.persistence.metamodel.SingularAttribute;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list(){
    return rExperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne (int id){
    return rExperiencia.findById(id);
    
    }
     public Optional<Experiencia> getByNombre (String nombreE){
    return rExperiencia.findByNombreE(nombreE);
    }
     
     public void save (Experiencia exp){
     rExperiencia.save(exp);
     
     }
     
     public void delete (int id){
     rExperiencia.deleteById(id);
     
     }
     
     public boolean existsById(int id){
     return rExperiencia.existsById(id);
     }
     
     public boolean existsNombreE(String nombreE){
     return rExperiencia.existsByNombreE(nombreE);
     }

    public boolean existsByNombreE(String nombreE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getByNombreE(String nombreE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getOne(SingularAttribute<AbstractPersistable, Serializable> id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}