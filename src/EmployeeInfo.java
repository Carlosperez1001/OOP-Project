/******************************************************************************
 * Last Edit: 12/2/18
 * File: EmployeeInfo.Java
 * Author: Carlos Perez
 * Class: COP 3003 - CRN 80602
 *
 * [Employee ]
 *
 ******************************************************************************/

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in;

  public EmployeeInfo() {
    in = new Scanner(System.in);
    setName();
    //Regex [lowerCase][lowerCase][lowerCase]##
    p = Pattern.compile("[A-Z][a-z]{3}\\d\\d");
    setDeptId();
    in.close();
  }

  @Override
  public String toString() {
    return "Employee Code : " + getCode() + System.getProperty("line.separator") +
        "Department Number : " + getId() + System.getProperty("line.separator");
    //System.getProperty("line.separator"); is need for break when writing to a textfile
  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    String nameEmployee = inputName();
    name = new StringBuilder(nameEmployee);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    //If name matches the regex, create var[code]
    if (checkName(name)) {
      this.code = (name.substring(0, 1) +
          name.substring(name.indexOf(" ") + 1, name.length()));
    } else {
      this.code = "guest";
    }
  }

  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    String nameEmployee = in.nextLine();
    return nameEmployee;
  }

  //Needs to check for <1 spaces and if 1 index != " "
  private boolean checkName(StringBuilder name) {
    if (name.toString().contains(" ")) {
      return true;
    }
    return false;
  }

  /*************Department*************/

  public String getDeptId() {
    System.out.print("Please enter the department ID: ");
    String employeeID = in.nextLine();
    return employeeID;
  }

  private void setDeptId() {
    deptId = getDeptId();
    validId(deptId);
  }

  private String getId() {
    return deptId;
  }

  private boolean validId(String id) {
    if (Pattern.matches(p.toString(), id)) {
      deptId = reverseString(id);

      return true;
    }
    deptId = "None01";
    return false;
  }

  public String reverseString(String id) {
    if (id.length() == 0) {
      return id;
    }

    return reverseString(id.substring(1)) + id.charAt(0);
  }
  /*Hello
   *elloH
   *lloHe
   *..
   *olleH
   */
}


