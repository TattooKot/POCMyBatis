package org.example.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Member {
    @Id
    @Column(name = "MEMBER_PID")
    private Long memberPId;

    @Column(name = "MEMBER_ID")
    private String memberId;

    @Column(name = "MEMBER_ID_UPPER")
    private String memberIdUpper;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "FIRST_NAME_UPPER")
    private String firstNameUpper;

    @Column(name = "LAST_NAME_UPPER")
    private String lastNameUpper;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column
    private String suffix;

    @Column(name = "TIMEZONE_CODE")
    private String timeZoneCode;


    @Column(name = "CARD_ID")
    private String cardId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "GENDER", referencedColumnName = "GENDER_ID")
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_CODE")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRIM_LANG_CODE")
    private Language language;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_PID")
    private List<Enrollment> enrollments;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_PID")
    private List<Address> addresses;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_PID")
    private List<MemberAlert> alerts;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_PID")
    private List<Email> emails;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEM_PID")
    private List<MemberAlternateId> alternateIds;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_PID")
    private List<Phone> phones;

}
