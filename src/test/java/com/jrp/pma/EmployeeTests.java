package com.jrp.pma;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.entities.Employee;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeTests {

    @Autowired
    private EmployeeRepository repo;

    @Test
    @Rollback(value = false)
    public void testCreateEmployee(){
        Employee employee = new Employee("Terhemen", "Orban", "terhemen@gmail.com" );
        Employee savedEmployee = repo.save(employee);

        Assertions.assertNotNull(savedEmployee);
    }

    @org.junit.jupiter.api.Test
    @Rollback(value = false)
    public void testDeleteEmployee(){
        long id = 1;
        boolean isExistBeforeDelete = repo.findById(id).isPresent();
        repo.deleteById(id);

        boolean notExistAfterDelete = repo.findById(id).isPresent();

        assertTrue(isExistBeforeDelete);
        assertFalse(notExistAfterDelete);
    }
}
