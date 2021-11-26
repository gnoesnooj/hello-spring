package hello.hellospring;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;

    // @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    } // Spring data jpa가 인터페이스를 보고 구현체를 만들어 놓은게 여기로 주입이 되어서 등록된다..

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}
