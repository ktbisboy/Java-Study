package com.ohgiraffers.mission;

public class Application {
    public static void main(String[] args) {
        LibraryMember[] members = new LibraryMember[] {
                new LibraryMember("Alice", "LM001"),
                new StudentMember("Bob", "LM002"),
        };

        MemberManager memberManager = new MemberManager(members);
        System.out.println(memberManager.printMembers());
    }
}
