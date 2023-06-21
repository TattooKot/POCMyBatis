package org.example.service;

import org.example.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.example.model.dto.MemberDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    /**

     Retrieves a list of members based on the specified role.
     @param role the role of the members to retrieve
     @return a list of MemberDto objects representing the members
     */
    public List<MemberDto> getAllMembers(String role) {
        return memberMapper.getAllMembers(role);
    }
    /**

     Retrieves a list of members for viewing purposes based on the specified role.
     @param role the role of the members to retrieve for viewing
     @return a list of MemberDto objects representing the members for viewing
     */
    public List<MemberDto> getAllMembersView(String role) {
        return memberMapper.getAllMembersView(role);
    }
    /**

     Retrieves the member with the specified ID.
     @param id the ID of the member to retrieve
     @return the MemberDto object representing the member
     */
    public MemberDto getMemberById(int id) {
        return memberMapper.getMemberById(id);
    }
    /**

     Inserts a new member with the given details.
     @param memberDto the MemberDto object containing the details of the member to be inserted
     */
    public void insertMember(MemberDto memberDto) {
        memberMapper.insertMember(memberDto);
    }
    /**

     Updates an existing member with the specified details.
     @param memberDto the MemberDto object containing the updated details of the member
     */
    public void updateMember(MemberDto memberDto) {
        memberMapper.updateMember(memberDto);
    }
    /**

     Deletes the member with the specified ID.
     @param id the ID of the member to delete
     */
    public void deleteMember(int id) {
        memberMapper.deleteMember(id);
    }
}
