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

    public List<MemberDto> getAllMembers(String role) {
        return memberMapper.getAllMembers(role);
    }

    public List<MemberDto> getAllMembersView(String role) {
        return memberMapper.getAllMembersView(role);
    }

    public MemberDto getMemberById(int id) {
        return memberMapper.getMemberById(id);
    }

    public void insertMember(MemberDto memberDto) {
        memberMapper.insertMember(memberDto);
    }

    public void updateMember(MemberDto memberDto) {
        memberMapper.updateMember(memberDto);
    }

    public void deleteMember(int id) {
        memberMapper.deleteMember(id);
    }
}
