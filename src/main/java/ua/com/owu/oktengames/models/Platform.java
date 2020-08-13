package ua.com.owu.oktengames.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"games"})
public class Platform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Game> games = new LinkedList<>();
}
