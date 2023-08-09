class Account {
    private String name = "a";
    private String no = "1";
    private long balance = 0;
    private Day openDate;

    public Account(String n, String num, long z, Day d) {
        name = n;
        no = num;
        balance = z;
        openDate = new Day(d);
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public long getBalance() {
        return balance;
    }

    public Day getOpenDate() {
        return new Day(openDate);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setOpenDate(Day openDate) {
        this.openDate = new Day(openDate);
    }

    public void set(String name, String no, long balance, Day openDay) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.openDate = new Day(openDay);
    }

    public String toString() {
        return String.format("口座名義：%s%n口座番号：%s%n預金残高：%d円%n開設日：%04d年%02d月%02d日", name, no, balance, openDate.getYear(),
                openDate.getMonth(), openDate.getDate());
    }
}