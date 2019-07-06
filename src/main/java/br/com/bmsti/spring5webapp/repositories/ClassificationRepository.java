package br.com.bmsti.spring5webapp.repositories;

import br.com.bmsti.spring5webapp.model.Classification;
import org.springframework.data.repository.CrudRepository;

/**
 * @author angelo santos
 * @version 1.0
 * @since 05/07/2019
 */
public interface ClassificationRepository extends CrudRepository<Classification, Long> {
}
