package ua.com.owu.oktengames.models;

import lombok.*;
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
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int amount;
    private double price;
    private double score;
    private String imgUrl;
    private String description;
    private String releaseDate; // TODO: probably replace String type with some special Date or Time Java classes
    private String company;
    @ElementCollection
    private List<String> screenShotsImgUrl = new ArrayList<>();
    @ElementCollection
    private List<String> genres = new ArrayList<>();
    @ElementCollection
    private List<Platform> platforms = new ArrayList<>(); // TODO: create OneToMany relation with devices or just put Platform enum value
//    private List<Game> additionalContent = new ArrayList<>();
}
