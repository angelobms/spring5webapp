package br.com.bmsti.spring5webapp.bootstrap;

import br.com.bmsti.spring5webapp.model.Classification;
import br.com.bmsti.spring5webapp.model.Fruit;
import br.com.bmsti.spring5webapp.model.Vitamin;
import br.com.bmsti.spring5webapp.repositories.ClassificationRepository;
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
    private ClassificationRepository classificationRepository;

    public DevBootstrap(FruitRepository fruitRepository, VitaminRepository vitaminRepository, ClassificationRepository classificationRepository) {
        this.fruitRepository = fruitRepository;
        this.vitaminRepository = vitaminRepository;
        this.classificationRepository = classificationRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Classification scPineapple = new Classification("Plantae", "Magnoliophyta", "Liliopsida", "Commelinidae", "Poales", "Bromeliaceae", "Bromelioideae", "Ananas");
        classificationRepository.save(scPineapple);

        //Pineapple
        Fruit pineapple = new Fruit("Pineapple", "Pineapple is a fruit typical of tropical and subtropical countries, so it does not adapt in cold climate regions.", scPineapple);
        Vitamin a = new Vitamin("A", "Vitamin A belongs to the group of fat-soluble vitamins and can be found in two sources.");
        pineapple.getVitamins().add(a);
        a.getFruits().add(pineapple);

        fruitRepository.save(pineapple);
        vitaminRepository.save(a);

        Classification scOrange = new Classification("Plantae", "Magnoliophyta", "Magnoliopsida", "", "Sapindales", "Rutaceae", "", "Citrus");
        classificationRepository.save(scOrange);

        //Orange
        Fruit orange = new Fruit("Orange", "AOrange is a citrus fruit with a flavor ranging from sweet to slightly sour.", scOrange);
        Vitamin c = new Vitamin("C", "AVitamin C is a water soluble vitamin, ie it is soluble in water. It improves the immune system, skin, mood and avoids ophthalmic problems and strokes.");
        orange.getVitamins().add(c);
        c.getFruits().add(orange);

        fruitRepository.save(orange);
        vitaminRepository.save(c);

    }
}
