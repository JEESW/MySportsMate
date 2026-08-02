package cube.mysportsmate.board.repository;

import cube.mysportsmate.board.domain.dto.NoticeSearchListRequest;
import cube.mysportsmate.board.domain.entitiy.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoticeRepository extends JpaRepository<Notice, Long> {

    List<Notice> findAll();

    Optional<Notice> findById(Long id);





}
