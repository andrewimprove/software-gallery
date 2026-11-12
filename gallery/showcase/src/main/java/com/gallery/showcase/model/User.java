package com.gallery.showcase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class User {
    
    @Id 
    private String id; 
    
    private String userName; 
    
    private String password; 
    
    private String email;
        
}
