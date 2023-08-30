package ru.eugene.firstBootApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/birds")
public class BirdsController {

    @Value("${parrot-name:Zorro}")
    private String nameParrot;

    private final BirdInfo birdInfo;

    private final StrausInfo strausInfo;
    private Parrot charlyParrot;

    public BirdsController(
            //@Qualifier("iAmParrotSecond") Parrot charlyParrot
            Parrot charlyParrot,
            BirdInfo birdInfo,
            StrausInfo strausInfo
    ) {
        this.charlyParrot = charlyParrot;
        this.birdInfo = birdInfo;
        this.strausInfo = strausInfo;
        System.out.println("charlyParrot:" + charlyParrot.uuuu);
        System.out.println("nameParrot:" + nameParrot);
    }

    @GetMapping("/parrot")
    String getBird(){
        return nameParrot;
    }
    @GetMapping("/another")
    String getAnother(){
        return birdInfo.getBirdName();
    }
    @GetMapping("/allbird")
    BirdInfo getAllBird(){
        return birdInfo;
    }
    @GetMapping("/straus")
    StrausInfo getAllStraus(){
        return strausInfo;
    }
}
