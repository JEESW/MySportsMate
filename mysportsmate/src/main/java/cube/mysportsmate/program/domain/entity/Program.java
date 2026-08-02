package cube.mysportsmate.program.domain.entity;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Program extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    private String programName;
    private String programLocation;
    private String programClass;
    private String programType;
    private String programInfo;

    private LocalDateTime programStartDate;
    private LocalDateTime programFinishDate;
    private Integer programCount;
    private String repeatType;
    private String repeatDayOfWeek;
    private Integer maxCapacity;
    private String teacherName;
    private String teacherLicense;
    private String teacherCareer;
    private String regit;




}
