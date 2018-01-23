/**
 * All rights reserved. Copyright (c) Ixxus Ltd 2016
 */
package co.ixxus.uk.delegate_creation;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import co.ixxus.uk.delegate_creation.departments.OtherDepartment;
import co.ixxus.uk.delegate_creation.departments.RecruitmentDepartment;
import co.ixxus.uk.delegate_creation.departments.SalesDepartment;
import co.ixxus.uk.delegate_creation.departments.SupportDepartment;

/**
 * @author Luis Miguel Cruz
 *
 */
public class DepartmentTest {

    @Test
    public void testOtherDepartment() {
        final Company company = new Company("Company 1", new OtherDepartment());

        final String department = company.getDepartment().departmentType();
        assertNotNull("Error, department doesn't exist", department);

        assertTrue(department.equals("Other department"));
    }

    @Test
    public void testRecruitmentDepartment() {
        final Company company = new Company("Company 2", new RecruitmentDepartment());

        final String department = company.getDepartment().departmentType();
        assertNotNull("Error, department doesn't exist", department);

        assertTrue(department.equals("Recruitment department"));
    }

    @Test
    public void testSalesDepartment() {
        final Company company = new Company("Company 3", new SalesDepartment());

        final String department = company.getDepartment().departmentType();
        assertNotNull("Error, department doesn't exist", department);

        assertTrue(department.equals("Sales department"));
    }

    @Test
    public void testSupportDepartment() {
        final Company company = new Company("Company 4", new SupportDepartment());

        final String department = company.getDepartment().departmentType();
        assertNotNull("Error, department doesn't exist", department);

        assertTrue(department.equals("Support department"));
    }
}
