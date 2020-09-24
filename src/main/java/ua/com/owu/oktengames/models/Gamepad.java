package ua.com.owu.oktengames.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    @ManyToMany(mappedBy = "gamepads", fetch = FetchType.LAZY)
    private List<Color> colors = new LinkedList<>();
}
