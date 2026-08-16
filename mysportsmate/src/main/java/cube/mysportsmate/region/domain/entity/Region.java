package cube.mysportsmate.region.domain.entity;

import cube.mysportsmate.facility.domain.entity.Center;
import cube.mysportsmate.program.domain.entity.Program;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "region")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Region {

    @Id @GeneratedValue
    @Column(name = "region_id")
    private Long id;

    @Column(name = "region_cd")
    private String regionCd;

    @Column(name = "parent_region_cd")
    private String parentRegionCd;

    @Column(name = "region_name")
    private String regionName;

    @Column(name = "full_region_name")
    private String fullRegionName;

    @Column(name = "region_level")
    private Integer regionLevel;

    @Column(name = "road_address")
    private String roadAddress;

    // center : region -> 1 : 1
    @OneToOne(mappedBy = "region", fetch = FetchType.LAZY)
    private Center center;

    // program : region -> 1 : 1
    @OneToOne(mappedBy = "region", fetch = FetchType.LAZY)
    private Program program;


}
