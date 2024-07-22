package site.coduo.coduo;

import java.util.Random;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class TestApi {

    private final MemberRepository memberRepository;

    @GetMapping("/")
    public String index() {
        return "Hello World with kelly!!";
    }

    @GetMapping("/test")
    public String getTest() {
        return "집에 가고 싶은 켈리의 노래...";
    }

    @PostMapping("/test")
    public String save() {
        final int i = new Random().nextInt();
        final Member hi = new Member("hi" + i);

        System.out.println("이번 타자는... 바로!!!!!!!!");
        System.out.println();
        return memberRepository.save(hi).getName();
    }

    @DeleteMapping("/test/{id}")
    public String delete(@PathVariable("id") Long id) {
        memberRepository.deleteById(id);

        return id + " 데이터 제거 완료.";
    }

    @GetMapping("/secret")
    public String getSecret() {
        return "네가.. 여길 어떻게...?";
    }

    @GetMapping("/kelly")
    public String getKelly() {
        return "난.... '켈리'다.";
    }
}
