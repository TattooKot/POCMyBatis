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

    /**

     Retrieves a list of members based on the specified role.
     @param role the role of the members to retrieve
     @return a list of MemberDto objects representing the members
     */
    @GetMapping("/{role}")
    public List<MemberDto> getAllMembers(@PathVariable String role) {
        return memberService.getAllMembers(role);
    }
    /**

     Retrieves a list of members for viewing purposes based on the specified role.
     @param role the role of the members to retrieve for viewing
     @return a list of MemberDto objects representing the members for viewing
     */
    @GetMapping("/view/{role}")
    public List<MemberDto> getAllMembersView(@PathVariable String role) {
        return memberService.getAllMembersView(role);
    }
    /**

     Creates a new member with the given details.
     @param memberDto the MemberDto object containing the details of the member to be created
     */
    @PostMapping
    public void createMember(@RequestBody MemberDto memberDto) {
        memberService.insertMember(memberDto);
    }
    /**

     Updates an existing member with the specified ID using the given details.
     @param id the ID of the member to update
     @param memberDto the MemberDto object containing the updated details of the member
     */
    @PutMapping("/{id}")
    public void updateMember(@PathVariable int id, @RequestBody MemberDto memberDto) {
        memberDto.setMemberPId((long) id);
        memberService.updateMember(memberDto);
    }
    /**

     Deletes the member with the specified ID.
     @param id the ID of the member to delete
     */
    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable int id) {
        memberService.deleteMember(id);
    }
}
