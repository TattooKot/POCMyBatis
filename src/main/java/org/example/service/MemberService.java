package org.example.service;

import org.example.mapper.MemberMapper;
import org.example.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    public List<Member> getAllMembers() {
        return memberMapper.getAllMembers();
    }

    public Member getMemberById(int id) {
        return memberMapper.getMemberById(id);
    }

    public void insertMember(Member member) {
        memberMapper.insertMember(member);
    }

    public void updateMember(Member member) {
        memberMapper.updateMember(member);
    }

    public void deleteMember(int id) {
        memberMapper.deleteMember(id);
    }
}
