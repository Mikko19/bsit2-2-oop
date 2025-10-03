public class Faculty extends User {
    private String department;
    private String position;
    public Faculty(String userId, String name, String email, String department, String position) {
        super(userId, name, email);
        this.department = department;
        this.position = position;
    }
    public String getDepartment() { return department; }
    public String getPosition() { return position; }
    @Override
    public int getMaxBorrowLimit() {
        return 10;
    }
}
