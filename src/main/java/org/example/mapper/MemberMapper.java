package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.dto.MemberDto;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<MemberDto> getAllMembers(String role);

    List<MemberDto> getAllMembersView(String role);

    MemberDto getMemberById(int id);

    void insertMember(MemberDto memberDto);

    void updateMember(MemberDto memberDto);

    void deleteMember(int id);
}

