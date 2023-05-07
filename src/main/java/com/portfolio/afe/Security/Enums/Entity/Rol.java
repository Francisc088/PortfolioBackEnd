
package com.portfolio.afe.Security.Enums.Entity;

import com.portfolio.afe.Security.Enums.RolNombre;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre RolNombre;
    
    
    //Constructor

    public Rol() {
    }

    public Rol(RolNombre RolNombre) {
        this.RolNombre = RolNombre;
    }
    
    //getter y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return RolNombre;
    }

    public void setRolNombre(RolNombre RolNombre) {
        this.RolNombre = RolNombre;
    }
    
    
}
