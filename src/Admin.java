
public class Admin extends Person {
    public String AdminUser;

    public Admin(String AdminUser, String AdminPass, String FirstName, String LastName) {
        this.AdminUser = AdminUser;
        this.AdminPass = AdminPass;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getAdminUser() {
        return AdminUser;
    }

    public void setAdminUser(String AdminUser) {
        this.AdminUser = AdminUser;
    }

    public String getAdminPass() {
        return AdminPass;
    }

    public void setAdminPass(String AdminPass) {
        this.AdminPass = AdminPass;
    }
    public String AdminPass;
}
