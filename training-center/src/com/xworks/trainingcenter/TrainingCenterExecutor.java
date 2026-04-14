package com.xworks.trainingcenter;

import com.xworks.trainingcenter.trainingcenter.TrainingCenterDescription;
import com.xworks.trainingcenter.validator.TrainingCenterValidator;

public class TrainingCenterExecutor {
    public static void main(String[] args) {
        TrainingCenterValidator trainingCenterValidator= new TrainingCenterValidator();
        TrainingCenterDescription trainingCenterDescription = new TrainingCenterDescription();
        trainingCenterDescription.setCenterId("SG22ROM");
        trainingCenterDescription.setCenterName("X-Workz");
        trainingCenterDescription.setTrainerName("Devraj singh chouhan");
        trainingCenterDescription.setCourseName("java full stack");
        trainingCenterDescription.setCourseDuration(4);

        boolean ref=trainingCenterValidator.addTrainingCenterData(trainingCenterDescription);
        System.out.println("IS Training center data added and validated:"  +ref);

        trainingCenterValidator.getDetails();
    }
}
