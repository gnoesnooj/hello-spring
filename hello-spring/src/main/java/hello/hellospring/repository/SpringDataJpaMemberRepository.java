package hello.hellospring.repository;
import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    Optional<Member> findByName(String name);
} // springdatajpamemberrepository 보고 스프링이 알아서 구현체를 만든다.. ㄷㄷ