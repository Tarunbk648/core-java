package com.xworks.trainingcenter.trainingcenter;

public class TrainingCenterDescription {
    private String centerId;
    private String centerName;
    private String trainerName;
    private String courseName;
    private int courseDuration;

    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }


    public int getCourseDuration() {
        return courseDuration;
    }

    public String getCenterId() {
        return centerId;
    }

    public String getCenterName() {
        return centerName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTrainerName() {
        return trainerName;
    }
}
