package dev.group1.Potlukk.entities;

import dev.group1.Potlukk.utilities.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class item {
    private String name;
    private String supplier;
    private Status status;
    private int potlukkID;
}
