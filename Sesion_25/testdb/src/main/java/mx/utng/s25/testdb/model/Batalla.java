package mx.utng.s25.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Batalla {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(length = 100, nullable = false)
    private String MaestroPokemon;

    @Column(length = 100, nullable = false)
    private String Stadium;
    
}
