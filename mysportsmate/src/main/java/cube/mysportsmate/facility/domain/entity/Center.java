package cube.mysportsmate.facility.domain.entity;

import cube.mysportsmate.region.domain.entity.Region;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "center")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Center {

    @Id @GeneratedValue
    @Column(name = "center_id")
    private Long id;

    @Column(name = "center_name")
    private String centerName;

    @Column(name = "center_tel")
    private String centerTel;

    @Column(name = "center_mail")
    private String centerMail;

    @Column(name = "center_info")
    private String centerInfo;

    // center : facility -> 1 : N
    @OneToMany(mappedBy = "center")
    private List<Facility> facilities = new ArrayList<>();


    // center : region -> 1 : 1
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;
}
