package com.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lop quan ly cac giao dich ngan hang co ban.
 */
public class BankSystem {

  private static final Logger LOGGER = LoggerFactory.getLogger(BankSystem.class);
  private double balance;

  /**
   * Khoi tao tai khoan voi so du ban dau.
   *
   * @param initialBalance so du ban dau
   */
  public BankSystem(double initialBalance) {
    this.balance = initialBalance;
    LOGGER.info("Khoi tao tai khoan voi so du: {}", initialBalance);
  }

  /**
   * Thuc hien giao dich rut tien.
   *
   * @param amount so tien can rut
   */
  public void withdraw(double amount) {
    LOGGER.debug("Yeu cau rut so tien: {}", amount);
    if (amount <= 0) {
      LOGGER.warn("So tien rut khong hop le: {}", amount);
      throw new IllegalArgumentException("So tien rut phai lon hon 0");
    }
    if (amount > balance) {
      LOGGER.error("Giao dich that bai: So du hien tai ({}) khong du de rut ({})", balance, amount);
      throw new IllegalStateException("Khong du so du");
    }
    balance -= amount;
    LOGGER.info("Rut thanh cong: {}. So du con lai: {}", amount, balance);
  }

  public double getBalance() {
    return balance;
  }
}