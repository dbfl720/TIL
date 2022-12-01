

package com.sparta.hanghaememo.service;


        import com.sparta.hanghaememo.dto.MemoRequestDto;
        import com.sparta.hanghaememo.dto.MemoResponseDto;
        import com.sparta.hanghaememo.entity.Memo;
        import com.sparta.hanghaememo.repository.MemoRepository;
        import lombok.RequiredArgsConstructor;
        import org.springframework.http.HttpStatus;
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
    public MemoResponseDto update(Long id, MemoRequestDto requestDto) {  //id를 가져와서
        //수정할 메모가 데이터에 있는지 확인하는 작업이 필요하다 , orElseThrow()로 예외처리를 해준다.

        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")  //오류가 발생하지 않으면

        );

        System.out.println(requestDto.getPassword());
        System.out.println(memo.getPassword());
        if (memo.getPassword().equals(requestDto.getPassword())) {
            memo.update(requestDto);
            MemoResponseDto memoResponseDto = new MemoResponseDto(memo);
            return memoResponseDto;
              // command + b 설명
//            return new MemoResponseDto ("비밀번호가 일치합니다.", HttpStatus.OK.value());
        } else {

            return new MemoResponseDto("비밀번호가 일치하지 않습니다.", HttpStatus.UNAUTHORIZED.value());

        }

    }
//@Transactional은 클래스나 메서드에 붙여줄 경우, 해당 범위 내 메서드가 트랜잭션이 되도록 보장해준다.
//
//선언적 트랜잭션이라고도 하는데, 직접 객체를 만들 필요 없이 선언만으로도 관리를 용이하게 해주기 때문.
//
//특히나 SpringBoot에서는 선언적 트랜잭션에 필요한 여러 설정이 이미 되어있는 탓에, 더 쉽게 사용할 수 있다.


        @Transactional
        public MemoResponseDto deleteMemo (Long id,String password) {
            Memo memo = memoRepository.findById(id).orElseThrow(
                    () -> new IllegalArgumentException("게시글을 찾을 수 없다.")
            );

//            MemoResponseDto memoResponseDto = new MemoResponseDto(memo);
            System.out.println("memo password= " + memo.getPassword());
            System.out.println("password = " + password);
            if(memo.getPassword().equals(password))

            {
                memoRepository.deleteById(id);
//                return memoResponseDto;

                return new MemoResponseDto("게시글 삭제 성공", HttpStatus.OK.value());
//                return "성공";
            } else {

//                return "실패";
//                return memoResponseDto;
                return new MemoResponseDto("비밀번호가 일치하지 않습니다.", HttpStatus.UNAUTHORIZED.value());
            }
        }






        @Transactional(readOnly = true)
        public MemoResponseDto getMemo (Long id){
            Memo memo = memoRepository.findById(id).orElseThrow(
                    () -> new RuntimeException("게시글을 찾을 수 없다.")
            );
            return new MemoResponseDto(memo);
        }
    }

