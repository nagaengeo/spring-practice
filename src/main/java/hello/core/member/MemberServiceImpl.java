package hello.core.member;

public class MemberServiceImpl implements MemberService {
    // 설계상 문제점: 인터페이스뿐만 아니라 구현체(MemoryMemberRepository)에도 의존하고 있음 (DIP 위반)
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}