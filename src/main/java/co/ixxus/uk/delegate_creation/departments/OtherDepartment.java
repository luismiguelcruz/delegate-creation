/**
 * All rights reserved. Copyright (c) Ixxus Ltd 2016
 */
package co.ixxus.uk.delegate_creation.departments;

import org.springframework.stereotype.Component;

import co.ixxus.uk.delegate_creation.Department;

/**
 * @author Luis Miguel Cruz
 *
 */
@Component
public class OtherDepartment implements Department {

    @Override
    public String departmentType() {
        return "Other department";
    }

    /* (non-Javadoc)
     * @see co.ixxus.uk.delegate_creation.Department#getKey()
     */
    @Override
    public String getKey() {
        return "other";
    }
}
