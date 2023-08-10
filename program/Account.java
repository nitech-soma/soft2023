package program;

class Account {
    private String name;
    private String no;
    private long balance;
    private long timeBalance;
    private Day openDate;

    public Account(String name, String no) {
        this.name = name;
        this.no = no;
        this.balance = 0;
        this.timeBalance = 0;
        openDate = new Day();
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

    public void setTimeBalance(long timeBalance) {
        this.timeBalance = timeBalance;
    }

    public void setOpenDate(Day openDate) {
        this.openDate = new Day(openDate);
    }

    public void set(String name, String no, long balance, long timeBalance, Day openDay) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.timeBalance = timeBalance;
        this.openDate = new Day(openDay);
    }

    public String toString() {
        return String.format("口座名義  ：%s%n口座番号  ：%s%n預金残高  ：%d円%n定期預金額：%d円%n開設日    ：%04d年%02d月%02d日", name, no, balance,
                timeBalance, openDate.getYear(),
                openDate.getMonth(), openDate.getDate());
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        if (balance < k) {
            System.out.println("引き出す額が預金額よりも多いため、引き出せませんでした。");
        } else {
            balance -= k;
        }
    }

    void cancel() {
        deposit(timeBalance);
        timeBalance = 0;
    }

    void switchBalance(long k) {
        if (balance < k) {
            System.out.println("定期預金しようとしている額が預金額よりも多いため、定期預金できませんでした。");
        } else {
            withdraw(k);
            timeBalance += k;
        }
    }
}