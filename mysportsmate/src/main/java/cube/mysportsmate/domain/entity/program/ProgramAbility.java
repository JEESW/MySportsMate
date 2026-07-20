package cube.mysportsmate.domain.entity.program;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ProgramAbility {

    @Id @GeneratedValue
    private Long id;

    private Integer cardioScore;
    private Integer strengthScore;
    private Integer muscularScore;
    private Integer flexibilityScore;
    private Integer agilityScore;
    private Integer powerScore;
}
