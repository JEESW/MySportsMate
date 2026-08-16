package cube.mysportsmate.facility.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "facility")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Facility extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "facility_id")
    private Long facilityId;

    @Column(name = "facility_name")
    private String facilityName;

    @Column(name = "facility_info")
    private String facilityInfo;

    @Column(name = "facility_type")
    private String facilityType;

    @Column(name = "max_capacity")
    private Integer maxCapacity;

    // facility : facilityCost -> 1:N
    @OneToMany(mappedBy = "facility")
    private List<FacilityCost> facilityCosts = new ArrayList<>();

    // facility : facilityReview -> 1 : N
    @OneToMany(mappedBy = "facility")
    private List<FacilityReview> facilityReviews = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "center_id")
    private Center center;

}
