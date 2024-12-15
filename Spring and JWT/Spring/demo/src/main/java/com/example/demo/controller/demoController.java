package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Employee;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/demo")
public class demoController {

//     List<Integer> LL = new ArrayList<>();
// 	@Autowired
// 	// int num =10;
// 	@GetMapping()
// 	public String generalMessage(){
// 		return "Welcome";
// 	}
// 	@GetMapping("intI")
// 	public int returnInt(){
// 		return 10;
// 	}
// 	@GetMapping("list")
// 	public List<Integer> returnList(){
// 		List<Integer> LL  = new ArrayList<>();
// 		LL.add(12);
// 		LL.add(43);
// 		LL.add(76);
// 		LL.add(84);
// 		return LL;
// 	}
// 	@GetMapping("readInput")
// 	public String getMethodName(@RequestParam("ID") String ID) {
// 		return ID;
// 	}

//     @PostMapping("AddValues")
//     public String PostMethodName(@RequestParam("ID") int valuesFromPostMethod){
//         LL.add(valuesFromPostMethod);
//         return "The value added successfully"+ LL;
//     }



//     @DeleteMapping("deleteValues")
//     public String DeleteValues(@RequestParam ("ID") int value){
//         if (LL.contains(value)) {
//             LL.remove(LL.indexOf(value));
//             return "The value deleted successfully";
//         }
//         else{
//             return "Value does not exist "+ LL + "The value you entered is " + value;
//         }
//     }

//     @PutMapping("path/{id}")
//     public String putMethodName(@PathVariable String id, @RequestBody String entity) {
//         //TODO: process PUT request
        
//         return entity;
//     }

    private List<Employee> employeeList = new ArrayList<>();

    @GetMapping("getEmp")
        public List<Employee> getEmployees() {
            System.out.println("test");
        return employeeList;
        }


    @PostMapping("addEmp")
        public String addEmployee(@RequestBody Employee emp) {
        employeeList.add(emp);
        return "Employees added successfully!";
    }

   

        @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        for (Employee emp : employeeList) {
        if (emp.getId() == id) {
            emp.setName(updatedEmployee.getName());
            emp.setSalary(updatedEmployee.getSalary());
            emp.setDepartment(updatedEmployee.getDepartment());
            return "Employee updated successfully!";
        }

        else{
            return "Employee not found!";}
    }
    return "Invalid ID";
    }

}


