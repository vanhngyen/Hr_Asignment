package com.example.hrassignment.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "JobHistory")
public class JobHistory {

//    @Id
//    private Integer id;

    @EmbeddedId
    private JobHistoryID id;

    @ManyToOne
    @MapsId("jobId")
    @JoinColumn(name = "jobId")
    private Job job;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employeeId")
    private Employee employee;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;


    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

    public JobHistory(Job job, Employee employee, Date startDate, Date endDate, Department department) {
        this.id = new JobHistoryID(job.getJobId(),employee.getEmployeeId());
        this.job = job;
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.department = department;
    }
}
