package ua.com.owu.oktengames.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public abstract class GameBase extends Product {
    private String description;
    // TODO: probably replace String type with some special Date or Time Java classes
    private String releaseDate;
    private String company;
}
