package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class DataCreator {
  public static String[] transactionType = {"ONLINE", "POS", "ATM"};
  public static String[] creditCardType = {"SILVER", "GOLD", "PLATINUM"};
  public static long[] creditCard = new long[]{1234432112344321L, 5678876556788765L, 8900988900988900L, 1234554321123451L, 4567899876545678L,
    9876543211234567L, 3456789123498765L, 4456789123498765L, 5456789123498765L, 6456789123498765L,
    2234432112344321L, 3234432112344321L, 4234432112344321L, 5234432112344321L, 6234432112344321L};
  public static String[] customerNames = {"Amelia", "Abigail", "Aria", "Aurora", "Audrey",
    "Anna", "Aaliyah", "Ariana", "Alice", "Adeline",
    "Alexa", "Jasleen", "Kapil Arora", "Rajesh", "Li Fung"};
  public static String[] merchantNames = {"GAP", "Levis", "Arrow", "Mango", "Samsung",
    "LG Corp", "Sony", "Apple", "Khetan Ltd", "Orient",
    "Hattic LLC", "MI", "Voltas", "Johnsons", "BMW"};
  public static long[] customerAccNo = new long[]{923443211234L, 967887655678L, 990098890098L, 923455432112L, 956789987654L,
    987654321123L, 945678912349L, 945678912349L, 945678912349L, 945678912349L,
    923443211234L, 923443211234L, 923443211234L, 923443211234L, 923443211234L};
  public static long[] merchantAccNo = new long[]{8234432112L, 8678876556L, 8900988900L, 8234554321L, 8567899876L,
    8876543211L, 8456789123L, 8456789123L, 8456789123L, 8456789123L,
    8234432112L, 8234432112L, 8234432112L, 8234432112L, 8234432112344321L};

  public static void main(String[] args) {
    createTransactions();
    createEntities();
  }

  private static void createEntities() {
    FileWriter writer;
    try {
      writer = new FileWriter("/Users/rajkumar40/Downloads/Hiring/Code/venkatesh.tambi/BlownCandles/src/com/company/reference0001.txt");
      refCard(writer);
      refTrxType(writer);
      customer(writer);
      merchant(writer);
      creditCard(writer);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Successfully wrote to the file.");
  }

  private static void creditCard(FileWriter writer) {
    Random random = new Random();
    IntStream.range(0, 15).forEach(id -> {
      try {
        writer.write("CREDIT_CARD" + "," + creditCard[id] + "," + creditCardType[random.nextInt(3)] + "," + getDate() + "," + 10000 + id + "\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
  }

  public static LocalDate getDate() {
    long startEpochDay = LocalDate.of(2021, Month.JANUARY, 1).toEpochDay();
    long endEpochDay = LocalDate.of(2029, Month.DECEMBER, 31).toEpochDay();
    return LocalDate.ofEpochDay(ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay));
  }

  private static void merchant(FileWriter writer) {
    IntStream.range(0, 15).forEach(id -> {
      try {
        writer.write("MERCHANT" + "," + 100000 + id + "," + merchantNames[id] + "," + merchantAccNo[id] + "\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
  }

  private static void customer(FileWriter writer) {
    IntStream.range(0, 15).forEach(id -> {
      try {
        writer.write("CUSTOMER" + "," + 10000 + id + "," + customerNames[id] + "," + customerAccNo[id] + "\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
  }

  private static void refTrxType(FileWriter writer) {
    IntStream.range(0, 3).forEach(id -> {
      try {
        writer.write("REF_TRX_TYPE" + "," + id + "," + transactionType[id] + "\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
  }

  private static void refCard(FileWriter writer) throws IOException {
    IntStream.range(0, 3).forEach(id -> {
      try {
        writer.write("REF_CARD" + "," + id + "," + creditCardType[id] + "\n");
      } catch (IOException e) {
        e.printStackTrace();
      }
    });
  }

  private static void createTransactions() {
    IntStream.range(1000, 1010).forEach(fileId -> {
      new Thread(createData(fileId)).start();
      System.out.println("Successfully wrote to the file.");
    });
  }

  private static Runnable createData(int fileId) {
    return () -> {
      try {
        System.out.println("Starting: " + fileId);
        final FileWriter writer = new FileWriter("/Users/rajkumar40/Downloads/Hiring/Code/venkatesh.tambi/BlownCandles/src/com/company/" + fileId + ".txt");
        Random rand = new Random();
        LongStream.range(1L, 99L).forEach(value -> {
          try {
            writer.write(fileId + "" + value + "," +
              creditCard[rand.nextInt(15)] + "," +
              100000 + rand.nextInt(15) + "," +
              transactionType[rand.nextInt(3)] + "\n");
          } catch (IOException e) {
            e.printStackTrace();
          }
        });
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
      System.out.println("Finished: " + fileId);
    };
  }
}

