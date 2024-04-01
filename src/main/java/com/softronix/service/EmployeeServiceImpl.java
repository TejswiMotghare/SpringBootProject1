
package com.softronix.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softronix.dao.EmployeeDao;
import com.softronix.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;
	
		@Override
		public String addEmployee(Employee emp) {
			String status = "";
			try
			{
				Employee.isNew = true;
				Employee employee = empDao.save(emp);
				if(employee.getEid().equals(emp.getEid()))
				{
					status = "success";
					
				}
				else
				{
					status ="failuer";
				}
						
			} 
			catch (Exception e)
			{
				status = "existed";
			}
			return status;
		}

		@Override
		public Employee searchEmployee(String eid) {
			
			Employee emp = null;
			
			Optional<Employee> employee = empDao.findById(eid); //findyId is used to search id
			//emp = employee.get(); //it used to fetch data  return employee object
			
			if(employee.isEmpty()==true)
			{
				emp = null;
			}
			else
			{
				emp = employee.get(); 
			}
			return emp;
		}

		@Override
		public String updateEmployee(Employee emp) {
			String status = "";
			try
			{
				Employee.isNew = false;
				Employee employee = empDao.save(emp);
				if(employee.getEid().equals(emp.getEid()))
				{
					status = "success";
					
				}
				else
				{
					status ="failuer";
				}
						
			} 
			catch(Exception e)
			{
				status = "notexisted";
			}
			return status;
		}
		

		@Override
		public String deleteEmployee(String eid) {
			String status = "";
			//Optional<Employee> employee = empDao.findById(eid); 
			if(Employee.isNew = true)
			{
				status = "notexisted";
			}
			else
			{
				try
				{
					empDao.deleteById(eid);
					status = "success";
					
				} 
				catch(Exception e)
				{
					status = "failuer";
					
				}
				
			}
			return status;
//			try
//			{
//				empDao.deleteById(eid);
//				status = "success";
//				
//			} 
//			catch(Exception e)
//			{
//				status = "failuer";
//				
//			}
			//return status;
		}
}
