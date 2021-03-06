package com.mossle.user.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PersonInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "PERSON_INFO")
public class PersonInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String code;

    /** null. */
    private String username;

    /** null. */
    private String familyName;

    /** null. */
    private String givenName;

    /** null. */
    private String fullName;

    /** null. */
    private String cellphone;

    /** null. */
    private String telephone;

    /** null. */
    private String email;

    /** null. */
    private String im;

    /** null. */
    private String country;

    /** null. */
    private String province;

    /** null. */
    private String city;

    /** null. */
    private String building;

    /** null. */
    private String floor;

    /** null. */
    private String seat;

    /** null. */
    private String employeeNo;

    /** null. */
    private String employeeType;

    /** null. */
    private String card;

    /** null. */
    private String company;

    /** null. */
    private String department;

    /** null. */
    private String position;

    /** null. */
    private String gender;

    /** null. */
    private Date birthday;

    /** null. */
    private String idCardType;

    /** null. */
    private String idCardValue;

    /** null. */
    private String nationality;

    /** null. */
    private String star;

    /** null. */
    private String blood;

    /** null. */
    private String clothSize;

    public PersonInfo() {
    }

    public PersonInfo(String code, String username, String familyName,
            String givenName, String fullName, String cellphone,
            String telephone, String email, String im, String country,
            String province, String city, String building, String floor,
            String seat, String employeeNo, String employeeType, String card,
            String company, String department, String position, String gender,
            Date birthday, String idCardType, String idCardValue,
            String nationality, String star, String blood, String clothSize) {
        this.code = code;
        this.username = username;
        this.familyName = familyName;
        this.givenName = givenName;
        this.fullName = fullName;
        this.cellphone = cellphone;
        this.telephone = telephone;
        this.email = email;
        this.im = im;
        this.country = country;
        this.province = province;
        this.city = city;
        this.building = building;
        this.floor = floor;
        this.seat = seat;
        this.employeeNo = employeeNo;
        this.employeeType = employeeType;
        this.card = card;
        this.company = company;
        this.department = department;
        this.position = position;
        this.gender = gender;
        this.birthday = birthday;
        this.idCardType = idCardType;
        this.idCardValue = idCardValue;
        this.nationality = nationality;
        this.star = star;
        this.blood = blood;
        this.clothSize = clothSize;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "CODE", length = 200)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "USERNAME", length = 200)
    public String getUsername() {
        return this.username;
    }

    /**
     * @param username
     *            null.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /** @return null. */
    @Column(name = "FAMILY_NAME", length = 200)
    public String getFamilyName() {
        return this.familyName;
    }

    /**
     * @param familyName
     *            null.
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /** @return null. */
    @Column(name = "GIVEN_NAME", length = 200)
    public String getGivenName() {
        return this.givenName;
    }

    /**
     * @param givenName
     *            null.
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /** @return null. */
    @Column(name = "FULL_NAME", length = 200)
    public String getFullName() {
        return this.fullName;
    }

    /**
     * @param fullName
     *            null.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /** @return null. */
    @Column(name = "CELLPHONE", length = 50)
    public String getCellphone() {
        return this.cellphone;
    }

    /**
     * @param cellphone
     *            null.
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /** @return null. */
    @Column(name = "TELEPHONE", length = 200)
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * @param telephone
     *            null.
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /** @return null. */
    @Column(name = "EMAIL", length = 200)
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email
     *            null.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /** @return null. */
    @Column(name = "IM", length = 200)
    public String getIm() {
        return this.im;
    }

    /**
     * @param im
     *            null.
     */
    public void setIm(String im) {
        this.im = im;
    }

    /** @return null. */
    @Column(name = "COUNTRY", length = 200)
    public String getCountry() {
        return this.country;
    }

    /**
     * @param country
     *            null.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** @return null. */
    @Column(name = "PROVINCE", length = 200)
    public String getProvince() {
        return this.province;
    }

    /**
     * @param province
     *            null.
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /** @return null. */
    @Column(name = "CITY", length = 200)
    public String getCity() {
        return this.city;
    }

    /**
     * @param city
     *            null.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /** @return null. */
    @Column(name = "BUILDING", length = 200)
    public String getBuilding() {
        return this.building;
    }

    /**
     * @param building
     *            null.
     */
    public void setBuilding(String building) {
        this.building = building;
    }

    /** @return null. */
    @Column(name = "FLOOR", length = 200)
    public String getFloor() {
        return this.floor;
    }

    /**
     * @param floor
     *            null.
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /** @return null. */
    @Column(name = "SEAT", length = 200)
    public String getSeat() {
        return this.seat;
    }

    /**
     * @param seat
     *            null.
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /** @return null. */
    @Column(name = "EMPLOYEE_NO", length = 50)
    public String getEmployeeNo() {
        return this.employeeNo;
    }

    /**
     * @param employeeNo
     *            null.
     */
    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    /** @return null. */
    @Column(name = "EMPLOYEE_TYPE", length = 50)
    public String getEmployeeType() {
        return this.employeeType;
    }

    /**
     * @param employeeType
     *            null.
     */
    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    /** @return null. */
    @Column(name = "CARD", length = 200)
    public String getCard() {
        return this.card;
    }

    /**
     * @param card
     *            null.
     */
    public void setCard(String card) {
        this.card = card;
    }

    /** @return null. */
    @Column(name = "COMPANY", length = 200)
    public String getCompany() {
        return this.company;
    }

    /**
     * @param company
     *            null.
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /** @return null. */
    @Column(name = "DEPARTMENT", length = 200)
    public String getDepartment() {
        return this.department;
    }

    /**
     * @param department
     *            null.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /** @return null. */
    @Column(name = "POSITION", length = 200)
    public String getPosition() {
        return this.position;
    }

    /**
     * @param position
     *            null.
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** @return null. */
    @Column(name = "GENDER", length = 500)
    public String getGender() {
        return this.gender;
    }

    /**
     * @param gender
     *            null.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BIRTHDAY", length = 26)
    public Date getBirthday() {
        return this.birthday;
    }

    /**
     * @param birthday
     *            null.
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /** @return null. */
    @Column(name = "ID_CARD_TYPE", length = 50)
    public String getIdCardType() {
        return this.idCardType;
    }

    /**
     * @param idCardType
     *            null.
     */
    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    /** @return null. */
    @Column(name = "ID_CARD_VALUE", length = 50)
    public String getIdCardValue() {
        return this.idCardValue;
    }

    /**
     * @param idCardValue
     *            null.
     */
    public void setIdCardValue(String idCardValue) {
        this.idCardValue = idCardValue;
    }

    /** @return null. */
    @Column(name = "NATIONALITY", length = 200)
    public String getNationality() {
        return this.nationality;
    }

    /**
     * @param nationality
     *            null.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /** @return null. */
    @Column(name = "STAR", length = 50)
    public String getStar() {
        return this.star;
    }

    /**
     * @param star
     *            null.
     */
    public void setStar(String star) {
        this.star = star;
    }

    /** @return null. */
    @Column(name = "BLOOD", length = 50)
    public String getBlood() {
        return this.blood;
    }

    /**
     * @param blood
     *            null.
     */
    public void setBlood(String blood) {
        this.blood = blood;
    }

    /** @return null. */
    @Column(name = "CLOTH_SIZE", length = 50)
    public String getClothSize() {
        return this.clothSize;
    }

    /**
     * @param clothSize
     *            null.
     */
    public void setClothSize(String clothSize) {
        this.clothSize = clothSize;
    }
}
