package com.character.perso;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersoApplicationController {

    @RequestMapping
    public String helloWorld() {
        return "Hello world";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye";
    }

    @RequestMapping("/list")
    public List<Character> getCharacter() {
        List<Character> list = new ArrayList<>();
        Character Perso1 = new Character(1, "Charly", Type.Magicien, 10);
        Character Perso2 = new Character(2, "Cedric", Type.Guerrier, 25);
        list.add(Perso1);
        list.add((Perso2));
        return list;
    }

}
