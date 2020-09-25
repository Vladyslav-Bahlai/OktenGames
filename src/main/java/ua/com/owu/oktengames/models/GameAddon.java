package ua.com.owu.oktengames.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import ua.com.owu.oktengames.servicesImpl.GameAddonService;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(exclude = "mainGame")
public class GameAddon extends GameBase {
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Game mainGame;
}
