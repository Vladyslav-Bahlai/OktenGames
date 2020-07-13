package ua.com.owu.oktengames.models;

import lombok.*;
import ua.com.owu.oktengames.enums.Color;
import ua.com.owu.oktengames.enums.Platform;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Gamepad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private double price;
    private int amount;
    private Color color;
    private Platform platform;
}
