package cube.mysportsmate.program.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import cube.mysportsmate.region.domain.entity.Region;
import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.MediaSize;

@Entity
@Table(name = "program")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Program extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "program_id")
    private Long id;

    @Column(name = "program_name")
    private String programName;

    @Column(name = "program_location")
    private String programLocation;

    @Column(name = "program_class")
    private String programClass;

    @Column(name = "program_type")
    private String programType;

    @Column(name = "program_info")
    private String programInfo;

    @Column(name = "program_s_dt")
    private LocalDateTime programStartDate;

    @Column(name = "program_f_dt")
    private LocalDateTime programFinishDate;

    @Column(name = "program_cnt")
    private Integer programCount;

    @Column(name = "repeat_type")
    private String repeatType;

    @Column(name = "repeat_day_of_week")
    private String repeatDayOfWeek;

    @Column(name = "max_capacity")
    private Integer maxCapacity;

    @Column(name = "teacher_name")
    private String teacherName;

    @Column(name = "teacher_license")
    private String teacherLicense;

    @Column(name = "teacher_career")
    private String teacherCareer;

    @Column(name = "regit")
    private String regit;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    @OneToOne(mappedBy = "program", fetch = FetchType.LAZY)
    private ProgramAbility programAbility;

}
