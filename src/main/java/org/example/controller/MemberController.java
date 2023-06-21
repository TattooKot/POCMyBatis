package org.example.controller;
import org.example.model.Member;
import org.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable int id) {
        return memberService.getMemberById(id);
    }

    @PostMapping
    public void createMember(@RequestBody Member member) {
        memberService.insertMember(member);
    }

    @PutMapping("/{id}")
    public void updateMember(@PathVariable int id, @RequestBody Member member) {
        member.setMemberPId((long) id);
        memberService.updateMember(member);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable int id) {
        memberService.deleteMember(id);
    }
}
