package kozlovskiy.prod.controllers;

import kozlovskiy.prod.entities.Employee;
import kozlovskiy.prod.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeesController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/get/{id}")
    Employee getEmployee(@PathVariable int id) {
        return service.getEmployeeById(id);
    }
}