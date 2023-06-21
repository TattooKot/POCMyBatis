package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Member;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<Member> getAllMembers();

    Member getMemberById(int id);

    void insertMember(Member member);

    void updateMember(Member member);

    void deleteMember(int id);
}

