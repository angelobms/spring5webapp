package br.com.bmsti.spring5webapp.repositories;

import br.com.bmsti.spring5webapp.model.Vitamin;
import org.springframework.data.repository.CrudRepository;

/**
 * @author angelo santos
 * @version 1.0
 * @since 02/07/2019
 */
public interface VitaminRepository extends CrudRepository<Vitamin, Long> {
}
