package com.xworks.trainingcenter.validator;

import com.xworks.trainingcenter.trainingcenter.TrainingCenterDescription;

public class TrainingCenterValidator {
    TrainingCenterDescription trainingCenterDescription;

    public boolean addTrainingCenterData(TrainingCenterDescription trainingCenterDescription){
        boolean isDataAdded=false;
        boolean isCenterIdValid=false;
        boolean isCenterNameValid=false;
        boolean isTrainerNameValid=false;
        boolean isCourseNameValid=false;
        boolean isDurationValid=false;

        String centerId= trainingCenterDescription.getCenterId();
        if(centerId!=null && !centerId.isEmpty()){
            isCenterIdValid=true;
        }

        String centerName= trainingCenterDescription.getCenterName();
        if(centerName!=null && !centerName.isEmpty()){
            isCenterNameValid=true;
        }

        String trainerName= trainingCenterDescription.getTrainerName();
        if(trainerName!=null && !trainerName.isEmpty()){
            isTrainerNameValid=true;
        }

        String courseName=trainingCenterDescription.getCourseName();
        if(courseName!=null && !centerName.isEmpty()){
            isCourseNameValid=true;
        }

        int courseDuration= trainingCenterDescription.getCourseDuration();
        if(courseDuration>0){
            isDurationValid=true;
        }

        if(isCenterIdValid==true  && isCenterNameValid==true  && isTrainerNameValid==true  &&   isCourseNameValid==true  &&  isDurationValid==true  ){
            this.trainingCenterDescription=trainingCenterDescription;
            isDataAdded=true;
        }
        return isDataAdded;

    }

    public void getDetails(){
        System.out.println("Center Id:" +trainingCenterDescription.getCenterId());
        System.out.println("Center Name:" +trainingCenterDescription.getCenterName());
        System.out.println("Trainer Name:" + trainingCenterDescription.getTrainerName());
        System.out.println("Course Name:" +trainingCenterDescription.getCourseName());
        System.out.println("Course Duration:" +trainingCenterDescription.getCourseDuration());
    }
}
