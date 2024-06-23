package com.project.employee.Repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.employee.SalaryEmpose;


@Repository
public interface salary_Repository  extends CrudRepository<SalaryEmpose, Integer>{

	@Query(value= "insert into SalaryEmpose(id, employeeId, basic, house, communication, transport, medical, leave, leaveNotPay, bonous, total, month, year, emposeDate) values(:id,:employeeId,:basic,:house,:communication,:transport,:medical,:leave,:leaveNotPay,:bonous,:total,:month,:year,:emposeDate)", nativeQuery=true )
	public SalaryEmpose savealldata(@Param("id") int id,@Param("employeeId") int employeeId, @Param("basic") Double basic,@Param("house") Double house,@Param("communication") Double communication,@Param("transport") Double transport,@Param("medical") Double medical,@Param("leave") int leave, @Param("leaveNotPay")Double leaveNotPay, @Param("bonous")Double bonous, @Param("total") Double total,@Param("month")String month,@Param("year") int year,@Param("emposeDate") Date emposeDate );
	
	

}
