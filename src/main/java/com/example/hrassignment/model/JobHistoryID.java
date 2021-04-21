package com.example.hrassignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class JobHistoryID implements Serializable {
    @Column(name = "jobId")
    private Integer jobId;

    @Column(name = "employeeId")
    private Integer employeeId;
}

