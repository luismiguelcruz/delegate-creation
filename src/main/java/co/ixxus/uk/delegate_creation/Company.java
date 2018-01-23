/**
 * All rights reserved.
 * Copyright (c) Ixxus Ltd 2016
 */
package co.ixxus.uk.delegate_creation;

/**
 * @author Luis Miguel Cruz
 *
 */
public class Company {
    private String name;
    private Department department;

    public Company(final String name, final Department department) {
        this.name = name;
        this.department = department;
    }


    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(final Department department) {
        this.department = department;
    }
}
