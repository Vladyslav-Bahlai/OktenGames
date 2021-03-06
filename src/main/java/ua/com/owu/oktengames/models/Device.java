package ua.com.owu.oktengames.models;

import lombok.*;
import ua.com.owu.oktengames.enums.Color;
import ua.com.owu.oktengames.enums.ConditionState;
import ua.com.owu.oktengames.enums.Platform;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String imgUrl;
    private double price;
    private int amount;

    @Enumerated(value = EnumType.STRING)
    private Platform platform;
    private String capacity;
    @Enumerated(value = EnumType.STRING)
    private Color color;
    @Enumerated(value = EnumType.STRING)
    private ConditionState conditionState;
    @ElementCollection
    private List<String> photosImgUrl = new ArrayList<>();
//    private List<Game> extraGames;
//    private List<Gamepad> gamepads;
}
