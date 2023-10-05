package ru.eugene.firstBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/birds")
public class BirdsController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @Value("${parrot-name:Zorro}")
    private String nameParrot;

    private final BirdInfo birdInfo;

    private final StrausInfo strausInfo;
    private Parrot charlyParrot;

    private Parrot charlyParrotOneElse;

    public BirdsController(
            @Qualifier("iAmParrotSecond") Parrot charlyParrot,
            Parrot charlyParrotOneElse,
            BirdInfo birdInfo,
            StrausInfo strausInfo
    ) {
        this.charlyParrot = charlyParrot;
        this.charlyParrotOneElse = charlyParrotOneElse;
        this.birdInfo = birdInfo;
        this.strausInfo = strausInfo;
        System.out.println("charlyParrot:" + charlyParrot.uuuu);
        System.out.println("nameParrot:" + nameParrot);
    }

    @PostMapping("/kafka/message")
    ResponseEntity<String> sendMessageToKafka(@RequestBody String message) {
        kafkaProducerService.sendMessage("newTopic", message);
        return new ResponseEntity<>("Message sent to Kafka", HttpStatus.OK);
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
    @GetMapping("/OneParrotElse")
    int getOneParrotElse(){
        return charlyParrot.uuuu;
    }
    @GetMapping("/straus")
    StrausInfo getAllStraus(){
        return strausInfo;
    }
}
