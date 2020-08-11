package ua.com.owu.oktengames.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    // TODO: probably replace String type with some special Date or Time Java classes
    private String releaseDate;
    private String company;
    @ElementCollection
    private List<String> screenShotsImgUrl = new ArrayList<>();
    @ElementCollection
    private List<String> genres = new ArrayList<>();
    @ElementCollection
    // TODO: create OneToMany relation with devices or just put Platform enum value
    private List<Platform> platforms = new ArrayList<>();
    @OneToMany(mappedBy = "mainGame", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Game> additionalContent = new ArrayList<>();
    @ManyToOne
    @JsonBackReference
    private Game mainGame; // if our game is not DLC, this field must be null
    @ManyToOne(fetch = FetchType.LAZY)
    private Device device;
}
