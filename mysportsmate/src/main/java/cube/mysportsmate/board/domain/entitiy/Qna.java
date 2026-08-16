package cube.mysportsmate.board.domain.entitiy;

import cube.mysportsmate.common.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "qna")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Qna extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "qna_id")
    private Long id;

    @Column(name = "qna_title")
    private String qnaTitle;

    @Column(name = "qna_content")
    private String qnaContent;

    @Column(name = "regit")
    private String regit;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @OneToMany(mappedBy = "qna")
    private List<QnaComment> qnaComments = new ArrayList<>();


}
