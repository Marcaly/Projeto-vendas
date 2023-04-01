package org.example.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;

import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;

    private String cpf;


    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private Set<Pedido> pedidos;

}
