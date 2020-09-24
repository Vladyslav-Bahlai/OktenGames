package ua.com.owu.oktengames.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Game extends GameBase {
    @ManyToMany(mappedBy = "games", fetch = FetchType.LAZY)
    private List<Genre> genres = new LinkedList<>();
    @ManyToMany(mappedBy = "games", fetch = FetchType.LAZY)
    private List<Platform> platforms = new LinkedList<>();
    @JsonManagedReference
    @OneToMany(mappedBy = "mainGame", cascade = CascadeType.ALL)
    private List<GameAddon> additionalContent = new ArrayList<>();
}
