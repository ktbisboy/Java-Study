package com.ohgiraffers.mission;

public class MemberManager {
    private LibraryMember[] members;

    public MemberManager(LibraryMember[] members) {
        this.members = members;
    }

    public String printMembers() {
        String result = "";
        for (LibraryMember member : members) {
            result += "회원: " + member.getName() + ", ID: " + member.getMembershipId() + ", 대출 한도: " + member.getBorrowLimit() + "; ";
        }

        return result;
    }
}
