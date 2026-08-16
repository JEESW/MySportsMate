package cube.mysportsmate.board.domain.entitiy;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notice")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Notice extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "notice_id")
    private Long id;

    @Column(name = "notice_title")
    private String noticeTitle;

    @Column(name = "notice_content")
    private String noticeContent;

    @Column(name = "regit")
    private String regit;

    @Column(name = "is_deleted")
    private boolean isDeleted;

}
