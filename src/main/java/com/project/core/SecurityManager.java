package com.project.core;

public class SecurityManager {
    private static Role currentRole = Role.ADMIN;

    public static boolean userCan(Role required, Permission domain) {
        return currentRole.ordinal() >= required.ordinal();
    }
}
