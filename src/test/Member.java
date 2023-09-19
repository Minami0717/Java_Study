package test;

public class Member {
    public static void main(String[] args) {
        Member member = new Member(12345, "abcde", "서울특별시", "s@s.com");
        member.result();
    }
    private int id;
    private String pw;
    private String address;
    private String email;

    Member(int id, String pw, String address, String email) {
        this.id = id;
        this.pw = pw;
        this.address = address;
        this.email = email;
    }

    public void result() {
        System.out.println("학생 정보");
        System.out.println("---------------");
        System.out.println("ID: " + getId());
        System.out.println("PW: " + getPw());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
