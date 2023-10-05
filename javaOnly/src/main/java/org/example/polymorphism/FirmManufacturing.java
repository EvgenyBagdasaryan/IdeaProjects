package org.example.polymorphism;

import java.util.List;

public class FirmManufacturing {

    public void createAllSweets(){
        List<BaseTypeSweet> allSweets = List.of(
                new CandySweet(),
                new CookySweet(),
                new LolipopSweet(),
                () -> System.out.println("Anonim is ready!)))"),
                new CandySweet(){
                    @Override
                    public void createSomeSwetty() {
                        System.out.println("SomethingSweet is ready!)))");
                    }
                },
                new AbstractSweet(){
                    @Override
                    public void createSomeSwetty() {
                        System.out.println("AbstractSweetAdvanced is ready!)))");
                    }
                }
        );

        allSweets.forEach(BaseTypeSweet::createSomeSwetty);
    }
}
