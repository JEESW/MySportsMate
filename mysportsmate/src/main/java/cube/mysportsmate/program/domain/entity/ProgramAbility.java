package cube.mysportsmate.program.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.MediaSize;

@Entity
@Table(name = "program_ability")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ProgramAbility extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "ability_id")
    private Long id;

    @Column(name = "cardio_score")
    private Integer cardioScore;

    @Column(name = "strength_score")
    private Integer strengthScore;

    @Column(name = "muscular_score")
    private Integer muscularScore;

    @Column(name = "flexibility_score")
    private Integer flexibilityScore;

    @Column(name = "agility_score")
    private Integer agilityScore;

    @Column(name = "power_score")
    private Integer powerScore;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_id")
    private Program program;
}
