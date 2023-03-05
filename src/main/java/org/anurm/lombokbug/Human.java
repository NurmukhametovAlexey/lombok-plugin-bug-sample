package org.anurm.lombokbug;

import lombok.Getter;
import lombok.Setter;

public class Human {

    @Setter
    @Getter
    String aName;

    public static void main(String[] args) {
        Human human = new Human();
        human.setAName("Name");
        System.out.println(human.getAName());
    }
}
