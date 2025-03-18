package com.ohgiraffers.mission;

public class LibraryMember {
    private String name;
    private String membershipId;

    public LibraryMember(String name, String membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public int getBorrowLimit() {
        return 3;
    }
}
