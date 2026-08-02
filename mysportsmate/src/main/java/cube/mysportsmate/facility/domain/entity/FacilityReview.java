package cube.mysportsmate.facility.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class FacilityReview extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private String reviewContent;
    private Integer reviewRating;
    private String regit;

}
