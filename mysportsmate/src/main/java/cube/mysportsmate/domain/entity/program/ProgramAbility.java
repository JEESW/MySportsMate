package cube.mysportsmate.domain.entity.program;

import cube.mysportsmate.domain.entity.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProgramAbility extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private Integer cardioScore;
    private Integer strengthScore;
    private Integer muscularScore;
    private Integer flexibilityScore;
    private Integer agilityScore;
    private Integer powerScore;
}
