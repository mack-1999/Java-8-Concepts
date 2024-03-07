public class JobRolesFactory {
    //! Factory class which will create a new Object as per user inputs.
    public static JobRoles getRole(String roleType){
        if(roleType.trim().equalsIgnoreCase("Manager")){
            return new Manager();
        }
        else if(roleType.trim().equalsIgnoreCase("Software Engineer")){
            return new SoftwareEngineer();
        }else{
            return null;
        }
    }
}
