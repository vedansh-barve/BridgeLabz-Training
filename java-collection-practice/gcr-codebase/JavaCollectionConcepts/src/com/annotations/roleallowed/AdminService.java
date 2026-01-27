package com.annotations.roleallowed;

@RoleAllowed("ADMIN")
public class AdminService {
	public void performAdminTask() {
        System.out.println("Admin task executed successfully.");
    }
}
