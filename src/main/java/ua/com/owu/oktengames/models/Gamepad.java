package ua.com.owu.oktengames.models;

import lombok.*;
import ua.com.owu.oktengames.enums.Color;

import javax.persistence.*;

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
//    private Platform platform;
    @ManyToOne(fetch = FetchType.LAZY)
    private Device device;
}
