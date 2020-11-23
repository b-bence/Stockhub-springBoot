package com.codecool.stockhub.model;

public enum ApplicationUserPermission {

    ADMIN_READ("admin:read");

    private String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
