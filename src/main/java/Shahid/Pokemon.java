package Shahid;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "POKEMON_TABLE")
public class Pokemon {

    @Id
    @Column(name = "Pokemon_Name")
    private String name;
    @Column(nullable = false)
    private String type;
    @Column
    private int power;
    @Column
    private int age;

    @Enumerated(EnumType.STRING)
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getType() + " " + this.getPower() + " " + this.getAge();
    }
}
