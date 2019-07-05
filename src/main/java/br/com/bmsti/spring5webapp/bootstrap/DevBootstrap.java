package br.com.bmsti.spring5webapp.bootstrap;

import br.com.bmsti.spring5webapp.model.Fruit;
import br.com.bmsti.spring5webapp.model.Vitamin;
import br.com.bmsti.spring5webapp.repositories.FruitRepository;
import br.com.bmsti.spring5webapp.repositories.VitaminRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
* @author angelo santos
* @version 1.0
* @since 04/07/2019
*/
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private FruitRepository fruitRepository;
    private VitaminRepository vitaminRepository;

    public DevBootstrap(FruitRepository fruitRepository, VitaminRepository vitaminRepository) {
        this.fruitRepository = fruitRepository;
        this.vitaminRepository = vitaminRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        //Abacaxi
        Fruit abacaxi = new Fruit("Abacaxi", "O abacaxi...");
        Vitamin a = new Vitamin("A", "A vitamina A...");
        abacaxi.getVitamins().add(a);
        a.getFruits().add(abacaxi);

        fruitRepository.save(abacaxi);
        vitaminRepository.save(a);

        //Laranja
        Fruit laranja = new Fruit("Laranja", "A laranja...");
        Vitamin c = new Vitamin("C", "A vitamina C...");
        laranja.getVitamins().add(c);
        c.getFruits().add(laranja);

        fruitRepository.save(laranja);
        vitaminRepository.save(c);

    }
}
