package org.example.controller;
import org.example.model.dto.MemberDto;
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

    @GetMapping("/{role}")
    public List<MemberDto> getAllMembers(@PathVariable String role) {
        return memberService.getAllMembers(role);
    }

    @PostMapping
    public void createMember(@RequestBody MemberDto memberDto) {
        memberService.insertMember(memberDto);
    }

    @PutMapping("/{id}")
    public void updateMember(@PathVariable int id, @RequestBody MemberDto memberDto) {
        memberDto.setMemberPId((long) id);
        memberService.updateMember(memberDto);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable int id) {
        memberService.deleteMember(id);
    }
}
