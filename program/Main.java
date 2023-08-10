package program;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        ReadAndWrite rw = new ReadAndWrite("");

        System.out.print("口座番号を入力してください：");
        String no = stdIn.nextLine();
        rw.setFilename(no);
        if (rw.find()) {
            Account account = rw.load();
            System.out.println("ようこそ" + account.getName() + "さん！");

            System.out.print("[預入...1/引き出し...2/定期預金...3]：");
            int x = stdIn.nextInt();
            switch (x) {
                case 1:
                    System.out.print("預ける金額を入力してください：");
                    long y = stdIn.nextLong();
                    account.deposit(y);
                    System.out.println("預金残高：" + account.getBalance() + "円");
                    break;
                case 2:
                    System.out.print("引き出す金額を入力してください：");
                    long z = stdIn.nextLong();
                    account.withdraw(z);
                    System.out.println("預金残高：" + account.getBalance() + "円");
                    break;
                case 3:
                    System.out.print("[キャンセル...1/追加...2]：");
                    int w = stdIn.nextInt();
                    if (w == 1) {
                        account.cancel();
                        System.out.println("預金残高：" + account.getBalance() + "円");
                    } else if (w == 2) {
                        System.out.print("預ける金額を入力してください：");
                        long m = stdIn.nextLong();
                        account.switchBalance(m);
                        System.out.println("預金残高：" + account.getBalance() + "円");
                    }
                default:
                    System.out.println("1から3の整数を入力してください。");
            }

            rw.save(account);
        } else {
            System.out.println("新しい口座を作成します。");
            System.out.print("氏名を入力してください：");
            String name = stdIn.nextLine();
            Account account = new Account(name, no);

            rw.save(account);
        }

        System.out.println("お疲れさまでした。");
    }
}