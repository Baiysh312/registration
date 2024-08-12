public class User {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void registerUser(String username, String password){
        char[] nameArray= username.toCharArray();
        int count = 0;
        for (char us: nameArray) {
            if(us==' '){
                count++;
            }
        }
        try {
            if(count==0&&username!=null){
                setUserName(username);
                System.out.println("name user is true");
            }else throw new IllegalArgumentException();

        }catch (IllegalArgumentException err){
            System.out.println("name user not null and ne doljen soderjat probel");
        }

        char[] passWord= password.toCharArray();
        try {
            if(passWord.length>=8){
                setPassword(password);
                System.out.println("password is true");
                System.out.println("avtorizacia proshla udachno");
            }else throw new IllegalArgumentException();
        }catch (IllegalArgumentException err){
            System.out.println("password doljen soderjat ne menshe 8 simvolov");
        }
    }
}