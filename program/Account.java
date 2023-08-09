class Account {
    private String name = "a";
    private String no = "1";
    private long balance = 0;
    private long timeBalance;
    private Day openDate;

    public Account(String name, String no, long balance, long timeBalance, Day day) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.timeBalance = timeBalance;
        openDate = new Day(day);
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

    long getTimeBalance() {
        return timeBalance;
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

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }

    void cancel() {
        deposit(timeBalance);
        timeBalance = 0;
    }

    void switchBalance(long k) {
        withdraw(k);
        timeBalance += k;
    }
}