package cube.mysportsmate.facility.domain.entity;

import cube.mysportsmate.reservation.domain.entity.Reservation;
import cube.mysportsmate.user.domain.entity.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "facility_cost")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class FacilityCost {

    @Id @GeneratedValue
    @Column(name = "cost_id")
    private Long costId;

    @Column(name = "cost")
    private int cost;

    @Column(name = "cost_type")
    private String costType;

    @Column(name = "cost_info")
    private String costInfo;

    @OneToMany(mappedBy = "reservation")
    List<Reservation> reservations = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facility_id")
    private Facility facility;
}
