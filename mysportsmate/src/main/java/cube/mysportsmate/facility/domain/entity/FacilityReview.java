package cube.mysportsmate.facility.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Entity
@Table(name = "facility_review")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class FacilityReview extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    @Column(name = "review_content")
    private String reviewContent;

    @Column(name = "review_rating")
    private Integer reviewRating;

    @Column(name = "regit")
    private String regit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facility_id")
    private Facility facility;


}
