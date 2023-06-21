package org.example.model.dto;

import lombok.Data;

@Data
public class MemberDto {
    private Long memberPId;
    private String memberId;
    private String memberIdUpper;
    private String firstName;
    private String firstNameUpper;
    private String lastNameUpper;
    private String middleName;
    private String lastName;
    private String suffix;
    private String timeZoneCode;
    private String cardId;
    private Long genderId;
    private String genderName;
    private Long clientCode;
    private String clientName;
    private Long langId;
    private String langName;
}
