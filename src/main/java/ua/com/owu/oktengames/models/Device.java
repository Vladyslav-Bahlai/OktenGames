package ua.com.owu.oktengames.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import ua.com.owu.oktengames.enums.Color;
import ua.com.owu.oktengames.enums.ConditionState;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"gamepads"})
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String imgUrl;
    private double price;
    private int amount;

//    @Enumerated(value = EnumType.STRING)
//    private Platform platform;
    private String capacity;
    @Enumerated(value = EnumType.STRING)
    private Color color;
    @Enumerated(value = EnumType.STRING)
    private ConditionState conditionState;
    @ElementCollection
    private List<String> photosImgUrl = new ArrayList<>();
    // АЛО БЛЯТЬ!!!! Я думаю нам цей список вже нахуй не всрався, бо я зробив клас Platform
//    @JsonIgnore
//    @OneToMany(mappedBy = "device", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    private List<Game> extraGames = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "device", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Gamepad> gamepads = new ArrayList<>();
}
