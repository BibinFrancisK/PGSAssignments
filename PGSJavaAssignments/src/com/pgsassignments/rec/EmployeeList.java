//Q33

package com.pgsassignments.rec;

import java.util.*;

public class EmployeeList {
	

	List<ContractEmployee> contractEmpList = new ArrayList<ContractEmployee>();

	
	public boolean addEmployee(ContractEmployee employee) {
		if(employee instanceof ContractEmployee) {
			contractEmpList.add(employee);
			return true;}
		return false;
	}
	
	public ContractEmployee getEmployee(int employeeId) {
		for (Iterator<ContractEmployee> iterator = contractEmpList.iterator(); iterator.hasNext();) {
			ContractEmployee contractEmployee = (ContractEmployee) iterator.next();
			if(contractEmployee.getEmployeeID() == employeeId)
				return contractEmployee;				
		}
		return null;
	}
	
	public List<ContractEmployee> getTotalEmployees(){
		return contractEmpList;
	}

}
