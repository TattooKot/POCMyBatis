package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.dto.MemberDto;

import java.util.List;

/**

 The MemberMapper interface provides methods for accessing and manipulating member data.

 It is used for mapping member-related operations between the application and the underlying data source.
 */
@Mapper
public interface MemberMapper {

    /**

     Retrieves a list of members based on the specified role.
     @param role the role of the members to retrieve
     @return a list of MemberDto objects representing the members
     */
    List<MemberDto> getAllMembers(String role);
    /**

     Retrieves a list of members by calling sql view based on the specified role.
     @param role the role of the members to retrieve for viewing
     @return a list of MemberDto objects representing the members
     */
    List<MemberDto> getAllMembersView(String role);
    /**

     Retrieves the member with the specified ID.
     @param id the ID of the member to retrieve
     @return the MemberDto object representing the member
     */
    MemberDto getMemberById(int id);
    /**

     Inserts a new member with the given details.
     @param memberDto the MemberDto object containing the details of the member to be inserted
     */
    void insertMember(MemberDto memberDto);
    /**

     Updates an existing member with the specified details.
     @param memberDto the MemberDto object containing the updated details of the member
     */
    void updateMember(MemberDto memberDto);
    /**

     Deletes the member with the specified ID.
     @param id the ID of the member to delete
     */
    void deleteMember(int id);
}
