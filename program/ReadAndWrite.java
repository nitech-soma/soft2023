package program;

import java.io.*;

class ReadAndWrite {
    private String filename;

    ReadAndWrite(String no) {
        setFilename(no);
    }

    public void setFilename(String no) {
        this.filename = "./data/" + no + ".txt";
    }

    public void save(Account account) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));

            writer.println(account.getName());
            writer.println(account.getNo());
            writer.printf("%d%n", account.getBalance());
            writer.printf("%d%n", account.getTimeBalance());
            writer.printf("%d%n", account.getOpenDate().getYear());
            writer.printf("%d%n", account.getOpenDate().getMonth());
            writer.printf("%d%n", account.getOpenDate().getDate());

            reader.close();
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public Account load() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            Account account = new Account(null, null);
            String line;

            line = reader.readLine();
            account.setName(line);
            line = reader.readLine();
            account.setNo(line);
            line = reader.readLine();
            account.setBalance(Integer.parseInt(line));
            line = reader.readLine();
            account.setTimeBalance(Integer.parseInt(line));
            line = reader.readLine();
            int year = Integer.parseInt(line);
            line = reader.readLine();
            int month = Integer.parseInt(line);
            line = reader.readLine();
            int date = Integer.parseInt(line);
            account.setOpenDate(new Day(year, month, date));

            reader.close();

            return account;
        } catch (FileNotFoundException e) {
            System.out.println("指定されたアカウントは存在しません。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        return null;
    }

    public boolean find() {
        File file = new File(filename);

        return file.exists();
    }
}
