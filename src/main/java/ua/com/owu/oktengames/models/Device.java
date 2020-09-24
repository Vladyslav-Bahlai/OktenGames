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
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String imgUrl;
    private double price;
    private int amount;
    private int gamepads;
//    @Enumerated(value = EnumType.STRING)
//    private Platform platform;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<ConditionState> conditionStates = new LinkedList<>();
    @ElementCollection
    private List<String> photosImgUrl = new ArrayList<>();
    // АЛО БЛЯТЬ!!!! Я думаю нам цей список вже нахуй не всрався, бо я зробив клас Platform
//    @JsonIgnore
//    @OneToMany(mappedBy = "device", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    private List<Game> extraGames = new ArrayList<>();
//    @JsonIgnore
//    @OneToMany(mappedBy = "device", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    private List<Gamepad> gamepads = new ArrayList<>();

}
