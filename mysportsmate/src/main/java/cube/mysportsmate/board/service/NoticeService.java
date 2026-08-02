package cube.mysportsmate.board.service;

import cube.mysportsmate.board.domain.dto.NoticeSearchListRequest;
import cube.mysportsmate.board.domain.entitiy.Notice;
import cube.mysportsmate.board.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public List<NoticeSearchListRequest> findAll() {
        return noticeRepository.findAll()
                .stream()
                .map(NoticeSearchListRequest::from)
                .toList();
    }

    public Notice findNotice(Long id) {
        return noticeRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("예외 발생!!!!!"));
    }






}
