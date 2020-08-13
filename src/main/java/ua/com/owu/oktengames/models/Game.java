package ua.com.owu.oktengames.models;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String title;
    private int amount;
    private double price;
    private double score;
    private String imgUrl;
    private String description;
    // TODO: probably replace String type with some special Date or Time Java classes
    private String releaseDate;
    private String company;
    @ElementCollection
    private List<String> screenShotsImgUrl = new ArrayList<>();
    @ElementCollection
    private List<String> genres = new ArrayList<>();
    @ManyToMany(mappedBy = "games", fetch = FetchType.LAZY)
    private List<Platform> platforms = new LinkedList<>();
    @OneToMany(mappedBy = "mainGame", cascade = CascadeType.ALL)
    private List<GameAddon> additionalContent = new ArrayList<>();
    @ManyToOne(fetch = FetchType.LAZY)
    private Device device;
}
