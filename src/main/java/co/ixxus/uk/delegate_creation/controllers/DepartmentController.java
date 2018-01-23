/**
 * All rights reserved.
 * Copyright (c) Ixxus Ltd 2016
 */
package co.ixxus.uk.delegate_creation.controllers;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.ixxus.uk.delegate_creation.Company;
import co.ixxus.uk.delegate_creation.Department;

/**
 * @author Luis Miguel Cruz
 *
 */
@Controller
public class DepartmentController {

    private final Map<String, Department> departmentTypes;

    @Autowired
    public DepartmentController(final List<Department> departments) {
        departmentTypes = new HashMap<String, Department>();
        for (final Department department: departments) {
            departmentTypes.put(department.getKey(), department);
        }
        //departments.forEach(d -> departmentTypes.put(d.getKey(), d));
    }

    @RequestMapping("/department")
    public String department(@RequestParam(value="type", required=false, defaultValue="other") final String type, final Model model) {
        if(departmentTypes.containsKey(type)) {
            final Company company = new Company("Company 1", departmentTypes.get(type));
            model.addAttribute("type", "Department Created: " + company.getDepartment().departmentType());
        } else {
            model.addAttribute("type", "Department key not found");
        }


        return "department";
    }



}
