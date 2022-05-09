package dev.group1.Potlukk.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Potlukk {
    private int id;
    private String name;
    private int epochTime;
    private int hostID;
    private String location;
}
