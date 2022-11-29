package com.sparta.hanghaememo.service;


import com.sparta.hanghaememo.dto.MemoRequestDto;
import com.sparta.hanghaememo.dto.MemoResponseDto;
import com.sparta.hanghaememo.entity.Memo;
import com.sparta.hanghaememo.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {

    private final MemoRepository memoRepository;  // 이렇게 사용하면 MemoRepository에 사용 가능

    @Transactional   // ?
    public Memo createMemo(MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto);
        memoRepository.save(memo);   //데이터베이스에 save 안에 memo를 넣어주어 자동으로 쿼리가 생성되면서
                                      // 저장이 된다.

        return memo;  //반환타입은 memo여서 그대로 반환
    }

    @Transactional(readOnly = true)
    public List<Memo> getMemos() {
        return memoRepository.findAllByOrderByModifiedAtDesc();  //내림차순으로 모든 정보를 가져온다.(메모장이기 때문에)
    }
//    오름차순(ASC)정렬
//      내림차순(DESC)정렬






    @Transactional
    public Long update(Long id, MemoRequestDto requestDto) {  //id를 가져와서
    //수정할 메모가 데이터에 있는지 확인하는 작업이 필요하다 , orElseThrow()로 예외처리를 해준다.
         Memo memo = memoRepository.findById(id).orElseThrow(
                 () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")  //오류가 발생하지 않으면

         );
         memo.update(requestDto);    //requestDto안에다가 update로 수정하겠다.
         return memo.getId();
    }

    @Transactional
    public Long deleteMemo(Long id) {
        memoRepository.deleteById(id);

        return id;
    }


    @Transactional(readOnly = true)
    public MemoResponseDto getMemo(Long id) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new RuntimeException("게시글을 찾을 수 없다.")
        );
        return new MemoResponseDto(memo);
    }
}
