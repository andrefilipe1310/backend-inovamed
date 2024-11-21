package com.inovamed.clinical_study_system.model.application;

public record ApplicationRequestDTO( Long patientCode ,int researchCode, String message,
                                     StatusApplication statusApplication) {
}
