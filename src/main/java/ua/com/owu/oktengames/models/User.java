package ua.com.owu.oktengames.models;

import lombok.*;
import ua.com.owu.oktengames.enums.Role;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String username;
    String password;
    double balance;
    Role role;
//    List<Product> shoppingCart; // TODO: create base class or interface Product to implement user's shop cart
//    List<Product> wishList;
}
