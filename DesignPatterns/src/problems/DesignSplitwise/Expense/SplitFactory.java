package problems.DesignSplitwise.Expense;

import problems.DesignSplitwise.Expense.Split.EqualExpenseSplit;
import problems.DesignSplitwise.Expense.Split.ExpenseSplit;
import problems.DesignSplitwise.Expense.Split.PercentageExpenseSplit;
import problems.DesignSplitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
