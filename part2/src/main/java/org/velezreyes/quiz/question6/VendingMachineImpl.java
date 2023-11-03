package org.velezreyes.quiz.question6;

import java.util.ArrayList;

public class VendingMachineImpl implements VendingMachine {
  private static final int QUARTER = 25;
  private int money;
  private static ArrayList<String> drinks = new ArrayList<>();

  public static VendingMachine getInstance() {
    addDrinks();
    return new VendingMachineImpl();
  }

  private static void addDrinks() {
    drinks.add("ScottCola");
    drinks.add("KarenTea");
  }

  @Override
  public void insertQuarter() {
    money += QUARTER;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if (money <= 0) {
      throw new NotEnoughMoneyException();
    }
    if (!drinkIsKnown(name)) {
      throw new UnknownDrinkException();
    }
    return getDrink(name);
  }

  private Drink getDrink(String drinkName) throws NotEnoughMoneyException {
    if (drinkName.equals("ScottCola") && money == 75) {
      return createDrink(drinkName, true);
    } else if (drinkName.equals("KarenTea") && money == 100) {
      return createDrink(drinkName, false);
    } else {
      throw new NotEnoughMoneyException();
    }
  }

  private Drink createDrink(String name, boolean isFizzy) {
    return new Drink() {
      @Override
      public String getName() {
        return name;
      }

      @Override
      public boolean isFizzy() {
        return isFizzy;
      }
    };
  }

  private boolean drinkIsKnown(String drinkName) {
    return drinks.contains(drinkName);
  }
}
