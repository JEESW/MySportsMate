package cube.mysportsmate.board.domain.entitiy;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "qna_comment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class QnaComment extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "comment_id")
    private Long id;

    @Column(name = "comment_parent_id")
    private Long commentParentId;

    @Column(name = "depth")
    private Long depth;

    @Column(name = "comment_content")
    private String commentContent;

    @Column(name = "regit")
    private String regit;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "qna_id")
    private Qna qna;

}
