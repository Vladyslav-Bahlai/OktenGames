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
@EqualsAndHashCode
@ToString
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String title;
    private int amount;
    private double price;
    private double score;
    private String titleImgUrl;
    @ElementCollection
    private List<String> screenShotsImgUrl = new ArrayList<>();
}
