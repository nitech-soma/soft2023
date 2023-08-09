class Main {

    public static void main(String[] args) {
        Day day = new Day(1999, 11, 11);
        Account a = new Account("西田宗馬", "123456");

        System.out.println(a);

        Day p = new Day(2002, 3, 3);

        a.setName("山田太郎");
        a.setNo("234567");
        a.setBalance(100);
        a.setOpenDate(p);

        String n = a.getName();
        String num = a.getNo();
        long z = a.getBalance();
        Day q = a.getOpenDate();

        Account b = new Account(n, num);

        System.out.println(b);

        a.set("鈴木雄平", "345678", 1000, 0, day);

        System.out.println(a);
    }
}