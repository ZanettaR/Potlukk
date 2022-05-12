package dev.group1.Potlukk.entities;

import dev.group1.Potlukk.utilities.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int id;
    @Column(name = "description")
    private String name;
    @Column(name = "supplier")
    private String supplier;
    @Column(name = "status")
    private Status status;
    @Column(name = "pid")
    private int potlukkID;
}
