package com.jrp.pma.controllers;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping
    public String displayEmployees(Model model){
        List<Employee> employees = empRepo.findAll();
        model.addAttribute("employees", employees);
        return "employees/list-employees";
    }

    @RequestMapping("/new")
    public String displayEmployeeForm(Model model){
        Employee anEmployee = new Employee();
        model.addAttribute("employee", anEmployee);
        return "employees/new-employee";
    }
    @PostMapping("/save")
    public String saveEmployee(Model model, Employee employee){
        //save to database using Employee CrudRepository
        empRepo.save(employee);

        return "redirect:/employees/new";
    }
}


