// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesse.testsystems.slim.tables;

import fitnesse.slim.instructions.ImportInstruction;
import fitnesse.slim.instructions.Instruction;
import fitnesse.testsystems.slim.SlimTestContext;
import fitnesse.testsystems.slim.Table;
import fitnesse.testsystems.slim.results.TestResult;

import java.util.ArrayList;
import java.util.List;

public class ImportTable extends SlimTable {
  public ImportTable(Table table, String id, SlimTestContext testContext) {
    super(table, id, testContext);
  }

  protected String getTableType() {
    return "import";
  }

  public List<Assertion> getAssertions() throws SyntaxError {
    int rows = table.getRowCount();
    List<Assertion> instructions = new ArrayList<Assertion>(rows);
    if (rows < 2)
      throw new SyntaxError("Import tables must have at least two rows.");

    for (int row = 1; row < rows; row++) {
      String importString = table.getCellContents(0, row);
      if (importString.length() > 0) {
        Instruction importInstruction = new ImportInstruction(makeInstructionTag(), importString);
        instructions.add(makeAssertion(importInstruction, new ImportExpectation(0, row)));
      }
    }
    return instructions;
  }

  public class ImportExpectation extends RowExpectation {

    public ImportExpectation(int col, int row) {
      super(col, row);
    }

    @Override
    protected TestResult createEvaluationMessage(String actual, String expected) {
      if ("OK".equalsIgnoreCase(actual))
        return TestResult.ok(expected);
      else
        return TestResult.error(String.format("Unknown import message: %s", actual));
    }
  }
}
