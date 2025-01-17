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

    @GetMapping("/elmo")
    public String getElmo() {
        return "난.... '엘모' 입니다... 켈리가 아니야....";
    }

    @GetMapping("/hack")
    public String getHack() {
        return "당신.. '해킹' 당한거야...";
    }

    @GetMapping("/spring")
    public String getSpring() {
        return "언젠가.. 봄이 온다면...";
    }

    @GetMapping("/wooteco")
    public String getWooteco() {
        return "이곳은.. 신성한 우테코다!";
    }

    @GetMapping("/redy")
    public String getRedy() {
        return "레디가 만들어 달라고 해서 만든 API";
    }

    @GetMapping("/sun")
    public String getSun() {
        return "당신인가요... 나의 태양...?";
    }

    @GetMapping("/secret-key")
    public String getKey() {
        return "용서해라 켈리... 이것이.. 나의 마지막 '키'다!";
    }

    @GetMapping("/a")
    public String a() {
        return "우린.. 열정의 A!";
    }

    @GetMapping("/b")
    public String b() {
        return "우린.. 냉정의 b!";
    }
}
