package com.ohgiraffers.z_activity.mission.model;

public class LibraryMember {
    private String membershipId;
    private String name;

    public LibraryMember(String membershipId, String name) {
        this.membershipId = membershipId;
        this.name = name;
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

    @Override
    public String toString() {
        return "LibraryMember{" +
                "name='" + name + '\'' +
                ", membershipId='" + membershipId + '\'' +
                '}';
    }
}
