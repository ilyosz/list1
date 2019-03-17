public class User {
    private int cash;
    private String Fname;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    @Override
    public String toString() {
        return "User{" +
                "cash=" + cash +
                ", Fname='" + Fname + '\'' +
                ", id=" + id +
                '}';
    }
}
